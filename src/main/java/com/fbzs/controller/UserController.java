package com.fbzs.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fbzs.pojo.User;
import com.fbzs.service.UserService;

@Controller
@RequestMapping("fbzs")
public class UserController {

	@Autowired
	private UserService userService;
	
	//登陆
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, String> login(User user,HttpSession session){
		System.out.println(user);
		User u = userService.queryUser(user);
		Map<String,String> map = new HashMap<>();
		if(u!=null){
			session.setAttribute("user", u);
			map.put("flag", "1");//验证用户名和密码正确
		}else{
			map.put("flag", "0");//验证用户名和密码错误
		}
		return map;
		
	}
	
	//注销
	@RequestMapping("/logOut")
	public String logOut(HttpSession session){
		session.invalidate();//消除session
		
		return "login";
	}
	
	//用户名查重
	@RequestMapping("/checkName")
	@ResponseBody
	public Map<String, String> checkName(User user){
		User u = userService.queryUser(user);
		Map<String,String> map = new HashMap<>();
		if(u!=null){
			map.put("flag","1");//用户已存在
		}else{
			map.put("flag","0");//用户不存在
		}
		return map;
		
	}
	
	//注册
	@RequestMapping("/register")
	@ResponseBody
	public Map<String, String> register(User user){
		int i = userService.insertUser(user);
		//设置uid;
		user.setUid(UUID.randomUUID().toString().replaceAll("-", ""));
		//设置默认为用户uflag=0;
		
		Map<String,String> map = new HashMap<>();
		System.out.println(i);
		if(i!=0){
		map.put("flag", "1");//注册成功
		}else{
		map.put("flag", "0");//失败成功
		}
		return map;
	}
	
	//回显用户信息
		@RequestMapping("/showUser")
		public String showUser(HttpSession session){
			User u = (User) session.getAttribute("user");
			System.out.println(u);
			return "modifyuserinfo";
			
		}
		
		//修改用户信息
		@RequestMapping("/modifyUser")
		@ResponseBody
		public Map<String, String> modifyUser(User user,HttpSession session){
			int i = userService.updataUser(user);
			Map<String,String> map = new HashMap<>();
			if(i!=0){
			session.setAttribute("user", user);
			map.put("flag", "1");//修改成功
			}else{
			map.put("flag", "0");//修改失败
			}
			return map;
		}
		
		//修改密码前验证用户名&密码
		@RequestMapping("/modifyPassword")
		@ResponseBody
		public Map<String, String> modifyPassword(User user,HttpSession session,String repassword){
		User u = userService.queryUser(user);
		Map<String,String> map = new HashMap<>();
		if(u!=null){
			//验证用户名密码正确
			//修改密码
			u.setUpwd(repassword);
			int i = userService.updataUser(u);
			if(i!=0){
				//修改成功
				map.put("flag", "1");
			}else{
				//修改失败
				map.put("flag", "0");
			}
		}else{
			//验证原密码错误 重新输入
			map.put("flag", "2");
			
		}
			return map;
		}
		
		//验证是否为房东
		/*@RequestMapping("/checkLandlord")
		@ResponseBody
		public Map<String, String> checkLandlord(User user){
			User u = userService.queryUser(user);
			Map<String,String> map = new HashMap<>();
			Integer uflag = u.getUflag();
			if(uflag==1){
				//该用户是房东
				map.put("flag", "1");
			}else{
				//该用户不是房东
				map.put("flag", "0");
			}
			return map;	
		}*/
		
		//点击发布房源则返回用户数据
		@RequestMapping("/showLandlord")
		@ResponseBody
		public User showLandlord(User user){
			User u = userService.queryUser(user);
			return u;
		}
		
		//提交房东数据
		@RequestMapping("/modifyLandlord")
		@ResponseBody
		public Map<String, String> modifyLandlord(User user,HttpSession session){
			int i = userService.updataUser(user);
			Map<String,String> map = new HashMap<>();
			if(i!=0){
			session.setAttribute("user", user);
			map.put("flag", "1");//修改成功
			}else{
			map.put("flag", "0");//修改失败
			}
			return map;
			
		}
		
		//返回房东故事
		@RequestMapping("/showStory")
		@ResponseBody
		public User showStory(User user){
			User u = userService.queryUser(user);
			return u;
		}
	
}
