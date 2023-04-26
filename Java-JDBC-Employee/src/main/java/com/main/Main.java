package com.main;

import com.bean.Employee;
import com.collection.ListEmployee;
import com.dao.EmployeeDao;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        EmployeeDao employeeDao = new EmployeeDao(ListEmployee.getEmployeeList());
        EmployeeView employeeView = new EmployeeView();

        employeeList = employeeDao.displayAll(employeeList);
        for (Employee employee : employeeList) {
            employeeView.printEmployeeDetails(employee);
        }
    }
}
