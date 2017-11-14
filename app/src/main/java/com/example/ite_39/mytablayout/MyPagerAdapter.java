package com.example.ite_39.mytablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ITE_39 on 14-Nov-17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    List<HomeFragment> fragmentList;
    List<String> titles;
    List<Integer> icons;
    public MyPagerAdapter(FragmentManager fm,List<HomeFragment> fragmentList, List<String> titles,List<Integer> icons) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titles = titles;
        this.icons = icons;
    }

    @Override
    public HomeFragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
      return titles.get(position);
    }

    public List<Integer> getIcons() {
        return icons;
    }
}
