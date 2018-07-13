package com.fbzs.mapper;


import com.fbzs.pojo.User;

public interface UserMapper {
	//查询用户  login(登陆) checkName(用户名查重)
	User queryUser(User user);
	//添加用户 register(注册)
	int insertUser(User user);
	//修改用户  modifyUser(修改用户)  modifyPassword(修改密码)
	int updataUser(User user);

}
