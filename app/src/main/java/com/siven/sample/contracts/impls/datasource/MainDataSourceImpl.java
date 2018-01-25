package com.siven.sample.contracts.impls.datasource;

import android.util.Log;

import com.siven.libcommon.contract.impl.datasource.BaseDataSource;
import com.siven.sample.contracts.main.MainContract;

import javax.inject.Inject;

/**
 * Created by siven on 2018/1/22.
 */

public class MainDataSourceImpl extends BaseDataSource implements MainContract.DataSource{

    @Inject
    public MainDataSourceImpl() {
    }

    @Override
    public void action() {
        Log.d("SIVEN","hi 我是datasource,正在loading数据...");
    }
}
