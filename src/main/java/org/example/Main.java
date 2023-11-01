package org.example;

import java.util.List;

import static org.example.StudentClass.classStudent;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = classStudent();
        studentList.stream()
                .filter(student -> student.getSpecialty().equals("IT"))
                .filter(student -> student.getAvgGrade() >= 4.5)
                .limit(5)
                .sorted((o1, o2) -> o2.getAvgGrade().compareTo(o1.getAvgGrade()))
                .forEach(student -> System.out.println(student));
    }
}