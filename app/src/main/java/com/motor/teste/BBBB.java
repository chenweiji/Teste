package com.motor.teste;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.motor.teste.R;

import java.net.HttpURLConnection;

/**
 * Created by 15dcc on 2018/5/18.
 */

public class BBBB  extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initUI();

        //定义一个相对布局
        RelativeLayout rl = new RelativeLayout(this);
        Button bt = new Button(this);
        bt.setText("MYbutton");
        bt.setId(1);
        //添加子元素
        //rl.addView(bt);

        //定义参数，这个制定样式，也就是布局空间的位置
        RelativeLayout.LayoutParams Params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        Params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        Params.addRule(RelativeLayout.CENTER_HORIZONTAL,RelativeLayout.TRUE);

        //btn1位于父View的顶部，在父View中水平居中
        rl.addView(bt,Params);

        setContentView(rl);
    }

    public final void initUI(){
        ScrollView main = new ScrollView(this);
        main.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        main.setBackgroundColor(Color.WHITE);

        //根布局参数
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT);
        layoutParamsRoot.gravity = Gravity.CENTER;
        //根布局
        LinearLayout layoutRoot = new LinearLayout(this);
        layoutRoot.setLayoutParams(layoutParamsRoot);
        layoutRoot.setOrientation(LinearLayout.VERTICAL);


        //上边距（dp值）
        int topMargin = dip2px(this, 30);
        //imageMain宽度（dp值）
        int widthMain = dip2px(this, 240);
        //imageMain高度（dp值）
        int heightMain = dip2px(this, 120);

        //imageMain布局参数
        LinearLayout.LayoutParams layoutParamsImageMain = new LinearLayout.LayoutParams(widthMain,heightMain);
        layoutParamsImageMain.topMargin = topMargin;
        layoutParamsImageMain.bottomMargin = topMargin;
        layoutParamsImageMain.leftMargin = topMargin;
        layoutParamsImageMain.rightMargin = topMargin;
        layoutParamsImageMain.gravity=Gravity.CENTER_HORIZONTAL;
        //初始化ImageView
        ImageView imageMain = new ImageView(this);
        imageMain.setScaleType(ScaleType.FIT_CENTER);
        imageMain.setAdjustViewBounds(true);
        imageMain.setBackgroundColor(Color.BLACK);
        imageMain.setImageResource(R.mipmap.ic_launcher);
        layoutRoot.addView(imageMain, layoutParamsImageMain);

        //textInfo布局参数
        LinearLayout.LayoutParams layoutParamsTextInfo = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT);
        layoutParamsTextInfo.topMargin = topMargin;
        layoutParamsTextInfo.bottomMargin = topMargin;
        layoutParamsTextInfo.leftMargin = topMargin;
        layoutParamsTextInfo.rightMargin = topMargin;
        layoutParamsTextInfo.gravity=Gravity.CENTER_HORIZONTAL;
        //初始化textInfo
        TextView textInfo = new TextView(this);
        textInfo.setGravity(Gravity.CENTER_HORIZONTAL);
        textInfo.setTextSize(18);
        layoutRoot.addView(textInfo, layoutParamsTextInfo);

        //editInfo布局参数
        LinearLayout.LayoutParams layoutParamsEditInfo = new LinearLayout.LayoutParams(widthMain,LayoutParams.WRAP_CONTENT);
        layoutParamsEditInfo.topMargin = topMargin;
        layoutParamsEditInfo.gravity=Gravity.CENTER_HORIZONTAL;
        //初始化editInfo
        EditText editInfo = new EditText(this);
        editInfo.setHint("请输入文字内容");
        //设置可输入的最大长度
        InputFilter[] filters = {new LengthFilter(200)};
        editInfo.setFilters(filters);
        editInfo.setTextSize(18);
        layoutRoot.addView(editInfo, layoutParamsEditInfo);

        //上边距（dp值）
        int minHeight = dip2px(this, 54);
        //上padding（dp值）
        int topPadding = dip2px(this, 4);
        //左padding（dp值）
        int leftPadding = dip2px(this, 2);
        //按钮布局
        LinearLayout layoutButton = new LinearLayout(this);
        layoutButton.setLayoutParams(layoutParamsEditInfo);
        layoutButton.setOrientation(LinearLayout.HORIZONTAL);
        layoutButton.setBackgroundColor(Color.parseColor("#c6c3c6"));
        layoutButton.setMinimumHeight(minHeight);
        layoutButton.setPadding(leftPadding, topPadding, leftPadding, topPadding);
//        layoutButton.setId(100000001);

        //buttonOK布局参数
        LinearLayout.LayoutParams layoutParamsButtonOK = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        layoutParamsButtonOK.gravity = Gravity.LEFT;
        layoutParamsButtonOK.leftMargin = dip2px(this, 10);
        layoutParamsButtonOK.rightMargin = dip2px(this, 5);
        layoutParamsButtonOK.weight = 1;
        //Button确定
        Button  buttonOK= new Button(this);
        buttonOK.setLayoutParams(layoutParamsButtonOK);
        buttonOK.setMaxLines(2);
        buttonOK.setTextSize(18);
        buttonOK.setText("确定");
        layoutButton.addView(buttonOK);

        //buttonCancel布局参数
        LinearLayout.LayoutParams layoutParamsButtonCancel = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        layoutParamsButtonCancel.gravity = Gravity.RIGHT;
        layoutParamsButtonCancel.leftMargin = dip2px(this, 5);
        layoutParamsButtonCancel.rightMargin = dip2px(this, 10);
        layoutParamsButtonCancel.weight = 1;
        //Button取消
        Button buttonCancel = new Button(this);
        buttonCancel.setLayoutParams(layoutParamsButtonCancel);
        buttonCancel.setMaxLines(2);
        buttonCancel.setTextSize(18);
        buttonCancel.setText("取消");

        layoutButton.addView(buttonCancel);

        layoutRoot.addView(layoutButton, layoutParamsEditInfo);

        //RelativeLayout布局参数
        LinearLayout.LayoutParams layoutParamsBottom = new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT);
        RelativeLayout layoutBottom = new RelativeLayout(this);
        layoutBottom.setLayoutParams(layoutParamsBottom);

        RelativeLayout.LayoutParams paramsImageBottom = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        paramsImageBottom.addRule(RelativeLayout.BELOW, 100000001);
        paramsImageBottom.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
        paramsImageBottom.setMargins(topMargin, topMargin, topMargin, topMargin);

        //初始化ImageView
        ImageView imageBottom = new ImageView(this);
        imageBottom.setScaleType(ScaleType.FIT_CENTER);
        imageBottom.setAdjustViewBounds(true);
        imageBottom.setBackgroundColor(0xFF777777);
        imageBottom.setImageResource(android.R.drawable.ic_dialog_email);
        layoutBottom.addView(imageBottom, paramsImageBottom);
        layoutRoot.addView(layoutBottom);


        //TODO TEST
//		imageMain.setBackgroundResource(android.R.drawable.ic_dialog_map);
        textInfo.setText("测试文本显示");

        main.addView(layoutRoot);
        setContentView(main);
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }


}
