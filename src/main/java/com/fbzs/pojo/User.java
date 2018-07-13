package com.fbzs.pojo;

import java.util.Date;
import java.util.List;

public class User {
	/*uid varchar(55) NOT NULL
	uname varchar(55) NULL
	upwd varchar(55) NULL
	utel varchar(55) NULL
	birthday varchar(55) NULL
	identity varchar(55) NULL
	email varchar(55) NULL
	sex varchar(55) NULL
	address varchar(55) NULL
	ufalg int(11) NULL
    homestay_address varchar(55) NULL
    homestay_capacity int(11) NULL
    story varchar(100) NULL
	*/
	private String uid;
	private String uname;
	private String upwd;
	private String utel;
	private Date birthday;
	private String identity;
	private String email;
	private String sex;
	private String address;
	private Integer uflag;
	private String  homestay_address;
	private Integer homestay_capacity;
	private String story;
	private List<Message> messageList;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUflag() {
		return uflag;
	}
	public void setUflag(Integer uflag) {
		this.uflag = uflag;
	}
	public String getHomestay_address() {
		return homestay_address;
	}
	public void setHomestay_address(String homestay_address) {
		this.homestay_address = homestay_address;
	}
	public Integer getHomestay_capacity() {
		return homestay_capacity;
	}
	public void setHomestay_capacity(Integer homestay_capacity) {
		this.homestay_capacity = homestay_capacity;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public List<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uid, String uname, String upwd, String utel, Date birthday, String identity, String email,
			String sex, String address, Integer uflag, String homestay_address, Integer homestay_capacity, String story,
			List<Message> messageList) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.utel = utel;
		this.birthday = birthday;
		this.identity = identity;
		this.email = email;
		this.sex = sex;
		this.address = address;
		this.uflag = uflag;
		this.homestay_address = homestay_address;
		this.homestay_capacity = homestay_capacity;
		this.story = story;
		this.messageList = messageList;
	}
	
}
