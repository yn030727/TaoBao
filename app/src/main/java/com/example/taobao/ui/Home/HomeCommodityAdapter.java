package com.example.taobao.ui.Home;

import android.media.Image;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.Home_commodity;

import java.util.ArrayList;
import java.util.List;


public class HomeCommodityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_1 = 0;
    public static final int VIEW_TYPE_2 = 1;
    List<Home_commodity> arrayList;

    public HomeCommodityAdapter(List<Home_commodity> list) {
        arrayList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //这里将LayoutInflater提取出来，不再case里面每次去资源文件找布局，因为这个操作相当消耗内存资源
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //viewType是根据getItemViewType的返回值来确定的
        //所以根据viewType我们可以加载不用的item
/*        switch (viewType){
            case VIEW_TYPE_1:{
                //对于第一个我们加载轮播图
                return new HomeBannerViewHolder(layoutInflater.inflate(R.layout.layout_home_recycler_shop_item,null));
            }
            case VIEW_TYPE_2:{
                //剩下的我们加载自定义的布局*/
        View view=layoutInflater.inflate(R.layout.layout_home_recycler_shop_item2, null);
        return new HomeCommodityViewHolder(view);
/*            }
        }
        return null;*/
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        /*        if(holder instanceof HomeCommodityViewHolder){*/
        //是商品
        ((HomeCommodityViewHolder) holder).commodityName.setText(arrayList.get(position).getText1());
        ((HomeCommodityViewHolder) holder).imageView.setImageResource(arrayList.get(position).getImageID());
        ((HomeCommodityViewHolder) holder).commodityPrice.setText(arrayList.get(position).getPrice());
        ((HomeCommodityViewHolder) holder).imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
/*        }else if(holder instanceof HomeBannerViewHolder){
            //是轮播图
            ((HomeBannerViewHolder)holder).imageViewBanner.setImageResource();
        }*/
    }

    @Override
    public int getItemCount() {
        //还要加上多出来的一轮播图
        return arrayList.size();
    }
/*    //相比之前需要多重写一个方法，设置不同item显示的条数
    @Override
    public int getItemViewType(int position) {
        if(position==0)return 0;
        else return 1;
    }*/
}

class HomeCommodityViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView commodityName;
    TextView commodityPrice;

    public HomeCommodityViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.main_home_commodity_image);
        commodityName = itemView.findViewById(R.id.main_home_commodity_name);
        commodityPrice = itemView.findViewById(R.id.main_home_commodity_price);
    }
}

class HomeBannerViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewBanner;

    public HomeBannerViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewBanner = itemView.findViewById(R.id.main_home_banner);
    }
}

