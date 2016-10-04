package com.md.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.md.controller.HomeConroller;
import com.md.model.Login;
import com.md.util.CreateConnection;

public class LoginDao {

	//Connection connection;

	SessionFactory sessionFactory;
	public LoginDao() {
			sessionFactory=CreateConnection.init();
	}
	Session getSession(){
		return sessionFactory.openSession();
	}
	public Object checkUser(String email, String password) {
		
	Object user= (Object)getSession().createCriteria("select * from db.user where email='"+ email+"' and password='"+password+"'");
		return user;
		
	}


	

	
	
	
}
