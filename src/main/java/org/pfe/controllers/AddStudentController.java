package org.pfe.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.pfe.models.Student;

import java.io.IOException;

@WebServlet("/add-student")
public class AddStudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student();
        String cne = request.getParameter("cne");
        String name = request.getParameter("name");

        student.setCne(cne);
        student.setName(name);

        Student.save(student);

        response.sendRedirect("students");
    }
}
