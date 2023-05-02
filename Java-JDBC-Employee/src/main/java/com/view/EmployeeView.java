package com.view;

import com.beanModel.Employee;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.printf("| %04d | %-10s | %-10s |   %03d | %-10s |%n", employee.getE_Id(), employee.getE_FName(), employee.getE_LName(), employee.getE_Age(), employee.getE_Post());
    }
}
