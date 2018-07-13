package com.fbzs.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbzs.mapper.UserMapper;
import com.fbzs.pojo.User;
import com.fbzs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
    //查询用户  login(登陆) checkName(用户名查重)
	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.queryUser(user);
	}

	//添加用户 register(注册)
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

	//修改用户  modifyUser(修改用户)  modifyPassword(修改密码)
	@Override
	public int updataUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updataUser(user);
	}

}
