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
import com.example.taobao.ui.ShoppingCart.commodityItemDecoration;

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
        int space=13;
        recyclerView.addItemDecoration(new commodityItemDecoration(space));
        recyclerView.setAdapter(commodityAdapter);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
    public void initCommodityList(){
        commodityList.add(new commodity(R.drawable.main_shoppingcart_guanfnagdianpu,"键帽社",R.drawable.main_shoppingcart_list1,"锌铝合金机械键盘透光","无;【透光】跳刀*1个;官","83"));

        commodityList.add(new commodity(R.drawable.main_shoppingcart_tianmaotianpu,"博库旗舰店",R.drawable.main_shoppingcart_list2,"数据结构算法分析语言","","39.5"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_tianmaotianpu,"托肥旗舰店",R.drawable.main_shoppingcart_list3,"35g休闲怀旧混合口味果冻","西瓜味*20袋","12.9"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_tianmaotianpu,"恒寿堂旗舰店",R.drawable.main_shoppingcart_list4,"恒寿堂蜂蜜柚子茶百香","蜜炼柚子茶500g【拍2送1】","31.41"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_tianmaotianpu,"礼知乐旗舰店",R.drawable.main_shoppingcart_list5,"网红茶 蜜桃乌龙茶 500克","蜜桃乌龙蜂蜜冰糖茶500","24.8"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_tianmaotianpu,"niko and...旗舰店",R.drawable.main_shoppingcart_list6,"niko and...卡通精致日","熊猫01","129"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_guanfnagdianpu,"DOPEbarber男士剃须",R.drawable.main_shoppingcart_list7,"英国蓝胡子木质沐浴皂香皂","","98"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_guanfnagdianpu,"QUQU外设电脑店",R.drawable.main_shoppingcart_list8,"simple同款国行正品粉色","官方标配;GPW二代胜利","899"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_guanfnagdianpu,"天空电玩",R.drawable.main_shoppingcart_list9,"微软Xbox Series 新款无线手柄","","499"));
        commodityList.add(new commodity(R.drawable.main_shoppingcart_guanfnagdianpu,"蓝胖子电玩",R.drawable.main_shoppingcart_list10,"NS版十三机兵防卫圈来袭","简体中文;普通版","358"));

    }
}
