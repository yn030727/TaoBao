package com.example.taobao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //去除标题栏
        this.getSupportActionBar().hide();
        //获取底部导航栏实例
        bottomNavigation =findViewById(R.id.bottom_navigation);
        //保留icon原图颜色
        bottomNavigation.setItemIconTintList(null);
        //通过这一行代码这个工作的开关已经打开，打开读取导航图中第一个要显示的Fragment，然后显示在NavHostFragment
        NavController navController=Navigation.findNavController(this,R.id.nav_host_fragment);
        //将底部导航栏和导航控制器进行绑定
        NavigationUI.setupWithNavController(bottomNavigation,navController);
    }


}