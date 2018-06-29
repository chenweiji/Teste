package com.motor.teste;

import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by 15dcc on 2018/6/16.
 */

public class MyAsyc extends AsyncTask<String,String,String> {
    private Button ll;

    SoftReference<Button> w;

    public MyAsyc(Button ll){
         w= new SoftReference<Button>(ll);
    }


    @Override
    protected String doInBackground(String... params) {
        boolean a = true;
        while (a) {
            Log.d("hhhdhhddhh", "khkjhsfjkhjkehjhf");

        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        ll = w.get();
    }
}