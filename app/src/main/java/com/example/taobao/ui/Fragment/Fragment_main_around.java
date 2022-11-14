package com.example.taobao.ui.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.taobao.MainActivity;
import com.example.taobao.R;
import com.example.taobao.logic.main_around;
import com.example.taobao.ui.Around.AroundAdapter;
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
    private NestedScrollView nestedScrollView;
    private TabLayout tabLayout2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main_around,container,false);
        viewPager2 =view.findViewById(R.id.main_around_viewpager2);
        tabLayout2=view.findViewById(R.id.main_around_tablayout2);
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
        new TabLayoutMediator(tabLayout2, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                Log.d("main_around_tablayout2",""+titles.get(position));
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
        //写对于NestedScrollView的滚动响应事件
        //对于上滑悬浮栏置顶事件，我们可以通过创建两个悬浮栏，隐藏其中一个
        //然后判断整个NestedScrollView滑动的距离，到达一定距离后就可以把隐藏的悬浮栏显示出来。
        nestedScrollView=view.findViewById(R.id.main_around_nestedscrollview);
        //划过一个LinearLayout的距离，就显示
        LinearLayout linearLayout=view.findViewById(R.id.main_around_image_layout);
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(@NonNull NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if(scrollY>linearLayout.getHeight()){
                    //显示
                    view.findViewById(R.id.main_around_tablayout2).setVisibility(View.VISIBLE);
                }else{
                    //隐藏
                    view.findViewById(R.id.main_around_tablayout2).setVisibility(View.GONE);
                }
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
