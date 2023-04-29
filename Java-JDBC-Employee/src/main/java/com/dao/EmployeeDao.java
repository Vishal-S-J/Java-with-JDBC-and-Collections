package com.dao;

import com.bean.Employee;

import java.util.List;

public class EmployeeDao {
    private final List<Employee> employeeList;

    public EmployeeDao(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> displayAll(List<Employee> employeeList) {
        return employeeList;
    }

    public List<Employee> insert(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }
}
