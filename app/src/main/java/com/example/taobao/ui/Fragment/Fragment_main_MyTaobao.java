package com.example.taobao.ui.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.Unfinish_Activity;
import com.example.taobao.logic.main_taobao_function;
import com.example.taobao.ui.MyTaoBao.TaobaoAdapter;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment_main_MyTaobao extends Fragment implements View.OnClickListener {
    private CircleImageView ImageViewbtn ;
    private TextView editSaying;
    private Button taoyouquan;
    private Button cardView1;
    private Button two11;
    private RecyclerView recyclerView;
    private List<main_taobao_function> functionList;
    private TaobaoAdapter taobaoAdapter;
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
        recyclerView=view.findViewById(R.id.main_taobao_recyclerview);
        //按钮点击
        ImageViewbtn.setOnClickListener(this);
        editSaying.setOnClickListener(this);
        taoyouquan.setOnClickListener(this);
        cardView1.setOnClickListener(this);
        two11.setOnClickListener(this);


        //加载RecyclerView
        functionList=new ArrayList<>();
        inittaobao();
        GridLayoutManager layoutManager=new GridLayoutManager(view.getContext(),2);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        taobaoAdapter=new TaobaoAdapter(functionList);
        recyclerView.setAdapter(taobaoAdapter);
        recyclerView.setLayoutManager(layoutManager);


    return view;
    }
    //将我的淘宝页面的滚动功能界面的集合进行初始化
    public void inittaobao() {
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_redbox, "红包卡券"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_chengjiu, "成就奖励"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_huabei, "花呗"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_kefu, "官方客服"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_wodekuaidi, "我的快递"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_chonghuafei, "充话费"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_lianlian, "火爆连连消"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_allmoney, "天天领钱"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_shouhuo, "收货地址"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_doudizhu, "淘宝斗地主"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_wodepingjia, "我的评价"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_lingquan, "领券中心"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_xianzhi, "闲置换钱"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_shiyong, "使用领取"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_kefu, "官方客服"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_more, "更多"));
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
