package com.dao;

import com.collections.EmployeeList;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    List<Employee> employees = new ArrayList<Employee>();
    EmployeeList employeeList = new EmployeeList();
    EmployeeView employeeView = new EmployeeView();

    public EmployeeDao() {
        employeeList.setEmployees(employees);
    }

    public void display() {
        System.out.println("Hello im in display");
        for (Employee employee : employees) {
            System.out.println(employee.getId);
        }
    }

    public void insert() {}

    public void delete() {}

    public void update() {}
}
