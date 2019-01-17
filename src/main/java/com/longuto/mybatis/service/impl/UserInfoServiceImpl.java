package com.longuto.mybatis.service.impl;

import com.longuto.mybatis.dao.domain.UserInfo;
import com.longuto.mybatis.dao.mapper.UserInfoMapper;
import com.longuto.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper mUserInfoMapper;

    @Override
    public void addnewUserInfo(UserInfo userInfo) {
        mUserInfoMapper.addNewUserInfo(userInfo);
    }
}
