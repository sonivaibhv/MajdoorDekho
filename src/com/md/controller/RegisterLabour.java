package com.md.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.md.model.Register;

import com.md.serviceImpl.RegisterServiceImpl;
import com.md.serviceImpl.SignupServiceImpl;

/**
 * Servlet implementation class RegisterLabour
 */
@WebServlet("/RegisterLabour")
public class RegisterLabour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterLabour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = "/WEB-INF/view/register.jsp";

        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String firstname=request.getParameter("Firstname");
		 String Lastname=request.getParameter("Lastname");
		  String DateOfBirth =request.getParameter("Date Of Birth");
		  String gender=request.getParameter("gender");
		  String Mobileno=request.getParameter("mobile no");
		  String email=request.getParameter("email");
		  String Address=request.getParameter("Address");
		  String city=request.getParameter("city");
		  String state=request.getParameter("state");
		  String worktype=request.getParameter("work-type");
		  String year=request.getParameter("year");
		 
		  
		  Register register = new Register(firstname, Lastname, DateOfBirth, gender, Mobileno, email, Address, city, state, worktype, year);
		 
		  RegisterServiceImpl serviceImpl=new RegisterServiceImpl();
		  Register register1=serviceImpl.adduser(register);
		  if(register1==null){
			  System.out.println("Record Inserted");
			  String destination = "/WEB-INF/view/register.jsp";
			  request.setAttribute("msg", "Register Labour");
		     RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		     rd.forward(request, response);

		     
		  }
		  else
		  {
			  System.out.println("Not Inserted");
			  String destination = "/WEB-INF/view/register.jsp";
			  request.setAttribute("msg", "Not Registerd");
		     RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		     rd.forward(request, response);

		  }
	}
}

