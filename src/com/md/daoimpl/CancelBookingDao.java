package com.md.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.md.model.Profile;
import com.md.util.CreateConnection;

public class CancelBookingDao {

	SessionFactory sessionFactory;
	public CancelBookingDao() {
			sessionFactory=CreateConnection.init();
	}
	Session getSession(){
		return sessionFactory.openSession();
	}
	
	
	public void deleteBookingNo(String bookingNo) {
		Session session=getSession();
		session.beginTransaction();
		session.delete(getBookingNoById(bookingNo));
		session.getTransaction().commit();
		session.close();
	}
	private Profile getBookingNoById(String bookingNo) {
		return (Profile) getSession().get(Profile.class, bookingNo);
	}

}
