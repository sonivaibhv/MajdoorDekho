package com.md.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.md.model.Login;
import com.md.model.Profile;
import com.md.model.Signup;
import com.md.serviceImpl.ProfileServiceImpl;
import com.md.serviceImpl.SignupServiceImpl;

@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String destination = "/WEB-INF/view/profile.jsp";
		
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
	        rd.forward(request, response);	
		
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("type");
		 String nkarigar=request.getParameter("nkarigar");
		  String nbaildar=request.getParameter("nbaildar");
		  String conplace=request.getParameter("conplace");
		  
		  Profile profile = new Profile(type, nkarigar, nbaildar, conplace);
		  ProfileServiceImpl serviceImpl=new ProfileServiceImpl();
		  String profile1=serviceImpl.adduser(profile);
		  if(profile1!=null){
			  System.out.println("Record Inserted");
			  request.setAttribute("name", profile1);
			  RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/view/profile.jsp");
			  dispatcher.forward(request, response);
		  }
		  else
		  {
			  System.out.println("Not Inserted");
			  RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/view/profile.jsp");
			  dispatcher.forward(request, response);
		  }
	}

}
