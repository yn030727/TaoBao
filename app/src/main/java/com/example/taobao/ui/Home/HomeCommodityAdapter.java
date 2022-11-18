package com.example.taobao.ui.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.Home_commodity;

import java.util.ArrayList;
import java.util.List;


public class HomeCommodityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static final int VIEW_TYPE_1=0;
    public static final int VIEW_TYPE_2=1;
    List<Home_commodity> arrayList;
    public HomeCommodityAdapter(List<Home_commodity> list){arrayList=list;}
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //这里将LayoutInflater提取出来，不再case里面每次去资源文件找布局，因为这个操作相当消耗内存资源
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        //viewType是根据getItemViewType的返回值来确定的
        //所以根据viewType我们可以加载不用的item
        switch (viewType){
            case VIEW_TYPE_1:{
                //对于第一个我们加载轮播图
                return new HomeBannerViewHolder(layoutInflater.inflate(R.layout.layout_home_recycler_shop_item,null));
            }
            case VIEW_TYPE_2:{
                //剩下的我们加载自定义的布局
                return new HomeCommodityViewHolder(layoutInflater.inflate(R.layout.layout_home_recycler_shop_item2,null));
            }
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof HomeCommodityViewHolder){

        }else if(holder instanceof HomeBannerViewHolder){

        }
    }

    @Override
    public int getItemCount() {
        //还要加上多出来的一轮播图
        return arrayList.size()+1;
    }
    //相比之前需要多重写一个方法，设置不同item显示的条数
    @Override
    public int getItemViewType(int position) {
        if(position==0)return 0;
        else return 1;
    }
}
class HomeCommodityViewHolder extends RecyclerView.ViewHolder{

    public HomeCommodityViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
class HomeBannerViewHolder extends RecyclerView.ViewHolder{

    public HomeBannerViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
