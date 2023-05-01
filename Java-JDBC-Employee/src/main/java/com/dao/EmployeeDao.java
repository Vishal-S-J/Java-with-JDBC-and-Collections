package com.dao;

import java.sql.Connection;

public class EmployeeDao {
    private final Connection connection;

    public EmployeeDao (Connection connection) {
        this.connection = connection;
    }


}
