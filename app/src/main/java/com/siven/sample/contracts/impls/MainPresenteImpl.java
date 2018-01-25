package com.siven.sample.contracts.impls;

import com.siven.libcommon.contract.impl.presenter.BasePresenter;
import com.siven.sample.contracts.impls.datasource.MainDataSourceImpl;
import com.siven.sample.contracts.main.MainContract;

import javax.inject.Inject;

/**
 * Created by siven on 2018/1/18.
 */

public class MainPresenteImpl extends BasePresenter<MainContract.ViewRenderer,MainDataSourceImpl> implements MainContract.Presenter{

    @Inject
    public MainPresenteImpl() {
    }

    @Override
    public void create() {
        mViewRenderer.showToast("hihi");
        mDataSource.action();
    }

    @Override
    public void destory() {

    }
}
