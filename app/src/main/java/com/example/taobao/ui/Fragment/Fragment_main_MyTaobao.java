package com.example.taobao.ui.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taobao.R;
import com.example.taobao.Unfinish_Activity;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment_main_MyTaobao extends Fragment implements View.OnClickListener {
    CircleImageView ImageViewbtn ;
    TextView editSaying;
    Button taoyouquan;
    Button cardView1;
    Button two11;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frgment_main_mytaobao,container,false);

        //获取实例
        ImageViewbtn =view.findViewById(R.id.circleImageView);//个人头像
        editSaying = view.findViewById(R.id.main_taobao_textView2);//个人签名
        taoyouquan = view.findViewById(R.id.main_taobao_person_friend);//淘友圈
        cardView1 = view.findViewById(R.id.main_mytaobao_cardview1);//一号卡片布局(会员中心，淘宝省钱卡，淘宝人生，红包签到)
        two11= view.findViewById(R.id.main_mytaobao_two11);//天猫双11
        //按钮点击
        ImageViewbtn.setOnClickListener(this);
        editSaying.setOnClickListener(this);
        taoyouquan.setOnClickListener(this);
        cardView1.setOnClickListener(this);
        two11.setOnClickListener(this);

    return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.circleImageView:{
                //个人主页
            }
            case R.id.main_taobao_textView2:{
                //个性签名
            }
            case R.id.main_taobao_person_friend:{
                Intent intent=new Intent(getActivity(), Unfinish_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.main_mytaobao_cardview1:{
                Intent intent=new Intent(getActivity(), Unfinish_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.main_mytaobao_two11:{
                Intent intent=new Intent(getActivity(),Unfinish_Activity.class);
                startActivity(intent);
            }
            default:{

            }
        }
    }
}
