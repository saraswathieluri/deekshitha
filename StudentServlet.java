package com.student.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.student.dao.StudentDAO;
import com.student.model.Student;

@WebServlet("/addStudent")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int age;
        try {
            age = Integer.parseInt(request.getParameter("age"));
        } catch (NumberFormatException e) {
            response.sendRedirect("error.jsp");
            return;
        }
        String course = request.getParameter("course");

        Student student = new Student(name, age, course);
        boolean result = new StudentDAO().addStudent(student);

        response.sendRedirect(result ? "success.jsp" : "error.jsp");
    }
}
