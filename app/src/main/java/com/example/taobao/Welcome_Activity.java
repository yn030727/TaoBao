package com.example.taobao;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;

public class Welcome_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //在欢迎页面的Activity内设置界面
        //1.设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //2.隐藏顶部标题栏
//        getSupportActionBar().hide();
        //调用发送信息延迟函数
        handler.sendEmptyMessageDelayed(0,1500);
    }
    private Handler handler=new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            Intent intent=new Intent(Welcome_Activity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

}