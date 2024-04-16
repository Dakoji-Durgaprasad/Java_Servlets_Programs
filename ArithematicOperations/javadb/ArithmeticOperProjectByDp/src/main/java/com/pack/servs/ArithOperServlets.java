package com.pack.servs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(asyncSupported = true, urlPatterns = { "/ArithOperServlets" })
public class ArithOperServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ArithOperServlets() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result;
		System.out.println(request.getParameter("num1"));
		System.out.println(request.getParameter("num2"));
		System.out.println(request.getParameter("OperSymb"));
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));
		char oper = request.getParameter("OperSymb").charAt(0);
		
		if(oper=='+') {
			 response.getWriter().write("Hello \n The final result is : "+(n1 + n2));
		}
		else if(oper=='-') {
			 response.getWriter().write("Hello \n The final result is : "+(n1 - n2));
		}
		else if(oper=='*') {
			 response.getWriter().write("Hello \n The final result is : "+(n1 * n2));
		}
		else if(oper=='/') {
			 response.getWriter().write("Hello \n The final result is : "+(n1 / n2));
		}
		else if(oper=='%') {
			response.getWriter().write("Hello \n The final result is : "+(n1 % n2));
		}
		else {
			System.out.println("Enter a valid Operator!! ");
		}

//		response.getWriter().write("Hello \n The final result is : "+result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
