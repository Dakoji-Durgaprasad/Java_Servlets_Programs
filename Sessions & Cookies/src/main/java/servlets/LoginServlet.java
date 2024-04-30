package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
 
		String name = request.getParameter("uname");   
		String phno = request.getParameter("phno");  
		String pswd = request.getParameter("pswd");  
          
        HttpSession hs = request.getSession();   // creating session 
        hs.setAttribute("uname",name);  		 // setting attributes
        hs.setAttribute("phnum", phno);
        hs.setAttribute("password",pswd);
		
        hs.removeAttribute("password");			 // removing attribute
         
        Cookie cname = new Cookie("UserName",name);		// creating cookies 
        response.addCookie(cname);						// adding cookies
        
        Cookie cphno = new Cookie("PhoneNumber",phno);
        response.addCookie(cphno);
        
		RequestDispatcher rd = request.getRequestDispatcher("/DashBoardServlet");
		
		rd.forward(request, response);
	}

}
