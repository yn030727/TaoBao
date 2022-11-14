package com.example.taobao.ui.Around;

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
import com.example.taobao.logic.main_around;

import java.util.ArrayList;

public class AroundTwo11_Fragment extends Fragment {
    private ArrayList<main_around> mainArounds;
    private AroundAdapter aroundAdapter;
    public static AroundTwo11_Fragment newsInstance(){
        AroundTwo11_Fragment aroundTwo11_fragment=new AroundTwo11_Fragment();
        return aroundTwo11_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.layout_around_fragment_two11,null);
        //加载适配器
        init();
        GridLayoutManager layoutManager=new GridLayoutManager(v.getContext(),2);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        RecyclerView around_recyclerview=v.findViewById(R.id.main_around_recyclerview);
        aroundAdapter=new AroundAdapter(mainArounds);
        around_recyclerview.setLayoutManager(layoutManager);
        around_recyclerview.setAdapter(aroundAdapter);
        return v;
    }
    public void init(){
        mainArounds=new ArrayList<>();
        mainArounds.add(new main_around(R.drawable.main_around_first,"不愧是厦门朋友推荐的！！吃了一块囤了一箱",R.drawable.bar_around_rightavatar,"吃货小鱼"));
        mainArounds.add(new main_around(R.drawable.main_around_second,"挺顺的，就是发尾太翘了，需要撸直",R.drawable.bar_around_rightavatar,"日向小野TAT"));
        mainArounds.add(new main_around(R.drawable.main_around_third,"小清新风格，再搭配一件牛仔裤，时尚又好看",R.drawable.bar_around_rightavatar,"布丁鱼"));
        mainArounds.add(new main_around(R.drawable.main_around_four,"绝绝子，这条裤子必须码住，超舒服，上身效果绝佳",R.drawable.bar_around_rightavatar,"丹丹"));
        mainArounds.add(new main_around(R.drawable.main_around_five,"冬天搭毛衣牛角扣外套都很好看！性价比高高的！",R.drawable.bar_around_rightavatar,"O3Otaotao"));
        mainArounds.add(new main_around(R.drawable.main_around_six,"12分钟居家[精准翘臀]发力感超好",R.drawable.bar_around_rightavatar,"张呆呆mei"));
        mainArounds.add(new main_around(R.drawable.main_around_seven,"广西酸芒果的灵魂吃饭??够酸够劲好吃到停不下来",R.drawable.bar_around_rightavatar,"三餐不亏嘴大的大熊"));
        mainArounds.add(new main_around(R.drawable.main_around_eight,"冬季谁不爱毛绒保暖又好看穿搭 人手必备一件 白色真行",R.drawable.bar_around_rightavatar,"小杨没烦恼"));
        mainArounds.add(new main_around(R.drawable.main_around_nine,"海贼王润缇cos来啦",R.drawable.bar_around_rightavatar,"小莉与帆帆"));
        mainArounds.add(new main_around(R.drawable.main_around_ten,"无语！我不会是最后一个知道这玩意的吧！！",R.drawable.bar_around_rightavatar,"可可妹妹"));
        mainArounds.add(new main_around(R.drawable.main_around_eleven,"OOTD|韩高学院风套装：168cm 47kg",R.drawable.bar_around_rightavatar,"画解WAHJUIS"));
        mainArounds.add(new main_around(R.drawable.main_around_twelve,"OOTD|今天是咖啡色的！我还是好爱这种秋冬的开衫",R.drawable.bar_around_rightavatar,"想睡觉了"));
        mainArounds.add(new main_around(R.drawable.main_around_thirteen,"知道的人越多，倒闭的早餐店越多",R.drawable.bar_around_rightavatar,"别吃掉我的可爱"));
        mainArounds.add(new main_around(R.drawable.main_around_fourteen,"我喜欢你是真的哦..电次君",R.drawable.bar_around_rightavatar,"nnin"));
        mainArounds.add(new main_around(R.drawable.main_around_fifteen,"暴躁式手账-小麻薯天鹅湖手账排版~",R.drawable.bar_around_rightavatar,"青年艺术家o手账"));
        mainArounds.add(new main_around(R.drawable.main_around_sixteen,"很好看版型也好，姐妹们放心入吧",R.drawable.bar_around_rightavatar,"小猪佩佩"));
    }
}
