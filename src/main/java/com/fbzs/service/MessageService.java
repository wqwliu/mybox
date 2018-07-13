package com.fbzs.service;

import java.util.List;

import com.fbzs.pojo.Message;

public interface MessageService {

	List<Message> queryMessageById(String uid);

}
