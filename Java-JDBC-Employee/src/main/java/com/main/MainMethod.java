package com.main;

import com.DBController.DBConnect;
import com.beanModel.Employee;
import com.dao.EmployeeDao;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        EmployeeDao employeeDao = new EmployeeDao(DBConnect.getConnection());
        EmployeeView employeeView = new EmployeeView();
        System.out.println("-------------------------------------------------------");
        System.out.printf("| %-4s | %-10s | %-10s | %-4s | %-10s |%n", "E_ID", "E_FNAME", "E_LNAME", "E_AGE", "E_POST");
        System.out.println("-------------------------------------------------------");
        employees = employeeDao.display(employees);
        for (Employee employee : employees) {
            employeeView.printEmployeeDetails(employee);
        }
        System.out.println("-------------------------------------------------------");
    }
}
