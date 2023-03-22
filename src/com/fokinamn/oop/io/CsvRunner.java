package com.fokinamn.oop.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.nio.file.StandardOpenOption.*;

/**
 * Даны два файла в формате CSV.
 * CSV (Comma-Separated Values) файл - это обычный текстовый файл, где через запятую (может использоваться и любой другой символ) перечислены значения. Также может быть в первой строчке таких файлов заголовок с названием колонок.
 * Формат первого файла items-price.csv:
 * <p>
 * ID,PRICE
 * 1,9.98
 * 2,25.05
 * 3,16.45
 * <p>
 * Формат второго файла items-name.csv:
 * <p>
 * ID,NAME,DESCRIPTION
 * 1,Шарф,Теплый зимний шарф красного цвета
 * 2,Шапка,Вязаная зеленая шапка
 * 3,Ботинки,Осенние ботинки на толстой подошве
 * <p>
 * Задача:
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 * <p>
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */
public class CsvRunner {
    public static void main(String[] args) throws IOException {
        Path namePath = Path.of("resources", "items-name.csv");
        Path pricePath = Path.of("resources", "items-price.csv");

        Map<Integer, Double> mapFromCsv = CsvUtil.getMapFromCsv(pricePath);
        List<Item> objectFromCsv = CsvUtil.getObjectFromCsv(namePath);
        List<String> errorList = findPrice(mapFromCsv, objectFromCsv);

        Path resultPath = Path.of("resources", "result.csv");
        Files.write(resultPath, CsvUtil.itemResult(objectFromCsv), CREATE);

        if (errorList.size() > 0) {
            Path errorPath = Path.of("resources", "error.csv");
            Files.write(errorPath, errorList, CREATE);
        }
    }

    private static List<String> findPrice(Map<Integer, Double> mapFromCsv, List<Item> objectFromCsv) {
        List<String> errorList = new ArrayList<>();
        for (Item item : objectFromCsv) {
            if (mapFromCsv.containsKey(item.getId())) {
                Double price = mapFromCsv.get(item.getId());
                item.setPrice(price);
            } else {
                errorList.add(item.getId().toString());
            }
        }
        return errorList;
    }
}
