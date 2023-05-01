package com.collection;

import com.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private List<Student> studentList;

    public ListStudent() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
