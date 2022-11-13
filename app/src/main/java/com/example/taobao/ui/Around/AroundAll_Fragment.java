package com.example.taobao.ui.Around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taobao.R;

public class AroundAll_Fragment extends Fragment {
    public static AroundAll_Fragment newsInstance(){
        AroundAll_Fragment aroundAll_fragment=new AroundAll_Fragment();
        return aroundAll_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.layout_around_fragment_all,null);
        return v;
    }
}
