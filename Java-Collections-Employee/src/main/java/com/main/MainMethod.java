package com.main;

import com.collections.EmployeeList;
import com.dao.EmployeeDao;
import com.model.Employee;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
    public void defaultList(List<Employee> employees) {
        Employee employee1 = new Employee(12, "RAJESH");
        Employee employee2 = new Employee(14, "VIRAJ");

        employees.add(employee1);
        employees.add(employee2);
    }

    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(12);
        employee.setName("RAJESH");

        employees.add(employee);

        employeeList.setEmployees(employees);

        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.display();
    }
}
