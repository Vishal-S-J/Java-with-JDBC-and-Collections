package com.dao;

import com.bean.Employee;

import java.util.List;

public class EmployeeDao {
    private final List<Employee> employeeList;

    public EmployeeDao(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> displayAll(List<Employee> employeeList) {
        Employee employee = null;
        if(employeeList != null) {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
        return employeeList;
    }
}
