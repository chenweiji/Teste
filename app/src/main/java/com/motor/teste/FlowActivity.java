package com.motor.teste;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.widget.RadioButton;

import java.util.ArrayList;

/**
 * Created by 15dcc on 2018/6/11.
 */

public class FlowActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flow);

        ArrayList<String> list = new ArrayList<>(9);
        list.add("广东省");
        list.add("广西省");
        list.add("广的省");
        list.add("广额省");
        list.add("广登入省");
        list.add("广24省");
        list.add("广7就省");
        list.add("广二分省");
        list.add("广定位省");

        FlowRadioGroup flowRadioGroup = (FlowRadioGroup)findViewById(R.id.flowR);

        for (int i=0;i<list.size();i++) {
            RadioButton rb = (RadioButton)getLayoutInflater().inflate(R.layout.radio,null);
            rb.setText(list.get(i));
            flowRadioGroup.addView(rb);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }
}
