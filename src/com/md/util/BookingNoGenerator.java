package com.md.util;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;


public class BookingNoGenerator implements IdentifierGenerator {

		private SessionFactory sessionFactory = null;

		Session session = null;

		public Serializable generate(SessionImplementor si, Object obj)throws HibernateException 
		{
			sessionFactory=CreateConnection.init();
			String orderid = "BK0001";
			try {
				session = sessionFactory.openSession();
				Query q1 = session.createQuery("select max(bookingNo) from Profile");
				String lastorderid = (String) q1.uniqueResult();
				if (lastorderid != null) {
					int x = Integer.parseInt(lastorderid.substring(3)) + 1;
					if (x <= 9) {
						orderid = "BK000" + x;
					} else if (x <= 99) {
						orderid = "BK00" + x;
					} else if (x <= 999) {
						orderid = "BK0" + x;
					} else if (x <= 9999) {
						orderid = "BK" + x;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			session.close();
			return orderid;
		}

	
	
	
}
