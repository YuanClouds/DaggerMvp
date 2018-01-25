package com.siven.sample.contracts.main;


import com.siven.libcommon.contract.AbstractContract;

/**
 * Created by siven on 2018/1/18.
 */

public interface MainContract{

    interface ViewRenderer extends AbstractContract.ViewRenderer{
        public void load();
    }

    interface Presenter extends AbstractContract.Presenter{

    }

    interface DataSource extends AbstractContract.DataSource{
        void action();
    }

}
