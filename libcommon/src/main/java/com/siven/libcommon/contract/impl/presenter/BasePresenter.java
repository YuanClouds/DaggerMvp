package com.siven.libcommon.contract.impl.presenter;


import com.siven.libcommon.contract.AbstractContract;
import com.siven.libcommon.contract.impl.datasource.BaseDataSource;

import javax.inject.Inject;

/**
 * Created by siven on 2018/1/22.
 */

public class BasePresenter<V extends AbstractContract.ViewRenderer,D extends BaseDataSource>{

//    @Inject
    protected V mViewRenderer;

    @ Inject
    protected D mDataSource;

    /** default empty construct **/
    public BasePresenter() {
    }

    public void bindView(AbstractContract.ViewRenderer v) {
        mViewRenderer = (V) v;
    }
}
