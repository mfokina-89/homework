package com.fokinamn.oop.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * 1. Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * 2. Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * 3. Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ivan", "Ivanov", 3, List.of(6, 7, 2, 7)),
                new Student("Petr", "Petrov", 1, List.of(4, 7, 1)),
                new Student("Sveta", "Svetikova", 4, List.of(6, 4, 6, 2)),
                new Student("Igor", "Dedov", 2, List.of(3, 4, 6, 8)),
                new Student("Katya", "Ivanova", 3, List.of(5, 9)),
                new Student("Anna", "Luneva", 1, List.of(2, 7)),
                new Student("Dima", "Orlov", 2, List.of(9, 4, 6, 8)),
                new Student("Misha", "SoKolov", 3, List.of(3, 4, 9, 5))
        );

        Map<Integer, Double> courseAndAverageGrade = students.stream()
                .filter(student -> student.getGrade().size() > 3)
                .collect(groupingBy(Student::getCourse, averagingDouble(Student::getAverageGrade)));
        System.out.println("Average grade for each course " + courseAndAverageGrade);

        Map<Integer, List<String>> courseAndFullName = students.stream()
                .sorted(comparing(Student::getFullName))
                .collect(groupingBy(Student::getCourse,
                        mapping(Student::getFullName, toList())));
        System.out.println("List of students on the course " + courseAndFullName);

        Map<Integer, AverageGradeAndStudents> studentsMap = students.stream()
                .sorted(comparing(Student::getFullName))
                .collect(groupingBy(Student::getCourse, collectingAndThen(toList(), list -> {
                    List<String> studentFullName = list.stream()
                            .map(Student::getFullName)
                            .collect(toList());
                    Double averageGrade = list.stream()
                            .collect(averagingDouble(Student::getAverageGrade));
                    return new AverageGradeAndStudents(studentFullName, averageGrade);
                })));
        System.out.println("List of students with their average grade " + studentsMap);
    }
}
