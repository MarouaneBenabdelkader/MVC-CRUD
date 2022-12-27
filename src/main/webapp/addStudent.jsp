<%--
  Created by IntelliJ IDEA.
  User: Marouane
  Date: 12/27/2022
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add student</title>
</head>
<body>
  <form method="post" action="add-student">
    <div>
      <label>Cne :</label>
      <input type="text" name="cne">
    </div>
    <div>
      <label>Name :</label>
      <input type="text" name="name">
    </div>
    <button type="submit">Add</button>
  </form>
</body>
</html>
