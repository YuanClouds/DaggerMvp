package com.siven.libcommon.contract;

/**
 * 抽象约束
 * Created by siven on 2018/1/16.
 */

public interface AbstractContract {

    interface ViewRenderer{
        void showToast(String message);
    }

    interface Presenter{
        void bindView(ViewRenderer v);
        void create();
        void destory();
    }

     interface DataSource{
        //...
    }
}
