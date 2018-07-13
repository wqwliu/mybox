package com.fbzs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbzs.mapper.RoomcollectMapper;
import com.fbzs.mapper.RoominfoMapper;
import com.fbzs.pojo.Roomcollect;
import com.fbzs.pojo.Roominfo;
import com.fbzs.pojo.RoominfoExample;
import com.fbzs.pojo.RoominfoExample.Criteria;
import com.fbzs.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoominfoMapper roomInfoMapper;

	@Autowired
	private RoomcollectMapper roomcollectMapper;
	/**
	 * 
	 * 根据房间的roomId获取房间的全部信息
	 * 
	 */
	@Override
	public Roominfo getRoomInfo(String roomId) {
		Roominfo roominfo = roomInfoMapper.selectByPrimaryKey(roomId);
		return roominfo;
	}
	/**
	 * 
	 * 获取所有精品房
	 */
	@Override
	public List<Roominfo> getBoutiqueRoom(int flg) {
		RoominfoExample example = new RoominfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andFlgEqualTo(flg);
		List<Roominfo> list = roomInfoMapper.selectByExample(example);
		return list;
	}
	/**
	 * 获取所有房间的信息
	 * 
	 */
	@Override
	public List<Roominfo> getAllRoom() {
		
		return roomInfoMapper.selectByExample(null);
	}
	
	//收藏民宿
	@Override
	public int roomCollect(String uid, String roomId) {
		
		return roomcollectMapper.roomCollect(uid,roomId);
	}
	
	//获取用户收藏的民宿
	@Override
	public List<Roominfo> gainRoomCollect(String uid) {
		
		List<Roomcollect> roomcollects = roomcollectMapper.gainRoomCollect(uid);
		List<Roominfo> roominfos = new ArrayList<>();
		
		for (Roomcollect roomcollect : roomcollects) {
			Roominfo roominfo = roomInfoMapper.selectByPrimaryKey(roomcollect.getRoomId());
			roominfos.add(roominfo);
		}
		
		return roominfos;
	}
	@Override
	public List<Roominfo> queryRoominfoByUid(String uid) {
		
		RoominfoExample example = new RoominfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(uid);
		
		List<Roominfo> list = roomInfoMapper.selectByExample(example);
		
		return list;
	}
	@Override
	public int deleteRoominfoByRoomId(String roomId) {
		
		int result = roomInfoMapper.deleteByPrimaryKey(roomId);
		
		return result;
	}

}
