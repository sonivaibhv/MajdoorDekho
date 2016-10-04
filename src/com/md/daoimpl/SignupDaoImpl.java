package com.md.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.md.model.Login;
import com.md.model.Signup;

public class SignupDaoImpl {
	
	
		Session getSession(){
			
			SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
			return factory.openSession();
		}
	public String adduser(Signup signup1,Login login) {
	
	
	Session session=getSession();
				session.beginTransaction();
				
				session.save(signup1);
			String pk=	(String) session.save(login);
				
				
				session.getTransaction().commit();
				
				session.close();
				return pk;
			
		
	
	}
	}


 