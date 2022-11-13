package com.example.taobao.ui.Around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.taobao.R;

public class AroundTwo11_Fragment extends Fragment {
    public static AroundTwo11_Fragment newsInstance(){
        AroundTwo11_Fragment aroundTwo11_fragment=new AroundTwo11_Fragment();
        return aroundTwo11_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.layout_around_fragment_two11,null);
        return v;
    }
}
