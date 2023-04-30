package com.main;

import com.collections.EmployeeList;
import com.dao.EmployeeDao;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMethod {
    public void defaultList(List<Employee> employees) {
        Employee employee1 = new Employee(12, "RAJESH");
        Employee employee2 = new Employee(14, "VIRAJ");

        employees.add(employee1);
        employees.add(employee2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        EmployeeDao employeeDao = new EmployeeDao(employees);

        Employee employee = new Employee();
        employee.setId(12);
        employee.setName("RAJESH");
        Employee employee1 = new Employee(17, "RAVI");

        employees.add(employee);
        employees.add(employee1);

        employeeList.setEmployees(employees);
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
                employeeDao.insert(employee, id, name);
                employeeDao.display();
                break;
            case 3:
                System.out.println("Enter id y want to delete");
                id = sc.nextInt();
                employeeDao.delete(id);

//                int id = sc.nextInt();
                employeeDao.display();
                break;
            default:
                System.out.println("DEFAULT CASE");
                break;
        }
    }
}
