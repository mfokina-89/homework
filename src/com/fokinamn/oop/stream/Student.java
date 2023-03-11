package com.fokinamn.oop.stream;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private List<Integer> grade;

    public Student(String firstName, String lastName, int course, List<Integer> grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }

    public double getAverageGrade() {
        return grade.stream().mapToDouble(value -> value).average().orElse(0);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return firstName + " "
                + lastName +
                ", course " + course +
                ", grade " + grade;
    }
}
