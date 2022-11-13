package com.example.taobao.ui.Around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentHostCallback;

import com.example.taobao.R;

public class AroundDelicacies_Fragment extends Fragment {
    public static AroundDelicacies_Fragment newsInstance(){
        AroundDelicacies_Fragment aroundDelicacies_fragment=new AroundDelicacies_Fragment();
        return aroundDelicacies_fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=LayoutInflater.from(getContext()).inflate(R.layout.layout_around_fragment_delicacies,null);
        return v;
    }
}
