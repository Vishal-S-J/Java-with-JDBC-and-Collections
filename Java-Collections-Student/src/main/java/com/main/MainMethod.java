package com.main;

import com.bean.Student;
import com.dao.StudentDao;
import com.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
    static List<Student> studentList = new ArrayList<>();

    public List<Student> studentDefaultList() {
        Student student1 = new Student(12, "Vishal");
        Student student2 = new Student(15, "Rahul");
        Student student3 = new Student(18, "Pooja");
        Student student4 = new Student(20, "Ashwin");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        return studentList;
    }

    public static void main(String[] args) {
        MainMethod mainMethod = new MainMethod();

        StudentDao studentDao = new StudentDao(mainMethod.studentDefaultList());//don't change

        studentDao.display();
    }
}
