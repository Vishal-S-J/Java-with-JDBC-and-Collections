package com.dao;

import com.beanModel.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private final Connection connection;
    boolean yesOrNo = false;

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

    public boolean insert(Student student) {
        try {
            Statement statement = connection.createStatement();
            String sql = "insert into student(S_FNAME, S_LNAME, S_AGE, S_GENDER, S_BRANCH) values ('"+student.getS_FNAME()+"','"+student.getS_LNAME()+"','"+student.getS_AGE()+"','"+student.getS_GENDER()+"','"+student.getS_BRANCH()+"')";
            yesOrNo = statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return yesOrNo;
    }
}
