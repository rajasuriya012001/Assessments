package Assesment2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Withdraw
 */
@WebServlet("/Withdraw")
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int basic=10000;
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Withdraw() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<body>\n"
				+ "<form>\n"
				+ "withdrawAmount:<input type=\"text\" name=\"amt\"/><br><br>\n"
				+ "<input type=\"submit\" value=\"withdraw\" formaction=\"Withdraw\"/>\n"
				+ "</form>\n"
				+ "</body>");
		out.print("basic "+basic);
		String amtt=request.getParameter("amt");
		int a=Integer.parseInt(amtt);
		if(basic >=a) {
			out.print("your withdraw amt is "+a);
		}
		else {
			
			out.print("invalid amt.....");
	
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
