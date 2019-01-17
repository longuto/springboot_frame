package com.longuto.mybatis.dao.domain;

/**
 * 用户信息
 */
public class UserInfo {

    private Integer id; // 主键

    private String username;    // 用户姓名

    private String password;    // 用户密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
