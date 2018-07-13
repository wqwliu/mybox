package com.fbzs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fbzs.pojo.Message;
import com.fbzs.service.MessageService;

@Controller
@RequestMapping("fbzs")
public class MessageControlller {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/showMessage")
	@ResponseBody
	public List<Message> showMessage(String uid){
		List<Message> list = messageService.queryMessageById(uid);
		if(list!=null){
			return list;//验证用户名和密码正确
		}
		return null;
	}
}
