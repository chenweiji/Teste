package com.motor.teste;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.WindowManager;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 15dcc on 2018/6/14.
 */

public class MActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DpAdapt.setCustomDensity(this,getApplication());
        setContentView(R.layout.mm);

        setFinishOnTouchOutside(false);
        /*设置窗口样式activity宽高start*/
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay();  //为获取屏幕宽、高
        WindowManager.LayoutParams p = getWindow().getAttributes();  //获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.8);   //高度设置为屏幕的0.6
        p.width = (int) (d.getWidth() * 0.8);    //宽度设置为屏幕的0.7
        p.alpha = 1.0f;      //设置本身透明度
        p.dimAmount = 0.5f;      //设置窗口外黑暗度
        getWindow().setAttributes(p);


 /*设置窗口样式activity宽高end*/

    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        if (newConfig.fontScale != 1)//非默认值
//            getResources();
//        super.onConfigurationChanged(newConfig);
//    }
//
//    @Override
//    public Resources getResources() {
//        Resources res = super.getResources();
//        if (res.getConfiguration().fontScale != 1) {//非默认值
//            Configuration newConfig = new Configuration();
//            newConfig.setToDefaults();//设置默认
//            res.updateConfiguration(newConfig, res.getDisplayMetrics());
//        }
//        return res;
//    }

}
