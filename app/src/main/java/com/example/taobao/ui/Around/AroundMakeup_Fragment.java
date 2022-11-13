package com.example.taobao.ui.Around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taobao.R;

public class AroundMakeup_Fragment extends Fragment {
    public static AroundMakeup_Fragment newsInstance(){
        AroundMakeup_Fragment aroundMakeup_fragment=new AroundMakeup_Fragment();
        return aroundMakeup_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.layout_around_fragment_makeup,null);
        return v;
    }
}
