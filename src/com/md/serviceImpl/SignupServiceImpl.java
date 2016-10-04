package com.md.serviceImpl;

import javax.transaction.Transactional;
import com.md.daoimpl.SignupDaoImpl;
import com.md.model.Login;
import com.md.model.Signup;

public class SignupServiceImpl {
	
	SignupDaoImpl dao=new SignupDaoImpl();
 
@Transactional
public String adduser(Signup signup1,Login login)
{
	return dao.adduser(signup1,login);
}




}
