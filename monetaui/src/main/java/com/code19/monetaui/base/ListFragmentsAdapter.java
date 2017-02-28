package com.code19.monetaui.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ghost on 2017/2/28.
 * 用于一个Activity中多个Fragment的Adapter
 */

public class ListFragmentsAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mFragmentsTitle;

    public ListFragmentsAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    public ListFragmentsAdapter(FragmentManager fm, List<Fragment> fragments, List<String> fragmenttitls) {
        super(fm);
        this.mFragments = fragments;
        this.mFragmentsTitle = fragmenttitls;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentsTitle.get(position);
    }
}
