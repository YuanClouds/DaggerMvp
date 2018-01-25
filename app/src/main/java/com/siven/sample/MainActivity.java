package com.siven.sample;

import android.os.Bundle;
import android.widget.Toast;

import com.siven.libcommon.ui.activity.AbstractActivity;
import com.siven.sample.contracts.impls.MainPresenteImpl;
import com.siven.sample.contracts.main.MainContract;

import javax.inject.Inject;


public class MainActivity extends AbstractActivity<MainPresenteImpl> implements MainContract.ViewRenderer{

    // 如果要用这个注解，记得在AllActivityModule 开启MainActivityNewModule
//    @Inject
//    Test test;

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    public void justDoing() {
        MainPresenteImpl presente = getPresenter();
        presente.create();
//        test.action();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void load() {

    }
}
