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
                    System.out.println("INSERT");
                    System.out.println("Enter first name :: ");
                    String fname = sc.next();
                    System.out.println("Enter last name :: ");
                    String lname = sc.next();
                    System.out.println("Enter your age :: ");
                    int age = sc.nextInt();
                    System.out.println("Enter your post :: ");
                    String post = sc.next();
                    Employee employee = new Employee(fname, lname, age, post);
                    employeeDao.insert(employee);
                }
                case 3 -> System.out.println("DELETE");
                case 4 -> System.out.println("UPDATE");
                default -> System.out.println("SELECT APPROPRIATE CHOICE :: ");
            }

            System.out.println("DO YOU WANT TO CONTINUE (Y/N) :: ");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
}
