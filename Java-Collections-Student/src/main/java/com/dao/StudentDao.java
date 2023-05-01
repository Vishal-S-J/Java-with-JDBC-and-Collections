package com.dao;

import com.bean.Student;
import com.collection.ListStudent;
import com.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    StudentView studentView = new StudentView();
    List<Student> studentList;

    public StudentDao(List<Student> studentList) {
        this.studentList = studentList;
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

    public void insert(int id, String name) {
        Student student = new Student(id, name);
        int count = 0;

        if(studentList.isEmpty()) {
            studentList.add(student);
        } else {
            for (Student stu : studentList) {
                if(stu.getId() == id) {
                    count++;
                    break;
                } else {
                    count = 0;
                }
            }
        }

        if(count == 0) {
            studentList.add(student);
        } else {
            System.out.println("STUDENT ALREADY EXISTS");
        }
    }
    public void delete(int id) {
        if(studentList.isEmpty()) {
            System.out.println("STUDENT LIST IS EMPTY");
        } else {
            for(Student stu : studentList) {
                if(stu.getId() == id) {
                    studentList.remove(stu);
                    System.out.println("STUDENT DELETED");
                    break;
                }
            }
        }
    }
    public void update() {}
}
