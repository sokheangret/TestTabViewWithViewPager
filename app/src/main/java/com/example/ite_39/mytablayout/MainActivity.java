package com.example.ite_39.mytablayout;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> title = Arrays.asList("A","B","C","D");
        List<Integer> icons = Arrays.asList(R.drawable.ic_call_,R.drawable.ic_contact,R.drawable.ic_favorite,R.drawable.ic_launcher_background);
        List<HomeFragment> fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new HomeFragment());

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragmentList, title,icons);

        ViewPager viewPager =  (ViewPager)findViewById(R.id.myViewPager);
        final TabLayout tabLayout = findViewById(R.id.myTabLayout);
        viewPager.setAdapter(myPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}
