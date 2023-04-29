package com.dao;

import com.bean.Student;
import com.collection.ListStudent;
import com.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    ListStudent listStudent = new ListStudent();
    StudentView studentView = new StudentView();
    List<Student> studentList;

    public StudentDao(List<Student> studentList) {
        listStudent.setStudentList(studentList);
        this.studentList = studentList;
        studentList = listStudent.getStudentList();
    }

    public void display() {
        System.out.println("DISPLAY");
        System.out.printf("-------------------------------%n");
        System.out.printf("| %-4s | %-20s |%n", "ID", "NAME");
        System.out.printf("-------------------------------%n");

        for (Student student : studentList){
            studentView.printAllDetails(student);
        }
        System.out.printf("--------------------------------%n");
    }

    public void insert() {}
    public void delete() {}
    public void update() {}
}
