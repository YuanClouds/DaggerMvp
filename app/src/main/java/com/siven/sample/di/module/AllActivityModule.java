package com.siven.sample.di.module;

import com.siven.libcommon.di.BuilderActivityComponent;
import com.siven.sample.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 用于管理所有activity的module
 * Created by siven on 2018/1/23.
 */

@Module(subcomponents = {
        BuilderActivityComponent.class,}
)
public abstract class AllActivityModule {

    //下面注入我们自己的activity
//    @ContributesAndroidInjector(modules = MainActivityNewModule.class) // 需要自己定义注解，写一个Module
    // 不需要则直接空就行
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivitytInjector();
}
