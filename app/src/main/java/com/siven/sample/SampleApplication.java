package com.siven.sample;

import com.siven.libcommon.ComApplication;
import com.siven.libcommon.di.ComAppComponent;
import com.siven.sample.di.component.DaggerSampleAppComponent;

/**
 * Created by siven on 2018/1/25.
 */

public class SampleApplication extends ComApplication{

    @Override
    public ComAppComponent bindInject() {
        return DaggerSampleAppComponent.create();
    }

}
