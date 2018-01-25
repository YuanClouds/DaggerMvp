package com.siven.sample.di.component;


import com.siven.libcommon.di.ComAppComponent;
import com.siven.sample.di.module.AllActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by siven on 2018/1/24.
 */

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivityModule.class, // 引入自己的activiy配置文件
})
public interface SampleAppComponent extends ComAppComponent {

}
