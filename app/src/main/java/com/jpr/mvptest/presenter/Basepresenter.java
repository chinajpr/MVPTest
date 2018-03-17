package com.jpr.mvptest.presenter;

import java.lang.ref.SoftReference;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:24
 * 作者:JiaoPeiRong
 */

public abstract class Basepresenter<T> {
    protected SoftReference<T> viewRef;

    /**
     * 获取数据的方法
     */
    public abstract void fectch();

    /**
     * 绑定View
     *
     * @param view
     */
    public void attachView(T view) {
        viewRef = new SoftReference<T>(view);
    }

    /**
     * 解绑view
     */
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

}
