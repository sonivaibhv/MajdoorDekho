package com.md.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;

import com.md.model.Login;
import com.md.model.Signup;

import com.md.serviceImpl.LoginServiceImpl;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String destination = "/WEB-INF/view/profile.jsp";
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("logout"))
		{
		Login login=(Login)session.getAttribute("key");
		System.out.println(login.getEmail());	
		session.invalidate();
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp");
	    rd.forward(request, response);
		}else{	
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/view/login.jsp");
	        rd.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 String email=request.getParameter("email");
			  String password=request.getParameter("password");
			  
			  Login login= new Login(email, password);
			  HttpSession session=request.getSession(true);
				session.setAttribute("key", login);
			 LoginServiceImpl serviceImpl=new LoginServiceImpl();

				Object flag=serviceImpl.checkUser(email,password);
				System.out.println("asdf");
				if(flag!=null){
					
					RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/profile.jsp");
					rd.forward(request, response);			
				}
				else
				{
					RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
					rd.forward(request, response);
				}
		}
}
