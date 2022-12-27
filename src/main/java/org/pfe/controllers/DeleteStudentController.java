package org.pfe.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.pfe.models.Student;

import java.io.IOException;

@WebServlet("/delete-student")
public class DeleteStudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("deleteStudent.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cne = request.getParameter("cne");
        Student student = Student.getByCne(cne);

        if (student != null) Student.delete(student);

        response.sendRedirect("students");
    }
}
