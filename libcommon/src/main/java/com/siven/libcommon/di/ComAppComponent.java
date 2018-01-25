package com.siven.libcommon.di;

import com.siven.libcommon.ComApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * application component配置组件
 * Created by siven on 2018/1/24.
 */

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class
})
public interface ComAppComponent {

    /**
     * inject 入口
     * @param application
     */
    void inject(ComApplication application);
}
