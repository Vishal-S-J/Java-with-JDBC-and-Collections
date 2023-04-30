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

    public void display(List<Employee> employees) {
        System.out.printf("---------------------%n");
        System.out.printf("| %4s | %-10s |%n", "ID", "NAME");
        System.out.printf("---------------------%n");
        for(Employee employee : employees) {
            employeeView.displayAllEmployees(employee);
        }
        System.out.printf("---------------------%n");
    }

    public void insert() {}

    public void delete() {}

    public void update() {}
}
