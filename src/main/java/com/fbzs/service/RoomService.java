package com.fbzs.service;

import java.util.List;

import com.fbzs.pojo.Roominfo;

public interface RoomService {

	//获取房源信息
	Roominfo getRoomInfo(String roomId);

	//获取精品房信息
	List<Roominfo> getBoutiqueRoom(int flg);

	//获取所有房间细信息
	List<Roominfo> getAllRoom();

	int roomCollect(String uid, String roomId);

	List<Roominfo> gainRoomCollect(String uid);

	List<Roominfo> queryRoominfoByUid(String uid);

	int deleteRoominfoByRoomId(String roomId);

}
