package com.jpr.mvptest.model;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:15
 * 作者:JiaoPeiRong
 */

public interface IBaseModel<T> {
    void load(CallBack<T> callBack);
}
