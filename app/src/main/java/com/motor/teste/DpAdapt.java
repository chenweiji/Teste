package com.motor.teste;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

/**
 * Android 屏幕适配
 */

public class DpAdapt {

    private static float sNoncompatDensity;      //非相容尺寸密度
    private static float sNoncompatScaleDensity; //非相容字体密度

    /**
     * 下面假设设计图宽度是360dp，以宽维度来适配。
     * @param activity
     * @param application
     */
    public static void setCustomDensity(@NonNull Activity activity, @NonNull final Application application){

        final DisplayMetrics appDisplayMetrics = application.getResources().getDisplayMetrics(); //获取app显示标准
        if(sNoncompatDensity == 0){
            sNoncompatDensity = appDisplayMetrics.density; //尺寸密度
            sNoncompatScaleDensity = appDisplayMetrics.scaledDensity; //字体密度

            application.registerComponentCallbacks(new ComponentCallbacks() {
                @Override
                public void onConfigurationChanged(Configuration newConfig) {
                    //系统设置中切换字体
                    if(newConfig != null && newConfig.fontScale > 0){
                        sNoncompatScaleDensity = application.getResources().getDisplayMetrics().scaledDensity;
                    }
                }
                @Override
                public void onLowMemory() {

                }
            });
        }

        final float targetDensity = appDisplayMetrics.widthPixels / 360;  //目标密度=屏幕尺寸/360
        final float targetScaleDensity = targetDensity*(sNoncompatScaleDensity / sNoncompatDensity);
        final int targetDensityDpi = (int) (160 * targetDensity); //目标dpi

        appDisplayMetrics.density = targetDensity;
        appDisplayMetrics.scaledDensity = targetScaleDensity;//如果想字体不随系统设置变化appDisplayMetrics.scaledDensity = targetScaleDensity
        appDisplayMetrics.densityDpi = targetDensityDpi;

        final DisplayMetrics activityDisplayMetrics = activity.getResources().getDisplayMetrics();
        activityDisplayMetrics.density = targetDensity;
        activityDisplayMetrics.scaledDensity = targetScaleDensity;
        activityDisplayMetrics.densityDpi = targetDensityDpi;
    }

}
