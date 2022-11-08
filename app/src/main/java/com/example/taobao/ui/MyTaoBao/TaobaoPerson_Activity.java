package com.example.taobao.ui.MyTaoBao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.taobao.R;
import com.example.taobao.Unfinish_Activity;

public class TaobaoPerson_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taobao_person);
        //获取实例
        Button button1=findViewById(R.id.main_taobao_person_button_back);
        TextView button_copy=findViewById(R.id.main_taobao_person_textView9);
        TextView button2=findViewById(R.id.textView10);
        Button button3=findViewById(R.id.button5);
        Button button4=findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button_copy.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_taobao_person_button_back:{
                finish();
                break;
            }
            case R.id.main_taobao_person_textView9:{
                Toast.makeText(this,"已复制虚假的逛逛号",Toast.LENGTH_SHORT).show();
                break;
            }
            default:{
                Intent intent=new Intent(this, Unfinish_Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}