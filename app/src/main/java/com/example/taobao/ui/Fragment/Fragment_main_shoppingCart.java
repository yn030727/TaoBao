package com.example.taobao.ui.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.logic.commodity;
import com.example.taobao.ui.ShoppingCart.commodityAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_main_shoppingCart extends Fragment {
    private List<commodity> commodityList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main_shoppingcart,container,false);

        //加载
        commodityList=new ArrayList<>();
        initCommodityList();
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        commodityAdapter commodityAdapter=new commodityAdapter(commodityList);
        RecyclerView recyclerView=view.findViewById(R.id.main_shoppingcart_recyclerview);
        recyclerView.setAdapter(commodityAdapter);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
    public void initCommodityList(){
        commodityList.add(new commodity(R.drawable.main_taobao_first_image,"niubi",R.drawable.main_taobao_first_image,"niu","niu","1"));
    }
}
