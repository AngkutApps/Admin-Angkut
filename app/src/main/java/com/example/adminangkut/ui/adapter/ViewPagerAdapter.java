package com.example.adminangkut.ui.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.adminangkut.ui.home.PesananSekarangFragment;
import com.example.adminangkut.ui.home.PesananTerjadwalFragment;

import java.util.ArrayList;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    Context context;

    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);

        this.context = context;

        fragments = new ArrayList<>();
        fragments.add(new PesananSekarangFragment());
        fragments.add(new PesananTerjadwalFragment());

        titles = new ArrayList<>();
        titles.add("Sekarang");
        titles.add("Terjadwal");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
