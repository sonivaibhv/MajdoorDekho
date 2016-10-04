package com.md.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.md.model.Register;
import com.md.model.Signup;

public class RegisterDaoImpl {
	
	
	
	Session getSession(){
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		return factory.openSession();
	}
public Register adduser(Register register) {


Session session=getSession();
			session.beginTransaction();
			
			session.save(register);
			
			
			session.getTransaction().commit();
			
			session.close();
			return null;
		
	

}
}
