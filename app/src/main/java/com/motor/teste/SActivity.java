package com.motor.teste;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 15dcc on 2018/5/22.
 */

public class SActivity extends Activity{
    LinearLayout ll;
    protected static final float FLIP_DISTANCE = 50;
    GestureDetector mDetector;

    float mPosX;
    float mPosY;
    float mCurPosX;
    float mCurPosY;
    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dd);

//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
//        alertDialog.setMessage("NIHAO");
//        alertDialog.show();
//        ll = (LinearLayout)findViewById(R.id.ll);
//        text = (TextView)findViewById(R.id.tv);
//        ll.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.i("MYTAG", ""+event.getActionIndex());
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        mPosX = event.getX();
//                        mPosY = event.getY();
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        mCurPosX = event.getX();
//                        mCurPosY = event.getY();
//
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        if (mCurPosY - mPosY > 0
//                                && (Math.abs(mCurPosY - mPosY) > 25)) {
//                            //向下滑動
//                            Log.i("MYTAG", "向下滑...");
//                            text.setText("向下滑...");
//
//                        } else if (mCurPosY - mPosY < 0
//                                && (Math.abs(mCurPosY - mPosY) > 25)) {
//                            //向上滑动
//                            Log.i("MYTAG", "向上滑...");
//                            text.setText("向上滑...");
//                        }
//
//                        if (mCurPosX - mPosX > 0
//                                && (Math.abs(mCurPosX - mPosX) > 25)) {
//                            //向下滑動
//                            Log.i("MYTAG", "向右滑...");
//                            text.setText("向右滑...");
//
//                        } else if (mCurPosX - mPosX < 0
//                                && (Math.abs(mCurPosX - mPosX) > 25)) {
//                            //向上滑动
//                            Log.i("MYTAG", "向左滑...");
//                            text.setText("向左滑...");
//                        }
//
//
//                        break;
//                }
//                return true;
//            }
//        });


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SActivity","onStop");
    }
}
