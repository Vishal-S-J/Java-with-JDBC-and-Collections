package com.main;

import com.bean.Employee;
import com.collection.ListEmployee;
import com.dao.EmployeeDao;
import com.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Employee> employeeList;
    public static void defaultList() {
        Employee employee1 = new Employee(1, "Marta", "Fran", "Kauffman", "CEO", "Female", 80000000, 67);
        Employee employee2 = new Employee(2, "David", null, "Crane", "Principal", "Male", 70000000, 66);
        Employee employee3 = new Employee(3, "Rachel", "Karen", "Green", "HR", "Female", 800000, 24);
        Employee employee4 = new Employee(1, "Chandler", "Muriel", "Bing", "Developer", "Male", 6000000, 26);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        ListEmployee.setEmployeeList(employeeList);
    }

    public static void main(String[] args) {
        employeeList = ListEmployee.getEmployeeList();
        EmployeeDao employeeDao = new EmployeeDao(ListEmployee.getEmployeeList());
        EmployeeView employeeView = new EmployeeView();

        employeeList = employeeDao.displayAll(employeeList);
        for (Employee employee : employeeList) {
            employeeView.printEmployeeDetails(employee);
        }
    }
}
