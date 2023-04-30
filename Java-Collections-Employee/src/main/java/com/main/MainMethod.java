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
        char ch;
        int cho;

        do {
            System.out.println("SELECT FROM LIST \n1. DISPLAY\n2. INSERT\n3. DELETE\n4. UPDATE\nENTER YOUR CHOICE :: ");
            cho = sc.nextInt();
            switch (cho) {
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
                    System.out.println("Enter id you want to delete");
                    id = sc.nextInt();
                    employeeDao.delete(id);
                    employeeDao.display();
                    break;
                case 4:
                    System.out.println("UPDATE LIST");
                    break;
                default:
                    System.out.println("SELECT APPROPRIATE CHOICE");
                    break;
            }
            System.out.println("Do you want to continue (Y/N) :: ");
            ch = sc.next().charAt(0);
        } while(ch == 'Y' || ch == 'y');
    }
}
