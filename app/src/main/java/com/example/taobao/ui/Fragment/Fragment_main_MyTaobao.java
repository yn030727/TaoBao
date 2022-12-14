package com.example.taobao.ui.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.Unfinish_Activity;
import com.example.taobao.logic.ImageBean;
import com.example.taobao.logic.main_taobao_function;
import com.example.taobao.ui.MyTaoBao.ImageAdapter;
import com.example.taobao.ui.MyTaoBao.TaobaoAdapter;
import com.example.taobao.ui.MyTaoBao.TaobaoBackMoney_Activity;
import com.example.taobao.ui.MyTaoBao.TaobaoNoMoney_Activity;
import com.example.taobao.ui.MyTaoBao.TaobaoOrders_Activity;
import com.example.taobao.ui.MyTaoBao.TaobaoPerson_Activity;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fragment_main_MyTaobao extends Fragment implements View.OnClickListener {
    private CircleImageView ImageViewbtn ;
    private TextView editSaying;
    private Button taoyouquan;
    private Button cardView1;
    private Button two11;
    private ImageView waitMoney;
    private ImageView fahuo;
    private ImageView shouhuo;
    private ImageView pingjia;
    private ImageView tuikuan;
    private RecyclerView recyclerView;
    private List<main_taobao_function> functionList;
    private TaobaoAdapter taobaoAdapter;
    private Button quchongzhi;
    private Banner banner;
    private List<ImageBean> beanList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frgment_main_mytaobao,container,false);

        //????????????
        ImageViewbtn =view.findViewById(R.id.circleImageView);//????????????
        editSaying = view.findViewById(R.id.main_taobao_textView2);//????????????
        taoyouquan = view.findViewById(R.id.main_taobao_person_friend);//?????????
        two11= view.findViewById(R.id.main_mytaobao_two11);//?????????11
        recyclerView=view.findViewById(R.id.main_taobao_recyclerview);
        waitMoney=view.findViewById(R.id.imageView4);
        fahuo=view.findViewById(R.id.imageView5);
        shouhuo=view.findViewById(R.id.imageView6);
        pingjia=view.findViewById(R.id.imageView7);
        tuikuan=view.findViewById(R.id.imageView8);
        quchongzhi=view.findViewById(R.id.main_taobao_zeromoney_chong);
        banner = view.findViewById(R.id.main_taobao_banner);//???????????????
        //????????????
        ImageViewbtn.setOnClickListener(this);
        editSaying.setOnClickListener(this);
        taoyouquan.setOnClickListener(this);
        two11.setOnClickListener(this);
        waitMoney.setOnClickListener(this);
        fahuo.setOnClickListener(this);
        shouhuo.setOnClickListener(this);
        pingjia.setOnClickListener(this);
        tuikuan.setOnClickListener(this);
        quchongzhi.setOnClickListener(this);


        //??????RecyclerView
        functionList=new ArrayList<>();
        inittaobao();
        GridLayoutManager layoutManager=new GridLayoutManager(view.getContext(),2);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        taobaoAdapter=new TaobaoAdapter(functionList);
        recyclerView.setAdapter(taobaoAdapter);
        recyclerView.setLayoutManager(layoutManager);

        //???????????????
        beanList =new ArrayList<>();
        initdata();
        banner.setAdapter(new ImageAdapter(getActivity(),beanList));
        banner.isAutoLoop(true);//????????????????????????true
        banner.setIndicator(new CircleIndicator(getActivity()));//???????????????
        banner.start();

        return view;
    }
    //??????????????????????????????????????????????????????????????????
    public void inittaobao() {
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_redbox, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_chengjiu, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_huabei, "??????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_kefu, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_wodekuaidi, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_chonghuafei, "?????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_lianlian, "???????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_allmoney, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_shouhuo, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_doudizhu, "???????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_wodepingjia, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_lingquan, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_xianzhi, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_shiyong, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_kefu, "????????????"));
        functionList.add(new main_taobao_function(R.drawable.main_taobao_recycler_more, "??????"));
    }
    //??????????????????????????????????????????????????????
    public void initdata(){
        beanList.add(new ImageBean(R.drawable.main_taobao_first_image));
        beanList.add(new ImageBean(R.drawable.main_taobao_second_image));
        beanList.add(new ImageBean(R.drawable.main_taobao_third_image));
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.circleImageView:
            case R.id.main_taobao_textView2: {
                //????????????
                Intent intent=new Intent(getActivity(), TaobaoPerson_Activity.class);
                startActivity(intent);
                break;
            }//????????????
            case R.id.imageView8:{
                Intent intent=new Intent(getActivity(), TaobaoBackMoney_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.main_taobao_zeromoney_chong:{
                Intent intent=new Intent(getActivity(), TaobaoNoMoney_Activity.class);
                startActivity(intent);
                break;
            }
            case R.id.imageView4:
            case R.id.imageView5:
            case R.id.imageView6:
            case R.id.imageView7:{
                Intent intent=new Intent(getActivity(), TaobaoOrders_Activity.class);
                startActivity(intent);
                break;
            }
            default:{
                Intent intent=new Intent(getActivity(), Unfinish_Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
