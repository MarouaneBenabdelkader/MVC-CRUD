package org.pfe.controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.pfe.models.Student;

import java.io.IOException;

@WebServlet("/students")
public class ListStudentsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", Student.getAll());
        request.getRequestDispatcher("students.jsp").forward(request, response);
    }

}
