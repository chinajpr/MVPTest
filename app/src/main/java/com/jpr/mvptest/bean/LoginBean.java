package com.jpr.mvptest.bean;

import com.jpr.mvptest.model.CallBack;
import com.jpr.mvptest.model.IBaseModel;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:13
 * 作者:JiaoPeiRong
 */

public class LoginBean {

    private String userName;
    private String pwd;

    public LoginBean(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
