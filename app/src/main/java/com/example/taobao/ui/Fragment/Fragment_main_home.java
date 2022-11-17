package com.example.taobao.ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.main_taobao_function;
import com.example.taobao.ui.Home.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_main_home extends Fragment {
    private RecyclerView recyclerView;
    private List<main_taobao_function> functionList;
    private HomeAdapter homeAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main_home,container,false);
        //获取实例
        recyclerView=view.findViewById(R.id.main_home_recyclerview);
        functionList=new ArrayList<>();
        initHome();
        GridLayoutManager layoutManager=new GridLayoutManager(view.getContext(),2);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        homeAdapter=new HomeAdapter(functionList);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
    public void initHome(){
        functionList.add(new main_taobao_function(R.drawable.main_home_1, "天猫U先"));
        functionList.add(new main_taobao_function(R.drawable.main_home_2, "充值中心"));
        functionList.add(new main_taobao_function(R.drawable.main_home_3, "天天特卖"));
        functionList.add(new main_taobao_function(R.drawable.main_home_4, "淘鲜达"));
        functionList.add(new main_taobao_function(R.drawable.main_home_5, "飞猪旅行"));
        functionList.add(new main_taobao_function(R.drawable.main_home_6, "领淘金币"));
        functionList.add(new main_taobao_function(R.drawable.main_home_7, "芭芭农场"));
        functionList.add(new main_taobao_function(R.drawable.main_home_8, "阿里拍卖"));
        functionList.add(new main_taobao_function(R.drawable.main_home_9, "天猫超市"));
        functionList.add(new main_taobao_function(R.drawable.main_home_10, "分类"));
        functionList.add(new main_taobao_function(R.drawable.main_home_11, "饿了么"));
        functionList.add(new main_taobao_function(R.drawable.main_home_12, "天猫国际"));
        functionList.add(new main_taobao_function(R.drawable.main_home_13, "吃货"));
        functionList.add(new main_taobao_function(R.drawable.main_home_14, "闲鱼"));
        functionList.add(new main_taobao_function(R.drawable.main_home_15, "淘票票"));
        functionList.add(new main_taobao_function(R.drawable.main_home_16, "天猫好药"));
        functionList.add(new main_taobao_function(R.drawable.main_home_17, "土货鲜食"));
        functionList.add(new main_taobao_function(R.drawable.main_home_18, "天猫汽车"));
        functionList.add(new main_taobao_function(R.drawable.main_home_19, "资质规则"));
        functionList.add(new main_taobao_function(R.drawable.main_home_20, "更多频道"));

    }
}
