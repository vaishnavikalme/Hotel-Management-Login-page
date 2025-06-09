package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/acd")
public class AddCustomerDetailServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
	HttpSession session=req.getSession(false);	
	if(session==null) {
		req.setAttribute("msg","Customer Session expired");
		req.getRequestDispatcher("CustomerLogin.html").forward(req,res);
		}
	else {
		AddCustomerDetailBean acdbean=new AddCustomerDetailBean();
		acdbean.setCustomer_RoomNo(req.getParameter("no"));
		acdbean.setCustomer_Name(req.getParameter("name"));
	    acdbean.setCustomer_Price(req.getParameter("price"));
	    acdbean.setCustomer_Contact(req.getParameter("contact"));
	    acdbean.setCustomer_Rent(req.getParameter("rent"));
	
	  int rowCount=new AddCustomerDetailDAO().insertCustomer(acdbean);
	  if(rowCount==0) {
		  throw new ServletException("Data not inserted");
		  
	  }
	  else {
		  req.setAttribute("msg","Data inserted");
	      req.getRequestDispatcher("AddCustomer.jsp").forward(req, res);
	  }
	}
	
	
}
	}
