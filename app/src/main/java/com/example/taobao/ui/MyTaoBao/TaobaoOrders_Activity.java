package com.example.taobao.ui.MyTaoBao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.taobao.R;

public class TaobaoOrders_Activity extends AppCompatActivity {
    //这里放置一个Activity
    //5个按钮，用去切换Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taobao_orders);
    }
}