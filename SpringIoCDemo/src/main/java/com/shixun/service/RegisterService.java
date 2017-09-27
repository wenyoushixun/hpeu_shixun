package com.shixun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shixun.dao.RegisterDao;

@Service("registerService")
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;
	
	public void doRegister(){
		registerDao.save();
	}
}
