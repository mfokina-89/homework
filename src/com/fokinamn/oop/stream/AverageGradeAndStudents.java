package com.fokinamn.oop.stream;

import java.util.List;

public class AverageGradeAndStudents {
    private List<String> students;
    private double averageGrade;

    public AverageGradeAndStudents(List<String> students, double averageGrade) {
        this.students = students;
        this.averageGrade = averageGrade;
    }

    public List<String> getStudents() {
        return students;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Students: " + students +
                ", their average grade = " + averageGrade;
    }
}
