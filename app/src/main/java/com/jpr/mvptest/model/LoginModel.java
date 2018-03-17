package com.jpr.mvptest.model;

import com.jpr.mvptest.bean.LoginBean;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:36
 * 作者:JiaoPeiRong
 */

public class LoginModel implements IBaseModel<LoginBean> {
    @Override
    public void load(CallBack<LoginBean> callBack) {
        callBack.onSuccess(new LoginBean("admin" , "123"));
    }
}
