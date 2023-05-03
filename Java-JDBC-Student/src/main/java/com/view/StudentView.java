package com.view;

import com.beanModel.Student;

public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.printf("| %05d | %10s | %10s |   %3d | %10s | %10s |%n", student.getS_ID(), student.getS_FNAME(), student.getS_LNAME(), student.getS_AGE(), student.getS_GENDER(), student.getS_BRANCH());
    }
}
