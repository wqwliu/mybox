package com.fbzs.mapper;

import java.util.List;

import com.fbzs.pojo.Message;

public interface MessageMapper {

	List<Message> queryMessageById(String uid);

}
