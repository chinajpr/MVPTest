package com.jpr.mvptest.view;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:34
 * 作者:JiaoPeiRong
 */

public interface IView<T> {
    void showLoading();
    void hideLoading();
    void data(T t);
}
