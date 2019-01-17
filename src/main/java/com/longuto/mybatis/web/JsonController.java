package com.longuto.mybatis.web;

import com.longuto.mybatis.dao.domain.UserInfo;
import com.longuto.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/addUser")
    public UserInfo addnewUserInfo(UserInfo userInfo) {
        userInfoService.addnewUserInfo(userInfo);
        return userInfo;
    }
}
