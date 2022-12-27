<%@ page import="java.util.ArrayList" %>
<%@ page import="org.pfe.models.Student" %><%--
  Created by IntelliJ IDEA.
  User: Marouane
  Date: 12/27/2022
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
  <h1>Students list</h1>
  <ul>
    <%
      ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("students");

      for (Student student: students) {
    %>
    <li> <%= student.getCne() %> | <%= student.getName() %> </li>
    <%
      }
    %>
  </ul>
</body>
</html>
