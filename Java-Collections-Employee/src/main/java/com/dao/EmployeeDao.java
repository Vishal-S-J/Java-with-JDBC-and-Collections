package com.dao;

import com.collections.EmployeeList;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    EmployeeView employeeView = new EmployeeView();
    List<Employee> employees;

    public EmployeeDao(List<Employee> employees) {
        this.employees = employees;
    }

    public void display() {
        if(employees.isEmpty()) {
            System.out.println("EMPLOYEE LIST IS EMPTY");
        } else {
            System.out.printf("---------------------%n");
            System.out.printf("| %4s | %-10s |%n", "ID", "NAME");
            System.out.printf("---------------------%n");
            for (Employee employee : employees) {
                employeeView.displayAllEmployees(employee);
            }
            System.out.printf("---------------------%n");
        }
    }

    public void insert(long id, String name) {
        Employee employee = new Employee(id, name);
        int count = 0;
        if (employees.isEmpty()) {
            employees.add(employee);
            count++;
        } else {
            for (Employee emp : employees) {
                if(emp.getId() == id) {
                    count++;
                    break;
                } else {
                    count = 0;
                }
            }
        }

        if(count == 0) {
            employees.add(employee);
        } else {
            System.out.println("EMPLOYEE ALREADY EXIST");
        }
    }

    public void delete(long id) {
        int count = 0;
        if (employees.isEmpty()) {
//            count++;
            System.out.println("EMPLOYEE LIST IS EMPTY");
        } else {
            for (Employee emp : employees) {
                if(emp.getId() == id) {
//                    count++;
                    employees.remove(emp.getId());
                    System.out.println("EMPLOYEE DELETED");
                    break;
                } else {
                    System.out.println("EMPLOYEE NOT FOUND");
//                    count = 0;
                }
            }
        }
    }

    public void update() {}
}
