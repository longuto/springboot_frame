package com.longuto.mybatis.dao.mapper;

import com.longuto.mybatis.dao.domain.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    @Insert("INSERT INTO userinfo (id, username, password) VALUES (#{id}, #{username}, #{password})")
    void addNewUserInfo(UserInfo userInfo);

//    @ResultMap("userinfo")
//    @Select("select * from userinfo")
//    List<UserInfo> selectAll();
}
