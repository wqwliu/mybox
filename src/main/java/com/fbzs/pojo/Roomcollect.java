package com.fbzs.pojo;

public class Roomcollect {
	
	private Long coid;
	private String uid;
	private String roomId;
	public Roomcollect() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCoid() {
		return coid;
	}
	public void setCoid(Long coid) {
		this.coid = coid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	@Override
	public String toString() {
		return "Roomcollect [coid=" + coid + ", uid=" + uid + ", roomId=" + roomId + "]";
	}
	
}
