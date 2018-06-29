package com.motor.teste;

import android.app.ActivityManager;
import android.app.Fragment;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Entity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.util.LruCache;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Node;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity{

    Button button;

    TextView textw;
    private MyAsyc ays;

    public static Handler h;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

//        this.getSharedPreferences("",2);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity","onCreate");
        if(savedInstanceState!=null){
            String data_save = savedInstanceState.getString ("data_key") ;
            Log.d ("A" , data_save) ;
        }

//        Log.e("MianActivity",""+this);
//        getApplicationContext();


//        Window w=getWindow();
//        WindowManager.LayoutParams layoutParams  = w.getAttributes();
//        layoutParams.height = 200;
//        layoutParams.width= 200;
//        layoutParams.gravity = Gravity.TOP;
//        layoutParams.x=50;//距离Gravity属性的距离
//        layoutParams.y=50;
//        layoutParams.alpha = (float) 0.5;//0:完全透明，1：不透明
//        w.setAttributes(layoutParams);

//        DownloadTask downloadTask = new DownloadTask();
//        downloadTask.execute();

        Button ll = (Button)findViewById(R.id.btn);

        ays = new MyAsyc(ll);
        ays.execute();
//        setContentView(R.layout.activity_main);
//        button = (Button) findViewById(R.id.btn);
//        textw = (TextView) findViewById(R.id.text);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//
////                        Looper.prepare();
////                        Log.e("Thread",""+Thread.currentThread());
////                        Toast.makeText(MainActivity.this,"我是陈伟绩哈哈哈",Toast.LENGTH_LONG).show();
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Log.e("MainActivity","thread -----------");
//                button.setText("nihao");
//                textw.setText("改变后");
////
////                        Looper.nStartloop();
//            }
//        }).start();
////
//
//        Handler handler = new Handler(){
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//            }
//        };
//
//        handler.obtainMessage();
//
//        setContentView(R.layout.activity_main);
//        Log.e("MainActivity","onCreate");
////
////
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Log.e("ll","ll被点击");
//            }
//        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setCancelable(false);
                alertDialog.setMessage("NIHAO");
                alertDialog.show();

            }
        });

//        try {
//            connect();
//        } catch (Exception e) {
//            Log.e("hhh",e.getMessage());
//        }

        System.out.println("hhh---"+Thread.currentThread());

//        HandlerThread handlerThread = new HandlerThread("hh");
//        handlerThread.start();
//        Handler handler = new Handler(handlerThread.getLooper()){
//            @Override
//            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
//                System.out.println("hhh---"+Thread.currentThread());
//            }
//        };
//        handler.sendEmptyMessage(0);

//        android.hardware.Camera.open();

//        Intent intent = new Intent();
//        intent.setClass(this,SActivity.class);
//        startActivity(intent);
//        mHandler.postDelayed(sRunnable,1);

    }

    private class DownloadTask extends AsyncTask<String,String,String>{

        @Override
        protected String doInBackground(String... params) {
            boolean a = true;
            while (a) {
                    Log.d("hhhdhhddhh", "khkjhsfjkhjkehjhf");
                }
            return null;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("MainActivity","onSaveInstanceState");
        String data_save = "Something you just typed" ;
        outState.putString ("data_key" , data_save) ;
    }

//    public void connect() throws Exception {
//        throw new Exception();
//    }
    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = new Intent();
        DD dd = new DD();
        intent.putExtra("d",dd);
        Log.e("MainActivity","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e("MainActivity","onRestoreInstanceState");
    }

}

