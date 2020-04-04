package com.bawei.dianshang13;

import android.app.Application;

/**
 * 全局应用，用于注册异常
 * 创建Application，重写onCreate方法，注册异常：Thread.setDefaultUncaughtExceptionHandler(new MyException(this));
 */
public class MyApplication extends Application {
    //注册异常
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new MyThreadException());
    }
}
