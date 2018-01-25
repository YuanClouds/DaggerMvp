package com.siven.sample.di.module;

import com.siven.sample.Test;

import dagger.Module;
import dagger.Provides;

/**
 * 优化的component
 * 针对mactivity，具体要实例什么。。
 * Created by siven on 2018/1/23.
 */

@Module
public class MainActivityNewModule {


    @Provides
    Test provideTest(){
        return new Test();
    }


}
