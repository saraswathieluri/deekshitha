package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAO {
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students(name, age, course) VALUES (?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
