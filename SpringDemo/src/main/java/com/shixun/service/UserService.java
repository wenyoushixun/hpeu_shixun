package com.shixun.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.shixun.dao.IUserDao;

@Component("userService")
public class UserService implements IUserService{
	
//	@Autowired
//	@Qualifier("userDao")
	@Resource(name="userDao2")
	private IUserDao userdaos;

	@Override
	public void save() {
		userdaos.save();
		System.out.println("你保存了uservervice" +userdaos);	
	}
	

}
