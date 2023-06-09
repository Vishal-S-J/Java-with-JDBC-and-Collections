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
        boolean yesOrNo = false;

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
                case 2 -> {
                    Student student = new Student();
                    System.out.println("Enter your first name :: ");
                    String fname = sc.next();
                    System.out.println("Enter your last name :: ");
                    String lname = sc.next();
                    System.out.println("Enter your age :: ");
                    int age = sc.nextInt();
                    System.out.println("Enter your gender :: ");
                    String gender = sc.next();
                    System.out.println("Enter your branch :: ");
                    String branch = sc.next();

                    student.setS_FNAME(fname);
                    student.setS_LNAME(lname);
                    student.setS_AGE(age);
                    student.setS_GENDER(gender);
                    student.setS_BRANCH(branch);

                    yesOrNo = studentDao.insert(student);
                    if(yesOrNo) {
                        System.out.println("ERROR IN ADDING STUDENT");
                    } else {
                        System.out.println("STUDENT DATA ADDED");
                    }
                }
                case 3 -> {
                    System.out.println("Enter your id to delete :: ");
                    int id = sc.nextInt();
                    yesOrNo = studentDao.delete(id);

                    if (yesOrNo) {
                        System.out.println("ERROR IN DELETING STUDENT");
                    } else {
                        System.out.println("STUDENT DELETED");
                    }
                }
                case 4 -> {
                    System.out.println("Enter id to update");
                    int id = sc.nextInt();
                    System.out.println("What do you want to update :: ");
                    System.out.println("1. First Name\n2. Last Name\n3. Age\n4. Gender\n5. Branch");
                    int upToDate = sc.nextInt();
                    switch (upToDate) {
                        case 1 -> {
                            System.out.println("Enter your first name to update");
                            String fname = sc.next();
                            yesOrNo = studentDao.update(id, fname, "S_FNAME");
                        }
                        case 2 -> {
                            System.out.println("Enter your last name to update");
                            String lname = sc.next();
                            yesOrNo = studentDao.update(id, lname, "S_LNAME");
                        }
                        case 3 -> {
                            System.out.println("Enter your age to update");
                            String age = sc.next();
                            yesOrNo = studentDao.update(id, age, "S_AGE");
                        }
                        case 4 -> {
                            System.out.println("Enter your gender to update");
                            String gender = sc.next();
                            yesOrNo = studentDao.update(id, gender, "S_GENDER");
                        }
                        case 5 -> {
                            System.out.println("Enter your branch to update");
                            String branch = sc.next();
                            yesOrNo = studentDao.update(id, branch, "S_BRANCH");
                        }
                        default -> System.out.println("ENTER VALID OPTION (EXITING)");
                    }
                    if(yesOrNo) {
                        System.out.println("ERROR IN UPDATING EMPLOYEE");
                    } else {
                        System.out.println("EMPLOYEE UPDATED");
                    }
                }
            }
            System.out.println("DO YOU WANT TO CONTINUE (Y/N) :: ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}
