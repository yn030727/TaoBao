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
import com.example.taobao.logic.Home_commodity;
import com.example.taobao.logic.main_taobao_function;
import com.example.taobao.ui.Home.HomeAdapter;
import com.example.taobao.ui.Home.HomeCommodityAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_main_home extends Fragment {
    private RecyclerView recyclerView;
    private List<main_taobao_function> functionList;
    private HomeAdapter homeAdapter;
    private RecyclerView recyclerView2;
    private List<Home_commodity> homeCommodities;
    private HomeCommodityAdapter homeCommodityAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main_home,container,false);
        //获取实例
        recyclerView=view.findViewById(R.id.main_home_recyclerview);
        recyclerView2=view.findViewById(R.id.main_home_commodity_recyclerview);
        homeCommodities=new ArrayList<>();
        functionList=new ArrayList<>();
        initHome();
        GridLayoutManager layoutManager=new GridLayoutManager(view.getContext(),2);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        homeAdapter=new HomeAdapter(functionList);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(layoutManager);
        //商品
        initCommodity();
        GridLayoutManager layoutManager1=new GridLayoutManager(view.getContext(),2);
        layoutManager1.setOrientation(RecyclerView.VERTICAL);
        homeCommodityAdapter=new HomeCommodityAdapter(homeCommodities);
        recyclerView2.setLayoutManager(layoutManager1);
        recyclerView2.setAdapter(homeCommodityAdapter);
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
    public void initCommodity(){
        for(int i=0;i<5;i++){
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity1, "锁喉脆桃小黄桃水蜜桃","9.9"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity2, "剥皮芒果软糖扒皮芒果","6.9"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity3, "【长高高，不自卑】火山","56.2"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity4, "佳达托肥椰果肉果冻布","5.9"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity5, "冻干冰糖葫芦独立包装","15.9"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity6, "原神游戏周边武器雷神","17.48"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity7, "BALENCIAGA巴黎世家","3,000"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity8, "绿头鱼头套无味可爱鱼","34.9"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity9, "我的迷你世界武器装备","13.31"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity10, "微疵特价满水有盖 可口","45"));
            homeCommodities.add(new Home_commodity(R.drawable.main_home_commodity11, "高浓缩，更有效，眼睛累来两片","39.9"));
        }
    }
}
