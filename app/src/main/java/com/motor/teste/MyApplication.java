package com.motor.teste;

import android.app.Application;

/**
 * Created by 15dcc on 2018/5/15.
 */

public class MyApplication extends Application {
    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        //获取CrashHandler实例并初始化CrashHandler
//        CrashHandler.getInstance().init(getApplicationContext());
    }
    public static MyApplication getInstance() {
        if (instance == null) {
            instance = new MyApplication();
        }
        return instance;
    }
}
