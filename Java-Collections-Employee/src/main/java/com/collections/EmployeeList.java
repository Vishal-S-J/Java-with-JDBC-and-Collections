package com.collections;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void defaultList() {
        Employee employee1 = new Employee(44, "LEO");
        Employee employee2 = new Employee(77, "RAJESH");
        Employee employee3 = new Employee(55, "PRIYA");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
