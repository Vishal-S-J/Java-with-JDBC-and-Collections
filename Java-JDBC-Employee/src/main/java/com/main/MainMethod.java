package com.main;

import com.DBController.DBConnect;
import com.beanModel.Employee;
import com.dao.EmployeeDao;
import com.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees;
        EmployeeDao employeeDao = new EmployeeDao(DBConnect.getConnection());
        EmployeeView employeeView = new EmployeeView();
        char choice;
        int option;
        boolean yesOrNo = false;

        do {
            System.out.println("1. DISPLAY\n2. INSERT\n3. DELETE\n4. UPDATE\nENTER YOUR CHOICE :: ");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("-------------------------------------------------------");
                    System.out.printf("| %-4s | %-10s | %-10s | %-4s | %-10s |%n", "E_ID", "E_FNAME", "E_LNAME", "E_AGE", "E_POST");
                    System.out.println("-------------------------------------------------------");
                    employees = employeeDao.display();
                    for (Employee employee : employees) {
                        employeeView.printEmployeeDetails(employee);
                    }
                    System.out.println("-------------------------------------------------------");
                }
                case 2 -> {
                    System.out.println("Enter first name :: ");
                    String fname = sc.next();
                    System.out.println("Enter last name :: ");
                    String lname = sc.next();
                    System.out.println("Enter your age :: ");
                    int age = sc.nextInt();
                    System.out.println("Enter your post :: ");
                    String post = sc.next();
                    Employee employee = new Employee(fname, lname, age, post);
                    yesOrNo = employeeDao.insert(employee);
                    if(yesOrNo) {
                        System.out.println("ERROR IN EMPLOYEE INSERTION");
                    } else {
                        System.out.println("EMPLOYEE INSERTED");
                    }
                }
                case 3 -> {
                    System.out.println("Enter id to Delete :: ");
                    int id = sc.nextInt();
                    yesOrNo = employeeDao.delete(id);
                    if(yesOrNo) {
                        System.out.println("ERROR IN DELETING EMPLOYEE");
                    } else {
                        System.out.println("EMPLOYEE DELETED");
                    }
                }
                case 4 -> {
                    System.out.println("Enter your id to update");
                    int id = sc.nextInt();
                    System.out.println("WHAT DO YOU WANT TO UPDATE");
                    System.out.println("1. First Name\n2. Last Name\n3. Age\n4. Post");
                    int upToDate = sc.nextInt();
                    switch (upToDate) {
                        case 1 -> {
                            System.out.println("Enter your new first name to update");
                            String fname = sc.next();
                            yesOrNo = employeeDao.update(id, fname, "E_FNAME");
                        }
                        case 2 -> {
                            System.out.println("Enter your new last name to update");
                            String lname = sc.next();
                            yesOrNo = employeeDao.update(id, lname, "E_LNAME");
                        }
                        case 3 -> {
                            System.out.println("Enter your new age to update");
                            String age = sc.next();
                            yesOrNo = employeeDao.update(id, age, "E_AGE");
                        }
                        case 4 -> {
                            System.out.println("Enter your new post to update");
                            String post = sc.next();
                            yesOrNo = employeeDao.update(id, post, "E_POST");
                        }
                        default -> System.out.println("Enter Valid choice (exiting) :: ");
                    }
                    if(yesOrNo) {
                        System.out.println("ERROR IN UPDATING EMPLOYEE");
                    } else {
                        System.out.println("EMPLOYEE UPDATED");
                    }
                }
                default -> System.out.println("SELECT APPROPRIATE CHOICE :: ");
            }

            System.out.println("DO YOU WANT TO CONTINUE (Y/N) :: ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}
