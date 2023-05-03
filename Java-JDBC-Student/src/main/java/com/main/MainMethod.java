package com.main;

import com.DBController.DBConnect;
import com.beanModel.Student;
import com.dao.StudentDao;
import com.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        List<Student> studentList;
        Scanner sc = new Scanner(System.in);
        StudentDao studentDao = new StudentDao(DBConnect.getConnection());
        StudentView studentView = new StudentView();
        char choice;
        int option;

        do {
            System.out.println("1. DISPLAY\n2. INSERT\n3. DELETE\n4. UPDATE\nEnter your choice :: ");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.printf("| %5s | %10s | %10s | %3s | %10s | %10s |%n", "S_ID", "S_FNAME", "S_LNAME", "S_AGE", "S_GENDER", "S_BRANCH");
                    System.out.println("---------------------------------------------------------------------");
                    studentList = studentDao.display();
                    for (Student student : studentList) {
                        studentView.printStudentDetails(student);
                    }
                    System.out.println("---------------------------------------------------------------------");
                }
            }
            System.out.println("DO YOU WANT TO CONTINUE (Y/N) :: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
