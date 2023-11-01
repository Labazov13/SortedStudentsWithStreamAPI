package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    public static List<Student> classStudent() {
        List<Student> studentList = new ArrayList<>();
        Student st1 = new Student("Petr", "IT");
        Student st2 = new Student("Ivan", "Manager");
        Student st3 = new Student("Alex", "Builder");
        Student st4 = new Student("Sergey", "IT");
        Student st5 = new Student("Peter", "Car Driver");
        Student st6 = new Student("Sam", "IT");
        Student st7 = new Student("Vasiliy", "Machine Learning");
        Student st8 = new Student("Stepan", "Military");
        Student st9 = new Student("Matwei", "IT");
        Student st10 = new Student("Anton", "IT");
        Student st11 = new Student("Grisha", "IT");
        Student st12 = new Student("Ilya", "IT");
        Student st13 = new Student("Olga", "IT");
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        studentList.add(st8);
        studentList.add(st9);
        studentList.add(st10);
        studentList.add(st11);
        studentList.add(st12);
        studentList.add(st13);
        return studentList;
    }

    public static double getAverageGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }
}
