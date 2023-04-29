package com.collection;

import com.bean.Employee;

import java.util.List;

public class ListEmployee {
    private static List<Employee> employeeList;

    public static void setEmployeeList(List<Employee> employeeList) {
        ListEmployee.employeeList = employeeList;
    }

    public static List<Employee> getEmployeeList() {
        if(employeeList == null)
        {
            System.out.println("LIST EMPTY");
            return null;
        } else {
            return employeeList;
        }
    }
}
