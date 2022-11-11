package com.example.taobao.ui.ShoppingCart;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//RecyclerView没有可以直接设置间距的属性
//但内部有一个ItemDecoration，可以用它来装饰item，所以继承重写ItemDecoration就可以实现间距了
//这里只介绍了一个简单的LinearLayoutManager来设置间距的辅助类，没有介绍GridLayoutManager
public class commodityItemDecoration extends RecyclerView.ItemDecoration {
    private int space;
    //传进来一个距离参数
    public commodityItemDecoration(int space){
        this.space=space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.bottom=space;
        //设置左右间距
        //outRect.left=space;
        //outRect.right=space;
        if(parent.getChildLayoutPosition(view)==0){
            outRect.top=space;
        }
    }
}
