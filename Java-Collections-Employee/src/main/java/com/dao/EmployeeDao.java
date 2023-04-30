package com.dao;

import com.collections.EmployeeList;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    EmployeeList employeeList = new EmployeeList();
    EmployeeView employeeView = new EmployeeView();
    List<Employee> employees;

    public EmployeeDao(List<Employee> employees) {
        this.employees = employees;
        employeeList.setEmployees(employees);
    }

    public void display() {
        System.out.printf("---------------------%n");
        System.out.printf("| %4s | %-10s |%n", "ID", "NAME");
        System.out.printf("---------------------%n");
        for(Employee employee : employees) {
            employeeView.displayAllEmployees(employee);
        }
        System.out.printf("---------------------%n");
    }

    public void insert(Employee employee, long id, String name) {
        employee = new Employee(id, name);
        employees.add(employee);
    }

    public void delete(long id) {
        for (Employee employee : employees) {
            if(employee.getId() == id) {
                employees.remove(id);
                break;
            }
            System.out.println("EMPLOYEE ID NOT FOUND");
        }
    }

    public void update() {}
}
