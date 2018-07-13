package com.fbzs.service;


import com.fbzs.pojo.User;

public interface UserService {

	User queryUser(User user);//查询用户

	int insertUser(User user);//添加用户
	
	int updataUser(User user);//修改用户

}
