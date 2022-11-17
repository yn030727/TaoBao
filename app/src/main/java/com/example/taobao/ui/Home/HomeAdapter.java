package com.example.taobao.ui.Home;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.main_taobao_function;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeHolder>{
    //可以借用我的淘宝里面的RecyclerView
    private List<main_taobao_function> functionList;
    public HomeAdapter(List<main_taobao_function> functionList){
        //传进来集合
        this.functionList=functionList;
    }
    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(parent.getContext(), R.layout.layout_home_recyclerview_item,null);
        HomeHolder holder=new HomeHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        main_taobao_function mainTaobaoFunction=functionList.get(position);
        holder.home_imageView.setImageResource(mainTaobaoFunction.getImageid());
        holder.home_textView.setText(mainTaobaoFunction.getImageName());
    }

    @Override
    public int getItemCount() {
        return functionList.size();
    }
}
class HomeHolder extends RecyclerView.ViewHolder{
    ImageView home_imageView;
    TextView home_textView;
    public HomeHolder(@NonNull View itemView) {
        super(itemView);
        home_imageView=itemView.findViewById(R.id.main_taobao_recyclerview_circleImageView);
        home_textView=itemView.findViewById(R.id.main_taobao_recyclerview_textView7);
    }
}
