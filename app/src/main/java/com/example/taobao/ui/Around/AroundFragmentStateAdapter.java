package com.example.taobao.ui.Around;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

//用来加载每一页的布局
public class AroundFragmentStateAdapter extends FragmentStateAdapter {

    private List<Fragment> fragments;

    public AroundFragmentStateAdapter(@NonNull FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        super(fragmentActivity);
        fragments=arrayList;
    }

    public AroundFragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,ArrayList<Fragment> arrayList) {
        super(fragmentManager, lifecycle);
        fragments=arrayList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
