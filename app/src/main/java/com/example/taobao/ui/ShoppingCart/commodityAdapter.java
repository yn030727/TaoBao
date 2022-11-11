package com.example.taobao.ui.ShoppingCart;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.commodity;

import java.util.List;

public class commodityAdapter extends RecyclerView.Adapter<commodityViewHolder>{
    List<commodity> commodityList;
    public commodityAdapter(List<commodity> list){
        commodityList=list;
    }
    @NonNull
    @Override
    public commodityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_shoppingcart_commodity,parent,false);
        commodityViewHolder holder=new commodityViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull commodityViewHolder holder, int position) {
        commodity commodity1=commodityList.get(position);
        holder.dianpuName.setText(commodity1.getDianpuName());
        holder.dianpuImage.setImageResource(commodity1.getDianpuImage());
        holder.commdityImage.setImageResource(commodity1.getCommdityImage());
        holder.commdityName.setText(commodity1.getCommdityName());
        holder.commdityDescription.setText(commodity1.getCommdityDescription());
        holder.price.setText(commodity1.getPrice());
    }

    @Override
    public int getItemCount() {
        return commodityList.size();
    }
}
class commodityViewHolder extends RecyclerView.ViewHolder{
    //店铺图片和名字
    ImageView dianpuImage;
    TextView dianpuName;
    //商品信息
    ImageView commdityImage;
    TextView commdityName;
    TextView commdityDescription;
    TextView price;
    public commodityViewHolder(@NonNull View itemView) {
        super(itemView);
        dianpuImage=itemView.findViewById(R.id.main_shoppingcart_dianpuimage);
        dianpuName=itemView.findViewById(R.id.main_shoppingcart_dianpuname);
        commdityImage=itemView.findViewById(R.id.main_shoppingcart_image);
        commdityName=itemView.findViewById(R.id.main_shoppingcart_name);
        commdityDescription=itemView.findViewById(R.id.main_shoppingcart_description);
        price=itemView.findViewById(R.id.main_shoppingcart_price);
    }
}