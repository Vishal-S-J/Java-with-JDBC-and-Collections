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
        EmployeeDao employeeDao = new EmployeeDao(employees);

        Employee employee = new Employee();
        employee.setId(12);
        employee.setName("RAJESH");
        Employee employee1 = new Employee(17, "RAVI");

        employees.add(employee);
        employees.add(employee1);

        employeeList.setEmployees(employees);


        int choice = 1;
        switch (choice) {
            case 1:
                employeeDao.display(employees);
                break;
            default:
                System.out.println("DEFAULT CASE");
                break;
        }
    }
}
