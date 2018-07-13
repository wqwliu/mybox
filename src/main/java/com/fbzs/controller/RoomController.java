package com.fbzs.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fbzs.pojo.Roominfo;
import com.fbzs.pojo.User;
import com.fbzs.service.RoomService;
import com.fbzs.service.UserService;
import com.fbzs.utils.DateUtils;

@Controller
@RequestMapping("/book")
public class RoomController {

	@Autowired
	private RoomService roomService;
	@Autowired
	private UserService userService;

	/**
	 * 
	 * 获取全部房间信息 http://10.31.166.68:8080/ssm/book//getAllRoom
	 */

	@RequestMapping("/getAllRoom")
	@ResponseBody
	public Map<String, Object> getAllRoom() {
		Map<String, Object> map = new HashMap<String, Object>();
		// 通过roomId获取房源信息
		List<Roominfo> allroom_list = roomService.getAllRoom();
		map.put("allroom_list", allroom_list);
		return map;
	}

	/**
	 * 
	 * 获取根据roomId获取相应房间的信息
	 * http://10.31.166.68:8080/ssm/book/getRoomInfo?roomId=001
	 */
	@RequestMapping("/getRoomInfo")
	@ResponseBody
	public Map<String, Object> getRoomInfo(@RequestParam("roomId") String roomId) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 通过roomId获取房源信息
		Roominfo roomInfo = roomService.getRoomInfo(roomId);
		// 获取到uid外键字段
		String uid = roomInfo.getUid();
		/* User userInfo = userService.getUserInfo(uid); */
		map.put("roomInfo", roomInfo);
		/* map.put("userInfo", userInfo); */
		return map;
	}

	/**
	 * 
	 * 获取所有精品房
	 * 
	 * http://10.31.166.68:8080/ssm/book/getBoutiqueRoom?flg=1
	 */
	@RequestMapping("/getBoutiqueRoom")
	@ResponseBody
	public Map<String, Object> getBoutiqueRoom(@RequestParam("flg") int flg) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 通过roomId获取房源信息
		List<Roominfo> list = roomService.getBoutiqueRoom(flg);
		if (list != null) {
			map.put("roomBoutiqueInfo", list);
		}
		return map;
	}

	/**
	 * 
	 * 下单时,要获取房间的roomId,和用户Uid,入住时间,退房时间.下单时间,总价
	 * 
	 * http://10.31.166.68:8080/ssm/book/getBoutiqueRoom?flg=1
	 */
	@RequestMapping("/bookRoom")
	@ResponseBody
	public Map<String, Object> bookRoom(@RequestParam("roomId") String roomId, Date inDate, Date formDate,
			HttpSession session, int pnum) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 下单时,通过前端传来的信息,先获取房间roomId
		User user = (User) session.getAttribute("user");
		// 获取用户uid
		String uid = user.getUid();
		// 获取入住天数
		long day = DateUtils.getDateDifference(formDate, inDate);
		Roominfo roomInfo = roomService.getRoomInfo(roomId);
		String roomname = roomInfo.getRoomname();
		Double price = roomInfo.getPrice() * day;// 总价格

		return map;
	}

	// 收藏民宿
	@RequestMapping("/roomCollect")
	@ResponseBody
	public Map<String, Object> roomCollect(String uid, String roomId, HttpSession session) {

		int result = roomService.roomCollect(uid, roomId);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);

		return map;
	}

	// 显示收藏的民宿
	@RequestMapping("/showRoomCollect")
	@ResponseBody
	public Map<String, Object> gainRoomCollect(String uid, HttpSession session) {

		List<Roominfo> roominfos = roomService.gainRoomCollect(uid);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roominfos", roominfos);

		return map;
	}

	// 验证uid返回房源
	@RequestMapping("/showRoominfo")
	@ResponseBody
	public List<Roominfo> showRoominfo(String uid) {
		List<Roominfo> list = roomService.queryRoominfoByUid(uid);

		return list;

	}

	// 删除房源
	@RequestMapping("/deleteRoominfo")
	@ResponseBody
	public Map<String, String> deleteRoominfo(String roomId) {
		int i = roomService.deleteRoominfoByRoomId(roomId);
		Map<String, String> map = new HashMap<>();
		if (i != 0) {
			map.put("flag", "1");// 删除成功
		} else {
			map.put("flag", "0");// 删除失败
		}
		return map;

	}
}
