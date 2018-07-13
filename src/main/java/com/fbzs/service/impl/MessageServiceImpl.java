package com.fbzs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbzs.mapper.MessageMapper;
import com.fbzs.pojo.Message;
import com.fbzs.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;
	
	@Override
	public List<Message> queryMessageById(String uid) {
		// TODO Auto-generated method stub
		return messageMapper.queryMessageById(uid);
	}

}
