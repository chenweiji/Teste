package com.motor.teste;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

/**
 * Created by 15dcc on 2018/6/11.
 */

public class hsh extends RadioGroup {
    public hsh(Context context) {
        super(context);
    }

    public hsh(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }
}
