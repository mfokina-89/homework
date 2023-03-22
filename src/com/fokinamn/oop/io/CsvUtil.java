package com.fokinamn.oop.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class CsvUtil {
    private CsvUtil() {
    }

    public static Map<Integer, Double> getMapFromCsv(Path path) throws IOException {
        Stream<String> lines = Files.lines(path);
        return lines
                .skip(1)
                .map(item -> item.split(","))
                .collect(Collectors.toMap(item -> Integer.parseInt(item[0]), item -> Double.valueOf(item[1])));
    }

    public static List<Item> getObjectFromCsv(Path namePath) throws IOException {
        Stream<String> lines = Files.lines(namePath);
        return lines
                .skip(1)
                .map(item -> item.split(","))
                .map(item -> new Item(Integer.parseInt(item[0]), item[1], 0.0))
                .toList();
    }

    public static List<String> itemResult(List<Item> items) {
        return items.stream()
                .map(item -> item.getId() + "," + item.getName() + "," + item.getPrice())
                .collect(Collectors.toList());
    }
}
