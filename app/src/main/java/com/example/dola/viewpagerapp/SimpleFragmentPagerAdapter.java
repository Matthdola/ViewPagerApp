package com.example.dola.viewpagerapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0){
            return new MondayFragment();

        } else if(i == 1){
            return new TuesdayFragment();

        } else if (i == 2){
            return new  WednesdayFragment();

        } else if(i == 3){
            return new ThursdayFragment();

        } else {
            return new FridayFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
