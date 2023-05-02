package com.dao;

import com.beanModel.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {
    private final Connection connection;

    public EmployeeDao (Connection connection) {
        this.connection = connection;
    }

    public List<Employee> display(List<Employee> employees) {
        Employee employee = null;
        try {
            String sql = "SELECT * FROM EMPLOYEE";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                employee = new Employee();
                employee.setE_Id(resultSet.getInt("E_ID"));
                employee.setE_FName(resultSet.getString("E_FNAME"));
                employee.setE_LName(resultSet.getString("E_LNAME"));
                employee.setE_Age(resultSet.getInt("E_AGE"));
                employee.setE_Post(resultSet.getString("E_POST"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
