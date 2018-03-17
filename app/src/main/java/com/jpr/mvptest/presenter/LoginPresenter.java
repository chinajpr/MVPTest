package com.jpr.mvptest.presenter;

import com.jpr.mvptest.bean.LoginBean;
import com.jpr.mvptest.model.CallBack;
import com.jpr.mvptest.model.LoginModel;
import com.jpr.mvptest.view.IView;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:34
 * 作者:JiaoPeiRong
 */

public class LoginPresenter<T> extends Basepresenter<IView<T>> {
    private IView<LoginBean> iView;

    public LoginPresenter(IView<LoginBean> iView) {
        this.iView = iView;
    }

    @Override
    public void fectch() {
        //网络获取数据
        iView.showLoading();
        LoginModel loginModel = new LoginModel();
        loginModel.load(new CallBack<LoginBean>() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                iView.data(loginBean);
            }

            @Override
            public void onFail(String msg) {

            }
        });
        iView.hideLoading();
    }
}
