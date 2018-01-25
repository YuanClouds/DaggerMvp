package com.siven.libcommon.di.module;

import com.siven.libcommon.contract.AbstractContract;

import dagger.Module;

/**
 * Created by siven on 2018/1/22.
 */

@Module
public class DataSourceModule {

   protected AbstractContract.DataSource dataSource;

    public DataSourceModule(AbstractContract.DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
