package com.example.taobao.ui.MyTaoBao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.taobao.R;

public class TaobaoOrders_Activity extends AppCompatActivity {
    //这里放置一个Activity
    //5个按钮，用去切换Fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taobao_orders);
        Button button=findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}