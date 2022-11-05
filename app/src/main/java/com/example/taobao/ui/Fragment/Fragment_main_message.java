package com.example.taobao.ui.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taobao.R;
import com.example.taobao.Unfinish_Activity;
import com.example.taobao.logic.main_message;
import com.example.taobao.ui.message.MessageAdapter;
import com.example.taobao.ui.message.MessageSearch_Activity;

import java.util.ArrayList;
import java.util.List;

public class Fragment_main_message extends Fragment implements View.OnClickListener {
    private List<main_message> mainMessageList;
    private RecyclerView recyclerView;
    private MessageAdapter messageAdapter;
    private Button button_search;
    private Button button_add;
/*    private int mDistanceY;
    Toolbar mToolbar;*/
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main_message,container,false);
        mainMessageList=new ArrayList<main_message>();
        initMessage();
        //获取实例
        recyclerView=view.findViewById(R.id.main_message_recyclerView);
        button_search=view.findViewById(R.id.main_message_searchbutton);
        button_add=view.findViewById(R.id.bar_message_add);
        Button btn2=view.findViewById(R.id.bar_message_contact);
        Button btn3=view.findViewById(R.id.main_message_bell);
        Button btn4=view.findViewById(R.id.main_message_aite);
        Button btn5=view.findViewById(R.id.main_message_redbox);
        Button btn6=view.findViewById(R.id.main_message_coupon);
/*        mToolbar=view.findViewById(R.id.toolbar2);*/
        //RecyclerView的基本操作
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(view.getContext());
        messageAdapter=new MessageAdapter(mainMessageList);
        recyclerView.setAdapter(messageAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
/*        //滑动达成ToolBar变色
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView,dx,dy);
                mDistanceY +=dy;
                int toolbarHeight=mToolbar.getBottom();
                if(mDistanceY<=toolbarHeight){
                    float scale=(float)mDistanceY/toolbarHeight;
                    float alpha=scale*255;
                    mToolbar.setBackgroundColor(Color.argb((int)alpha,255,255,255));
                }else{
                    mToolbar.setBackgroundResource(R.color.white);
                }
            }
        });*/
/*        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), MessageSearch_Activity.class);
                Log.d("Fragment_main_message","begin");
                startActivity(intent);
            }
        });

        //点击add按钮弹出PopupWindow窗口
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //将布局文件加载到PopupWindow文件中
                View popView=getLayoutInflater().inflate(R.layout.layout_message_add_popupwindow,null);
                //new中间的两个参数是窗口的大小
                PopupWindow popupWindow=new PopupWindow(popView,270,ViewGroup.LayoutParams.WRAP_CONTENT,true);
                //表示相对于v控件(这里是按钮)的位置，负数是左和上，正数是右和下
                popupWindow.showAsDropDown(v,-210,37);
            }
        });*/
        button_add.setOnClickListener(this);
        button_search.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public void initMessage(){
        mainMessageList.add(new main_message(R.drawable.main_message_head_handsomeboy,"鱼纸匠 纸艺美学","非常感谢您的支持！我们会尽快根据您...","22/11/03"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_bluecar,"交易物流","您的订单即将自动确认收获","22/11/03"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_dashu,"tb077917367519","亲，对tb0799...的服务满意吗？","22/10/23"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_taobaotou,"xuperfect88","好了亲","22/08/31"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_fuwutongzhi,"服务通知","你有128个淘金币可领取","22/08/24"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_xiaodian,"愚昧的天才的小店","暂无新消息","22/08/24"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_green2girl,"XFlutter","在","22/08/08"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_greenboy,"HelloDemo","如果加不上的话，就留言一下联系方式","22/07/31"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_greengirl,"AA喜悦萌宠","您今日还未咨询客服，咨询后再来评价吧","22/07/31"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_orange2girl,"洛洛科技店","需要吗亲","22/07/31"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_orangegril,"倾城酷玩","亲 你好可以看看需要哪个套餐","22/07/24"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_microsoft,"Microsoft系统商城","您24小时以内已评价过该客服啦","22/07/23"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_google,"Google公司3G分部","6","22/03/13"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_zhangzy,"张泽宇","我当时是年级第一，我还喝了两瓶45度的朗姆酒","22/02/02"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_zhaixb,"翟旭博","长相是下限，人品是上限","22/01/31"));
        mainMessageList.add(new main_message(R.drawable.main_message_head_fuzq,"傅梓棋","6","22/01/25"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_message_searchbutton:{
                Intent intent=new Intent(getActivity(), MessageSearch_Activity.class);
                Log.d("Fragment_main_message","begin");
                startActivity(intent);
                break;
            }
            case R.id.bar_message_add:{
                //将布局文件加载到PopupWindow文件中
                View popView=getLayoutInflater().inflate(R.layout.layout_message_add_popupwindow,null);
                //new中间的两个参数是窗口的大小
                PopupWindow popupWindow=new PopupWindow(popView,270,ViewGroup.LayoutParams.WRAP_CONTENT,true);
                //表示相对于v控件(这里是按钮)的位置，负数是左和上，正数是右和下
                popupWindow.showAsDropDown(v,-210,37);
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
