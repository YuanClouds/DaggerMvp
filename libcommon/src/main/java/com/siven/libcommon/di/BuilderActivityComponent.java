package com.siven.libcommon.di;

import com.siven.libcommon.ui.activity.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * 管理公用所有的activity subcomponent.builder
 * （前提，必须有一个activity基类）
 * Created by siven on 2018/1/23.
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
})
public interface BuilderActivityComponent extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity>{
        //...
    }

}
