package com.jpr.mvptest.model;

/**
 * 类描述:数据回调接口
 * 创建日期:2018/3/17 on 10:17
 * 作者:JiaoPeiRong
 */

public interface CallBack<T> {
    void onSuccess(T t);
    void onFail(String msg);
}
