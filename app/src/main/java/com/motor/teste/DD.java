package com.motor.teste;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.Serializable;

/**
 * Created by 15dcc on 2018/5/23.
 */

public class DD extends BaseAdapter implements Serializable{
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView.getTag();
        return null;
    }
}
