package com.md.serviceImpl;

import javax.transaction.Transactional;

import com.md.daoimpl.RegisterDaoImpl;
import com.md.model.Register;

  public class RegisterServiceImpl{
	RegisterDaoImpl dao=new RegisterDaoImpl();
	 
	@Transactional
	public Register adduser(Register register)
	{
		return dao.adduser(register);
	}

}
