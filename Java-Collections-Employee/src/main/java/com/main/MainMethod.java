package com.main;

import com.collections.EmployeeList;
import com.dao.EmployeeDao;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();
        EmployeeDao employeeDao = new EmployeeDao(employeeList.getEmployees());

        long id;

        int choice = 2;
        switch (choice) {
            case 1:
                employeeDao.display();
                break;
            case 2:
                System.out.println("Enter employee id");
                id = sc.nextInt();
                System.out.println("Enter employee name");
                String name = sc.next();
                employeeDao.insert(id, name);
                employeeDao.display();
                break;
            case 3:
                System.out.println("Enter id y want to delete");
                id = sc.nextInt();
                employeeDao.delete(id);
                employeeDao.display();
                break;
            case 4:
                System.out.println("UPDATE LIST");
                break;
            default:
                System.out.println("DEFAULT CASE");
                break;
        }
    }
}
