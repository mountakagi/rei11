package rei11;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Page1to2Controller
 */
@WebServlet("/Page1to2Controller")
public class Page1to2Controller extends HttpServlet {




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		try{
	HttpSession session=request.getSession();
	ArrayList<Order> orderlist=new ArrayList<Order>();
	String [] ninzu =request.getParameterValues("ninzu");
	String [] seminar =request.getParameterValues("seminar");
	for(int i=0;i<ninzu.length;i++){
		if(Integer.parseInt(ninzu[i]) !=0){
			Order order=new Order();
			order.setSeminar(seminar[i]);
			order.setOrderninzu(Integer.parseInt(ninzu[i]));


			orderlist.add(order);
				}
		}
		session.setAttribute("orderlist", orderlist);
	}catch(Exception ex){
		ex.printStackTrace();

	}


		ServletContext context =getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/jsp/page2.jsp");
		rd.forward(request, response);


	}

}
