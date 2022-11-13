package com.example.taobao.ui.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.taobao.R;
import com.example.taobao.ui.Around.AroundAll_Fragment;
import com.example.taobao.ui.Around.AroundDelicacies_Fragment;
import com.example.taobao.ui.Around.AroundFragmentStateAdapter;
import com.example.taobao.ui.Around.AroundFurniture_Fragment;
import com.example.taobao.ui.Around.AroundMakeup_Fragment;
import com.example.taobao.ui.Around.AroundMother_Fragment;
import com.example.taobao.ui.Around.AroundSkincare_Fragment;
import com.example.taobao.ui.Around.AroundTwo11_Fragment;
import com.example.taobao.ui.Around.AroundWear_Fragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class Fragment_main_around extends Fragment {
    //创建集合，一个存放Fragment，另一个存放String当作title
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main_around,container,false);
        viewPager2 =view.findViewById(R.id.main_around_viewpager2);
        tabLayout=view.findViewById(R.id.main_around_tablayout);
        init();
        //fragmentActivityWrong？？ 加载适配器
        AroundFragmentStateAdapter adapter=new AroundFragmentStateAdapter(getChildFragmentManager(),getLifecycle(),fragments);
        Log.d("main_around_Fragments",fragments.get(0)+":"+titles.get(0));
        viewPager2.setAdapter(adapter);
        //关联Tablayout
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                Log.d("main_around_tablayout",""+titles.get(position));
                tab.setText(titles.get(position));
            }
        }).attach();
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        return view;
    }


    //初始化两个集合
    public void init(){
        fragments=new ArrayList<>();
        titles=new ArrayList<>();
        fragments.add(AroundAll_Fragment.newsInstance());
        fragments.add(AroundTwo11_Fragment.newsInstance());
        fragments.add(AroundWear_Fragment.newsInstance());
        fragments.add(AroundFurniture_Fragment.newsInstance());
        fragments.add(AroundMakeup_Fragment.newsInstance());
        fragments.add(AroundDelicacies_Fragment.newsInstance());
        fragments.add(AroundMother_Fragment.newsInstance());
        fragments.add(AroundSkincare_Fragment.newsInstance());
        titles.add("全部");
        titles.add("双11晒单");
        titles.add("穿搭");
        titles.add("家居");
        titles.add("彩妆");
        titles.add("美食");
        titles.add("母婴");
        titles.add("护肤");


    }
}
