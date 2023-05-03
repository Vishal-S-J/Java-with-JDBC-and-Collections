package com.dao;

import com.beanModel.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private final Connection connection;

    public StudentDao(Connection connection) {
        this.connection = connection;
    }

    public List<Student> display() {
        List<Student> students = new ArrayList<>();
        Student student;

        try {
            String sql = "SELECT * FROM STUDENT";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                student = new Student();
                student.setS_ID(resultSet.getInt("S_ID"));
                student.setS_FNAME(resultSet.getString("S_FNAME"));
                student.setS_LNAME(resultSet.getString("S_LNAME"));
                student.setS_AGE(resultSet.getInt("S_AGE"));
                student.setS_GENDER(resultSet.getString("S_GENDER"));
                student.setS_BRANCH(resultSet.getString("S_BRANCH"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
