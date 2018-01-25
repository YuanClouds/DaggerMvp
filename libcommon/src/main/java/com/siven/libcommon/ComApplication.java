package com.siven.libcommon;

import android.app.Activity;
import android.app.Application;

import com.siven.libcommon.di.ComAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by siven on 2018/1/25.
 */

public abstract class ComApplication extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Override
    public void onCreate() {
        bindInject().inject(this);
        super.onCreate();
    }

    public abstract ComAppComponent bindInject();

}
