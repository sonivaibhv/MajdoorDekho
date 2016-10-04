package com.md.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.md.model.Login;
import com.md.model.Signup;

import com.md.serviceImpl.SignupServiceImpl;
import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = "/WEB-INF/view/signup.jsp";

        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username=request.getParameter("username");
		 String email=request.getParameter("email");
		  String password=request.getParameter("password");
		  String conform=request.getParameter("conform");
		  String address=request.getParameter("address");
		  
		  
		  Signup signup1=new Signup(username,email,password,conform,address);
		  Login login=new Login(email, password);
		  SignupServiceImpl serviceImpl=new SignupServiceImpl();
		  String signup2=serviceImpl.adduser(signup1,login);
		  if(signup2!=null){
			  System.out.println("Record Inserted");
			  RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
			  rd.forward(request, response);
		  }
		  else
		  {
			  System.out.println("Not Inserted");
			  RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/signup.jsp");
			  rd.forward(request, response);
		  }
	}

}
