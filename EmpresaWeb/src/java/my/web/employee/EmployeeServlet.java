
package my.web.employee;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import my.web.database.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        try
        {
            Database db = new Database();

            Connection conn = db.getConnection();

            PreparedStatement pstat =
                    conn.prepareStatement("SELECT * FROM Empleados;");

            ResultSet rs = pstat.executeQuery();

            List<Employee> employeeList = new ArrayList<>();

            while(rs.next()){

                employeeList.add(
                    new Employee(
                        rs.getInt("Id"),
                        rs.getString("Nombre"),
                        rs.getString("Departamento")
                    )
                );
            }

            request.setAttribute("employeeList", employeeList);

            request.getRequestDispatcher("/employee.jsp")
                   .forward(request, response);
        }
        catch (SQLException ex)
        {
             
       throw new ServletException("Error al conectar o consultar MySQL: " + ex.getMessage(), ex);

        }
    }
}

