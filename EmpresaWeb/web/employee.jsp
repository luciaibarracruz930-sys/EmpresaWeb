<%-- 
    Document   : employee
    Created on : Oct 3, 2026, 4:33:20 PM
    Author     : lucia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="my.web.employee.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Employees</title>
    </head>
    <body>

        <%

            List<Employee> employeeList =
                    (List<Employee>) request.getAttribute("employeeList");

        %>

        <h1>Employees</h1>

        <ul>

            <% for(Employee employee : employeeList) { %>

                <li>
                    Id: <%= employee.getId() %>
                    Name: <%= employee.getName() %>
                    Department: <%= employee.getDepartment() %>
                </li>

            <% } %>

        </ul>
        
    </body>
</html>
