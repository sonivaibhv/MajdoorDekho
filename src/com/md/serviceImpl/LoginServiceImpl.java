package com.md.serviceImpl;


import javax.transaction.Transactional;


import org.hibernate.Criteria;

import com.md.daoimpl.LoginDao;
import com.md.model.Login;

public class LoginServiceImpl {

LoginDao dao=new LoginDao();
	
	@Transactional
	public Object checkUser(String email, String password) {
		System.out.println("d");
		return dao.checkUser(email,password);
	}
	
}
