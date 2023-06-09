package com.dao;

import com.model.Employee;
import com.view.EmployeeView;

import java.util.List;

public class EmployeeDao {
    EmployeeView employeeView = new EmployeeView();
    List<Employee> employees;

    public EmployeeDao(List<Employee> employees) {
        this.employees = employees;
    }

    public void display() {
        if(employees.isEmpty()) {
            System.out.println("EMPLOYEE LIST IS EMPTY");
        } else {
            System.out.printf("---------------------%n");
            System.out.printf("| %4s | %-10s |%n", "ID", "NAME");
            System.out.printf("---------------------%n");
            for (Employee employee : employees) {
                employeeView.displayAllEmployees(employee);
            }
            System.out.printf("---------------------%n");
        }
    }

    public void insert(long id, String name) {
        Employee employee = new Employee(id, name);
        int count = 0;
        if (employees.isEmpty()) {
            employees.add(employee);
            count++;
        } else {
            for (Employee emp : employees) {
                if(emp.getId() == id) {
                    count++;
                    break;
                } else {
                    count = 0;
                }
            }
        }

        if(count == 0) {
            employees.add(employee);
        } else {
            System.out.println("EMPLOYEE ALREADY EXIST");
        }
    }

    public void delete(long id) {
        if (employees.isEmpty()) {
            System.out.println("EMPLOYEE LIST IS EMPTY");
        } else {
            for (Employee emp : employees) {
                if(emp.getId() == id) {
                    employees.remove(emp);
                    System.out.println("EMPLOYEE DELETED");
                    break;
                } else {
                    System.out.println("EMPLOYEE NOT FOUND");
                }
            }
        }
    }

    public void update(long id, String name) {
        if (employees.isEmpty()) {
            System.out.println("EMPLOYEE LIST IS EMPTY");
        } else {
            for (Employee emp : employees) {
                if(emp.getId() == id) {
                    emp.setName(name);
                    System.out.println("EMPLOYEE UPDATED");
                    break;
                } else {
                    System.out.println("ERROR IN UPDATING NAME");
                }
            }
        }
    }
}
