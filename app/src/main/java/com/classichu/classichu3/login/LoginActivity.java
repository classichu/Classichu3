package com.classichu.classichu3.login;

import android.os.Bundle;

import com.classichu.classichu3.R;
import com.classichu.classichu3.base.BaseActivity;


public class LoginActivity extends BaseActivity implements LoginContract.View{


    @Override
    protected int setupLayoutResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String msg) {

    }
}

