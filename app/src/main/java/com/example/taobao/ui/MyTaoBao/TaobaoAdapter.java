package com.example.taobao.ui.MyTaoBao;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.main_taobao_function;

import java.util.List;

public class TaobaoAdapter extends RecyclerView.Adapter<myTaobaoHolder>{
    //存放我的淘宝功能的集合
    private List<main_taobao_function> functionList;
    public TaobaoAdapter(List<main_taobao_function> functionList){
        //传进来集合
        this.functionList=functionList;
    }
    @NonNull
    @Override
    public myTaobaoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(parent.getContext(), R.layout.layout_taobao_recyclerview,null);
        myTaobaoHolder myTaobaoHolder=new myTaobaoHolder(view);
        return myTaobaoHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myTaobaoHolder holder, int position) {
        main_taobao_function mainTaobaoFunction=functionList.get(position);
        holder.taobao_imageView.setImageResource(mainTaobaoFunction.getImageid());
        holder.taobao_textView.setText(mainTaobaoFunction.getImageName());
    }

    @Override
    public int getItemCount() {
        return functionList.size();
    }
}
class myTaobaoHolder extends RecyclerView.ViewHolder{
    ImageView taobao_imageView;
    TextView taobao_textView;
    public myTaobaoHolder(@NonNull View itemView) {
        super(itemView);
        taobao_imageView=itemView.findViewById(R.id.main_taobao_recyclerview_circleImageView);
        taobao_textView=itemView.findViewById(R.id.main_taobao_recyclerview_textView7);
    }
}
