package com.motor.teste;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("SecondActivity","onCreate");

        findViewById(R.id.ll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.e("ll","ll被点击");
            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.e("btn","btn被点击");

                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SecondActivity","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SecondActivity","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SecondActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SecondActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SecondActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SecondActivity","onDestroy");
    }
}
