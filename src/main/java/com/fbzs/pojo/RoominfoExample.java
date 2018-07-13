package com.fbzs.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoominfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoominfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(String value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(String value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(String value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(String value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(String value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLike(String value) {
            addCriterion("roomId like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotLike(String value) {
            addCriterion("roomId not like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<String> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<String> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(String value1, String value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(String value1, String value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNull() {
            addCriterion("roomName is null");
            return (Criteria) this;
        }

        public Criteria andRoomnameIsNotNull() {
            addCriterion("roomName is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnameEqualTo(String value) {
            addCriterion("roomName =", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotEqualTo(String value) {
            addCriterion("roomName <>", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThan(String value) {
            addCriterion("roomName >", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameGreaterThanOrEqualTo(String value) {
            addCriterion("roomName >=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThan(String value) {
            addCriterion("roomName <", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLessThanOrEqualTo(String value) {
            addCriterion("roomName <=", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameLike(String value) {
            addCriterion("roomName like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotLike(String value) {
            addCriterion("roomName not like", value, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameIn(List<String> values) {
            addCriterion("roomName in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotIn(List<String> values) {
            addCriterion("roomName not in", values, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameBetween(String value1, String value2) {
            addCriterion("roomName between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomnameNotBetween(String value1, String value2) {
            addCriterion("roomName not between", value1, value2, "roomname");
            return (Criteria) this;
        }

        public Criteria andRoomsizeIsNull() {
            addCriterion("roomSize is null");
            return (Criteria) this;
        }

        public Criteria andRoomsizeIsNotNull() {
            addCriterion("roomSize is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsizeEqualTo(Integer value) {
            addCriterion("roomSize =", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeNotEqualTo(Integer value) {
            addCriterion("roomSize <>", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeGreaterThan(Integer value) {
            addCriterion("roomSize >", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomSize >=", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeLessThan(Integer value) {
            addCriterion("roomSize <", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeLessThanOrEqualTo(Integer value) {
            addCriterion("roomSize <=", value, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeIn(List<Integer> values) {
            addCriterion("roomSize in", values, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeNotIn(List<Integer> values) {
            addCriterion("roomSize not in", values, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeBetween(Integer value1, Integer value2) {
            addCriterion("roomSize between", value1, value2, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("roomSize not between", value1, value2, "roomsize");
            return (Criteria) this;
        }

        public Criteria andRoomimageIsNull() {
            addCriterion("roomImage is null");
            return (Criteria) this;
        }

        public Criteria andRoomimageIsNotNull() {
            addCriterion("roomImage is not null");
            return (Criteria) this;
        }

        public Criteria andRoomimageEqualTo(String value) {
            addCriterion("roomImage =", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotEqualTo(String value) {
            addCriterion("roomImage <>", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageGreaterThan(String value) {
            addCriterion("roomImage >", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageGreaterThanOrEqualTo(String value) {
            addCriterion("roomImage >=", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLessThan(String value) {
            addCriterion("roomImage <", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLessThanOrEqualTo(String value) {
            addCriterion("roomImage <=", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageLike(String value) {
            addCriterion("roomImage like", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotLike(String value) {
            addCriterion("roomImage not like", value, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageIn(List<String> values) {
            addCriterion("roomImage in", values, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotIn(List<String> values) {
            addCriterion("roomImage not in", values, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageBetween(String value1, String value2) {
            addCriterion("roomImage between", value1, value2, "roomimage");
            return (Criteria) this;
        }

        public Criteria andRoomimageNotBetween(String value1, String value2) {
            addCriterion("roomImage not between", value1, value2, "roomimage");
            return (Criteria) this;
        }

        public Criteria andBednumIsNull() {
            addCriterion("bedNum is null");
            return (Criteria) this;
        }

        public Criteria andBednumIsNotNull() {
            addCriterion("bedNum is not null");
            return (Criteria) this;
        }

        public Criteria andBednumEqualTo(Integer value) {
            addCriterion("bedNum =", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotEqualTo(Integer value) {
            addCriterion("bedNum <>", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThan(Integer value) {
            addCriterion("bedNum >", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedNum >=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThan(Integer value) {
            addCriterion("bedNum <", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThanOrEqualTo(Integer value) {
            addCriterion("bedNum <=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumIn(List<Integer> values) {
            addCriterion("bedNum in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotIn(List<Integer> values) {
            addCriterion("bedNum not in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumBetween(Integer value1, Integer value2) {
            addCriterion("bedNum between", value1, value2, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotBetween(Integer value1, Integer value2) {
            addCriterion("bedNum not between", value1, value2, "bednum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNull() {
            addCriterion("roomNum is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumIsNotNull() {
            addCriterion("roomNum is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumEqualTo(Integer value) {
            addCriterion("roomNum =", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotEqualTo(Integer value) {
            addCriterion("roomNum <>", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThan(Integer value) {
            addCriterion("roomNum >", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomNum >=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThan(Integer value) {
            addCriterion("roomNum <", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumLessThanOrEqualTo(Integer value) {
            addCriterion("roomNum <=", value, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumIn(List<Integer> values) {
            addCriterion("roomNum in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotIn(List<Integer> values) {
            addCriterion("roomNum not in", values, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumBetween(Integer value1, Integer value2) {
            addCriterion("roomNum between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andRoomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("roomNum not between", value1, value2, "roomnum");
            return (Criteria) this;
        }

        public Criteria andPnumIsNull() {
            addCriterion("pNum is null");
            return (Criteria) this;
        }

        public Criteria andPnumIsNotNull() {
            addCriterion("pNum is not null");
            return (Criteria) this;
        }

        public Criteria andPnumEqualTo(Integer value) {
            addCriterion("pNum =", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotEqualTo(Integer value) {
            addCriterion("pNum <>", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThan(Integer value) {
            addCriterion("pNum >", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pNum >=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThan(Integer value) {
            addCriterion("pNum <", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumLessThanOrEqualTo(Integer value) {
            addCriterion("pNum <=", value, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumIn(List<Integer> values) {
            addCriterion("pNum in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotIn(List<Integer> values) {
            addCriterion("pNum not in", values, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumBetween(Integer value1, Integer value2) {
            addCriterion("pNum between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andPnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pNum not between", value1, value2, "pnum");
            return (Criteria) this;
        }

        public Criteria andRoompedcIsNull() {
            addCriterion("roomPedc is null");
            return (Criteria) this;
        }

        public Criteria andRoompedcIsNotNull() {
            addCriterion("roomPedc is not null");
            return (Criteria) this;
        }

        public Criteria andRoompedcEqualTo(String value) {
            addCriterion("roomPedc =", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcNotEqualTo(String value) {
            addCriterion("roomPedc <>", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcGreaterThan(String value) {
            addCriterion("roomPedc >", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcGreaterThanOrEqualTo(String value) {
            addCriterion("roomPedc >=", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcLessThan(String value) {
            addCriterion("roomPedc <", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcLessThanOrEqualTo(String value) {
            addCriterion("roomPedc <=", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcLike(String value) {
            addCriterion("roomPedc like", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcNotLike(String value) {
            addCriterion("roomPedc not like", value, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcIn(List<String> values) {
            addCriterion("roomPedc in", values, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcNotIn(List<String> values) {
            addCriterion("roomPedc not in", values, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcBetween(String value1, String value2) {
            addCriterion("roomPedc between", value1, value2, "roompedc");
            return (Criteria) this;
        }

        public Criteria andRoompedcNotBetween(String value1, String value2) {
            addCriterion("roomPedc not between", value1, value2, "roompedc");
            return (Criteria) this;
        }

        public Criteria andFlgIsNull() {
            addCriterion("flg is null");
            return (Criteria) this;
        }

        public Criteria andFlgIsNotNull() {
            addCriterion("flg is not null");
            return (Criteria) this;
        }

        public Criteria andFlgEqualTo(Integer value) {
            addCriterion("flg =", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgNotEqualTo(Integer value) {
            addCriterion("flg <>", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgGreaterThan(Integer value) {
            addCriterion("flg >", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("flg >=", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgLessThan(Integer value) {
            addCriterion("flg <", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgLessThanOrEqualTo(Integer value) {
            addCriterion("flg <=", value, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgIn(List<Integer> values) {
            addCriterion("flg in", values, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgNotIn(List<Integer> values) {
            addCriterion("flg not in", values, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgBetween(Integer value1, Integer value2) {
            addCriterion("flg between", value1, value2, "flg");
            return (Criteria) this;
        }

        public Criteria andFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("flg not between", value1, value2, "flg");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}