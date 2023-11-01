package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.StudentClass.getAverageGrade;

@Getter
@Setter
@ToString

public class Student implements Comparable<Student> {

    private String name;
    private List<Double> grades;
    private Double avgGrade;
    private String specialty;


    public Student(String name, String specialty) {
        this.name = name;

        this.grades = new ArrayList<>();
        grades.add(new Random().nextDouble(3.0, 8.0));
        grades.add(new Random().nextDouble(3.0, 8.0));
        grades.add(new Random().nextDouble(3.0, 8.0));
        grades.add(new Random().nextDouble(3.0, 8.0));
        grades.add(new Random().nextDouble(3.0, 8.0));
        this.specialty = specialty;
        this.avgGrade = getAverageGrade(grades);
    }

    @Override
    public int compareTo(Student o) {
        return this.getAvgGrade().compareTo(o.getAvgGrade());
    }
}

