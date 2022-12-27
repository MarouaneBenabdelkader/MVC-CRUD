package org.pfe.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.pfe.models.Student;

import java.io.IOException;

@WebServlet("/update-student")
public class UpdateStudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("updateStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cne = request.getParameter("cne");
        String name = request.getParameter("name");

        Student student = new Student();
        student.setName(name);
        student.setCne(cne);

        Student.update(student);

        response.sendRedirect("students");
    }
}
