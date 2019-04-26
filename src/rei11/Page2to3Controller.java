package rei11;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page1to2Controller
 */
@WebServlet("/Page2to3Controller")
public class Page2to3Controller extends HttpServlet {



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		ServletContext context =getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/jsp/page3.jsp");
		rd.forward(request, response);



	}

}
