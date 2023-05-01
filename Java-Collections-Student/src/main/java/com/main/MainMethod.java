package com.main;

import com.bean.Student;
import com.collection.ListStudent;
import com.dao.StudentDao;
import com.view.StudentView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMethod {

    public static List<Student> studentDefaultList(List<Student> students) {
        Student student1 = new Student(12, "Vishal");
        Student student2 = new Student(15, "Rahul");
        Student student3 = new Student(18, "Pooja");
        Student student4 = new Student(20, "Ashwin");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        return students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListStudent students = new ListStudent();
        students.setStudentList(studentDefaultList(students.getStudentList()));
        StudentDao studentDao = new StudentDao(students.getStudentList());
        String name;
        char ch;
        int cho, id;

        do {
            System.out.println("1. DISPLAY\n2. INSERT\n3. DELETE\n4. UPDATE\nENTER YOUR CHOICE :: ");
            cho = sc.nextInt();
            switch(cho) {
                case 1 :
                    studentDao.display();
                    break;
                case 2 :
                    System.out.println("Enter student id : ");
                    id = sc.nextInt();
                    System.out.println("Enter Student name : ");
                    name = sc.next();
                    studentDao.insert(id, name);
                    break;
                case 3:
                    studentDao.delete();
                    break;
                case 4:
                    studentDao.update();
                    break;
                default:
                    System.out.println("SELECT APPROPRIATE OPTION");
                    break;
            }
            System.out.println("DO YOU WANT TO CONTINUE (Y/N) :: ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
