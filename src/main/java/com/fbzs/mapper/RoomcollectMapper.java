package com.fbzs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fbzs.controller.RoomController;
import com.fbzs.pojo.Roomcollect;

public interface RoomcollectMapper {

	int roomCollect(@Param("uid")String uid, @Param("roomId") String roomId);

	List<Roomcollect> gainRoomCollect(String uid);
	
}
