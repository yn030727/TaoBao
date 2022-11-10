package com.example.taobao.ui.MyTaoBao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.ImageBean;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class ImageAdapter extends BannerAdapter<ImageBean,ImageAdapter.BannerViewHolder> {
    Context context;
    public ImageAdapter(Context context,List<ImageBean> datas) {
        super(datas);
        this.context=context;
    }

    @Override
    public BannerViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_taobao_recycleimage,parent,false);
        ViewGroup.LayoutParams lp=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(lp);
        BannerViewHolder bannerViewHolder=new BannerViewHolder(view);
        return bannerViewHolder;
    }

    @Override
    public void onBindView(BannerViewHolder holder, ImageBean data, int position, int size) {
        holder.imageView.setImageResource(data.getImageViewID());
    }

    class BannerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.main_taobao_recycler_image);
        }
    }

}
