package com.view;

import com.bean.Employee;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("================================================");
        System.out.println("                     EMPLOYEE                   ");
        System.out.println("================================================");
        System.out.println("EMPLOYEE ID............."+employee.getEId());
        System.out.println("EMPLOYEE FIRST NAME....."+employee.getEFirstName());
        System.out.println("EMPLOYEE MIDDLE NAME...."+employee.getEMiddleName());
        System.out.println("EMPLOYEE LAST NAME......"+employee.getELastName());
        System.out.println("EMPLOYEE POST..........."+employee.getEPost());
        System.out.println("EMPLOYEE GENDER........."+employee.getEGender());
        System.out.println("EMPLOYEE SALARY........."+employee.getESalary());
        System.out.println("EMPLOYEE AGE............"+employee.getEAge());
    }
}
