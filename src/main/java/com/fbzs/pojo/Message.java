package com.fbzs.pojo;


public class Message {
	/*mid varchar(55) NULL
	msessmage varchar(100) NULL
	uid varchar(55) NULL*/
	private String mid;
	private String leave_message;
	private String uid;
	private User user;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getLeave_message() {
		return leave_message;
	}
	public void setLeave_message(String leave_message) {
		this.leave_message = leave_message;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [mid=");
		builder.append(mid);
		builder.append(", leave_message=");
		builder.append(leave_message);
		builder.append(", uid=");
		builder.append(uid);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String mid, String leave_message, String uid, User user) {
		super();
		this.mid = mid;
		this.leave_message = leave_message;
		this.uid = uid;
		this.user = user;
	}
    
}
