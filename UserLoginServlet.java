package pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ulog")
public class UserLoginServlet extends HttpServlet{
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
UserLoginDAO uDAO=new UserLoginDAO();
Userbean bean=uDAO.checkUserLogin(req.getParameter("uname"), req.getParameter("pwd"));

if(bean==null) {
	req.setAttribute("msg","Invalid User Credential!!!");
   	req.getRequestDispatcher("UserLoginFailed.jsp").forward(req, res);

}
else {
	HttpSession session=req.getSession();
	session.setAttribute("ubean", bean);
	req.getRequestDispatcher("UserHome.jsp").forward(req, res);;
}
}




}
