package com.example.taobao.ui.Around;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.main_around;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AroundAdapter extends RecyclerView.Adapter<AroundViewHolder>{
    List<main_around> list;
    public AroundAdapter(List<main_around> list){
        this.list=list;
    }
    @NonNull
    @Override
    public AroundViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_around_recyclerview,null);
        AroundViewHolder aroundViewHolder=new AroundViewHolder(view);
        return aroundViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AroundViewHolder holder, int position) {
            main_around around=list.get(position);
            holder.around_image.setImageResource(around.getAround_image());
            holder.around_touxiang.setImageResource(around.getAround_head_portrait());
            holder.message.setText(around.getAround_message());
            holder.name.setText(around.getAround_user());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class AroundViewHolder extends RecyclerView.ViewHolder{
    ImageView around_image;
    CircleImageView around_touxiang;
    TextView message;
    TextView name;
    public AroundViewHolder(@NonNull View itemView) {
        super(itemView);
        around_image =itemView.findViewById(R.id.main_around_image1);
        around_touxiang=itemView.findViewById(R.id.main_around_circleImage);
        message=itemView.findViewById(R.id.main_around_message);
        name=itemView.findViewById(R.id.main_around_name);
    }
}
