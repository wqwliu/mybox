package com.fbzs.pojo;

public class Roominfo {
    private String roomid;

    private String roomname;

    private Integer roomsize;

    private String roomimage;

    private Integer bednum;

    private Double price;

    private Integer roomnum;

    private Integer pnum;

    private String roompedc;

    private Integer flg;

    private String uid;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid == null ? null : roomid.trim();
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public Integer getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(Integer roomsize) {
        this.roomsize = roomsize;
    }

    public String getRoomimage() {
        return roomimage;
    }

    public void setRoomimage(String roomimage) {
        this.roomimage = roomimage == null ? null : roomimage.trim();
    }

    public Integer getBednum() {
        return bednum;
    }

    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getRoompedc() {
        return roompedc;
    }

    public void setRoompedc(String roompedc) {
        this.roompedc = roompedc == null ? null : roompedc.trim();
    }

    public Integer getFlg() {
        return flg;
    }

    public void setFlg(Integer flg) {
        this.flg = flg;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}