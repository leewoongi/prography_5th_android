package com.woon.myapplication.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class ViewPagerAdater extends FragmentPagerAdapter {

    private ArrayList<Fragment> list = new ArrayList<>();

    public ViewPagerAdater(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        list.add(new CallFragment());
        list.add(new ChatFragment());
        list.add(new ContactsFragment());
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
