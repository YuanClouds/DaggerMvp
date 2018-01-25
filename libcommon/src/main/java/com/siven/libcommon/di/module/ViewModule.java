package com.siven.libcommon.di.module;

import com.siven.libcommon.contract.AbstractContract;

import dagger.Module;

/**
 * Created by siven on 2018/1/22.
 */

@Module
public class ViewModule {

    protected AbstractContract.ViewRenderer v;

    public ViewModule(AbstractContract.ViewRenderer v) {
        this.v = v;
    }


}
