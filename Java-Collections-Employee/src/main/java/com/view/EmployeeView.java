package com.view;

import com.model.Employee;

import java.util.List;

public class EmployeeView {
    public void displayAllEmployees(Employee employee) {
        System.out.printf("| %04d | %-10s |%n", employee.getId(), employee.getName());
    }
}
