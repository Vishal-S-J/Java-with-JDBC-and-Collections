package com.view;

import com.beanModel.Employee;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.printf("| %4d | %10s | %10s | %3d | %10s |", employee.getE_Id(), employee.getE_FName(), employee.getE_LName(), employee.getE_Age(), employee.getE_Post());
    }
}
