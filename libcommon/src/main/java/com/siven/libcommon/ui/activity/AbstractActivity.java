package com.siven.libcommon.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.siven.libcommon.contract.AbstractContract;

import javax.inject.Inject;

/**
 * Created by siven on 2018/1/25.
 */

public abstract class AbstractActivity<T extends AbstractContract.Presenter>  extends BaseActivity implements AbstractContract.ViewRenderer{

    @Inject
    T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        bindPresenter();
        justDoing();
    }

    @Override
    protected void onDestroy() {
        unBindPresenter();
        super.onDestroy();
    }

    private void bindPresenter(){
        if (mPresenter != null){
            mPresenter.bindView(this);
        }
    }

    private void unBindPresenter(){
        if (mPresenter != null){
            mPresenter.destory();
        }
    }

    //get p
    public T getPresenter(){
        return mPresenter;
    }

    // get real layout
    public abstract int getLayoutRes();
    // doing work after oncreate()
    public abstract void justDoing();
}
