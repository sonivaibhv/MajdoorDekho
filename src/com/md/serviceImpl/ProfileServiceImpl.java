package com.md.serviceImpl;

import javax.transaction.Transactional;

import com.md.daoimpl.ProfileDao;
import com.md.model.Profile;


public class ProfileServiceImpl{
	
	ProfileDao dao=new ProfileDao();
	 
	@Transactional
	public String adduser(Profile profile)
	{
		return dao.adduser(profile);
	}



}
