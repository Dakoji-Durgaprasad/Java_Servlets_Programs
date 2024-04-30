package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DashBoardServlet")
public class DashBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DashBoardServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
          
        HttpSession hs = request.getSession();  			// creating session
        																													
        String n = (String)hs.getAttribute("uname");  		// getting sessions
        String pn = (String)hs.getAttribute("phnum");  
        String ps = (String)hs.getAttribute("password");  
        								
//        hs.removeAttribute("password");
//        response.getWriter().write("Hello, "+ n +"<br>");  			// printing values
//        response.getWriter().write("Your Number: "+ pn +"<br>");
//        response.getWriter().write("Your Password: "+ ps +"<br>");
        
        String str = "<!DOCTYPE html>\r\n"
        		+ "<html>\r\n"
        		+ "<head>\r\n"
        		+ "<meta charset=\"ISO-8859-1\">\r\n"
        		+ "<title>Dash Board</title>\r\n"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "	<h1>Welcome to dash board, "+n+ "</h1>\r\n"
        		+ "	\r\n"
        		+ "	<a href=\"http://localhost:8080/Session/AboutServlet\">About Us</a>\r\n"
        		+ "	<a href=\"http://localhost:8080/Session/LogoutServlet\">Log Out</a>\r\n"
        		+ "	\r\n"
        		+ "</body>\r\n"
        		+ "</html>";
        
       response.getWriter().write(str);
        
       
	}

}
