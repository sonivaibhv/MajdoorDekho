package com.md.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.md.model.Profile;
import com.md.util.CreateConnection;



public class ProfileDao {

	SessionFactory sessionFactory;
	public ProfileDao() {
		
			sessionFactory=CreateConnection.init();
	}
	
	Session getSession(){
		return sessionFactory.openSession();
	}
public String adduser(Profile profile) {


Session session=getSession();
			session.beginTransaction();
			
			String pk=(String) session.save(profile);
			
			
			session.getTransaction().commit();
			
			session.close();
			return pk;
		
	

}

}
