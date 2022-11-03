package com.example.taobao.ui.message;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.main_message;

import org.w3c.dom.Text;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MyMessageHolder>{
    private List<main_message> messageList;
    public MessageAdapter(List<main_message> list){messageList=list;}
    //获取布局创建Holder类，并处理一些和控件有关的事件
    @NonNull
    @Override
    public MyMessageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(parent.getContext(), R.layout.layout_message_recyclerview,null);
        MyMessageHolder messageHolder=new MyMessageHolder(view);
        return messageHolder;
    }
    //通过集合中的数据，对控件实例进行操作
    @Override
    public void onBindViewHolder(@NonNull MyMessageHolder holder, int position) {
        main_message message=messageList.get(position);
        holder.mainMessage.setText(message.getMain_message());
        holder.secondMessage.setText(message.getSecond_message());
        holder.dataMessage.setText(message.getData_message());
        holder.circleImageView.setImageResource(message.getImageId());
    }
    //返回集合长度
    @Override
    public int getItemCount() {
        return messageList.size();
    }
}

class MyMessageHolder extends RecyclerView.ViewHolder{
    TextView mainMessage;
    TextView secondMessage;
    TextView dataMessage;
    ImageView circleImageView;
    //获取实例
    public MyMessageHolder(@NonNull View itemView) {
        super(itemView);
        mainMessage=itemView.findViewById(R.id.message_maintextView);
        secondMessage=itemView.findViewById(R.id.message_secondtextView);
        dataMessage=itemView.findViewById(R.id.message_data);
        circleImageView=itemView.findViewById(R.id.message_circleimageview);
    }
}