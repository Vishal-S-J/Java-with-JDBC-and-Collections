package com.dao;

import com.collections.EmployeeList;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    EmployeeList employeeList = new EmployeeList();
    EmployeeView employeeView = new EmployeeView();

    public EmployeeDao(List<Employee> employees) {
        employeeList.setEmployees(employees);
    }

    public void display() {
        if(employeeList.getEmployees() != null) {
            System.out.printf("---------------------%n");
            System.out.printf("| %4s | %-10s |%n", "ID", "NAME");
            System.out.printf("---------------------%n");
            for (Employee employee : employeeList.getEmployees()) {
                employeeView.displayAllEmployees(employee);
            }
            System.out.printf("---------------------%n");
        } else {
            System.out.println("EMPLOYEE LIST IS EMPTY");
        }
    }

    public void insert(long id, String name) {
        Employee employee = new Employee(id, name);
        employeeList.getEmployees().add(employee);
        System.out.println("EMPLOYEE ADDED");
        System.out.println("ERROR IN ADDING EMPLOYEE DETAILS");
    }

    public void delete(long id) {
        for (Employee employee : employeeList.getEmployees()) {
            if(employee.getId() == id) {
                employeeList.getEmployees().remove(id);
                break;
            }
        }
        System.out.println("EMPLOYEE ID NOT FOUND");
    }

    public void update() {}
}
