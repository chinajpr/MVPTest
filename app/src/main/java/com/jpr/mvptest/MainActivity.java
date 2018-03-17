package com.jpr.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.jpr.mvptest.bean.LoginBean;
import com.jpr.mvptest.presenter.Basepresenter;
import com.jpr.mvptest.presenter.LoginPresenter;
import com.jpr.mvptest.view.BaseActivity;
import com.jpr.mvptest.view.IView;

public class MainActivity extends BaseActivity implements IView<LoginBean> {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        presenter.fectch();
    }

    @Override
    protected Basepresenter createPresenter() {
        return new LoginPresenter<>(this);
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载中...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "加载完毕...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void data(LoginBean loginBean) {
        tv.setText(loginBean.getUserName() + "---" + loginBean.getPwd());
    }
}
