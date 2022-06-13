package com.vast.testass1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		int  EmpId = Integer.parseInt(request.getParameter("Emp_id"));
		String EmpName = request.getParameter("name");
		int EmpAge = Integer.parseInt(request.getParameter("age"));
		String EmpDesignations = request.getParameter("designation");
		int EmpPhoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));

		int EmpSalary = Integer.parseInt(request.getParameter("salary"));

		Employee e = new Employee();
		e.setId(id);
		e.setEmp_id(EmpId);
		e.setName(EmpName);
		e.setAge(EmpAge);
		e.setDesignation(EmpDesignations);
		e.setPhoneNumber(EmpPhoneNumber);
		e.setSalary(EmpSalary);

		int status = 0;
		try {
			status = EmployeeDao.insertEmployee(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("Employee.html").include(request, response);
		} else {
			out.println("Sorry! unable to save record");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
