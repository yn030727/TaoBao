package com.example.taobao.ui.Around;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AroundAdapter extends RecyclerView.Adapter<AroundViewHolder>{
    @NonNull
    @Override
    public AroundViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AroundViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class AroundViewHolder extends RecyclerView.ViewHolder{

    public AroundViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
