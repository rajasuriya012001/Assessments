package Assesment2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankValue
 */
@WebServlet("/BankValue")
public class BankValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BankValue() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		
		String Number=request.getParameter("number");
		String Pin=request.getParameter("pin");
		
		//out.print("Wellcome "+Number);
		if(Number.length()==6){
			out.print("u r card valid");
			if(Pin.length()==4) {
				out.print("u r pin valid");
				response.sendRedirect("http://localhost:8080/Assesment1/Withdraw");
			}
		}
			else
			{
				out.print("u entered invalid card Number or wrong password");
			}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
