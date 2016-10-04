package com.md.serviceImpl;

import javax.transaction.Transactional;

import com.md.daoimpl.CancelBookingDao;
import com.md.daoimpl.LoginDao;

public class CancelService {
	
	
	CancelBookingDao dao=new CancelBookingDao();
	
	@Transactional
	public void deleteBookingNo(String bookingNo) {
		dao.deleteBookingNo(bookingNo);
	}

}
