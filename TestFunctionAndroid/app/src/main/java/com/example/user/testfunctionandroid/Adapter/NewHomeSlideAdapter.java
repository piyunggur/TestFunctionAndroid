package com.example.user.testfunctionandroid.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.testfunctionandroid.Fragment.HomeFragment;
import com.example.user.testfunctionandroid.Fragment.ShoppingFragment;
import com.example.user.testfunctionandroid.Fragment.UserFragment;

public class NewHomeSlideAdapter extends FragmentPagerAdapter {

    private final int pageNumber = 3;
    private Context context;
    public NewHomeSlideAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new HomeFragment();
        }else if(position == 1){
            return new ShoppingFragment();
        }else if(position == 2){
            return new UserFragment();
        }

        //LockableViewPager lockableViewPager = new LockableViewPager(context);
        return null;
    }

    @Override
    public int getCount() {
        return pageNumber;
    }

}
