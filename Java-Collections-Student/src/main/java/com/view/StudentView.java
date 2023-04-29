package com.view;

import com.bean.Student;

public class StudentView {
    public void printAllDetails(Student student) {
        System.out.printf("| %04d | %-20s |%n", student.getId(), student.getName());
    }
}
