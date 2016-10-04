package com.md.util;

import javax.servlet.ServletException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateConnection {
	
	private static SessionFactory sessionFactory;
	
	 static public SessionFactory init() {
	    	Configuration configuration=new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	       return sessionFactory=configuration.buildSessionFactory();
	    }


}
