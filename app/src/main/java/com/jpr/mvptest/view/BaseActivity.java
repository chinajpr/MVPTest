package com.jpr.mvptest.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jpr.mvptest.presenter.Basepresenter;

/**
 * 类描述:
 * 创建日期:2018/3/17 on 10:47
 * 作者:JiaoPeiRong
 */
public abstract class BaseActivity<V, T extends Basepresenter> extends AppCompatActivity {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    protected abstract T createPresenter();
}
