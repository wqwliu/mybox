package com.fbzs.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.fbzs.pojo.Roominfo;
import com.fbzs.pojo.RoominfoExample;

public interface RoominfoMapper {
    int countByExample(RoominfoExample example);

    int deleteByExample(RoominfoExample example);

    int deleteByPrimaryKey(String roomid);

    int insert(Roominfo record);

    int insertSelective(Roominfo record);

    List<Roominfo> selectByExample(RoominfoExample example);

    Roominfo selectByPrimaryKey(String roomid);

    int updateByExampleSelective(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByExample(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByPrimaryKeySelective(Roominfo record);

    int updateByPrimaryKey(Roominfo record);
}