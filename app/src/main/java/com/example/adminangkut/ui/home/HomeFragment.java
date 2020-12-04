package com.example.adminangkut.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.adminangkut.R;
import com.example.adminangkut.databinding.FragmentHomeBinding;
import com.example.adminangkut.ui.adapter.ViewPagerAdapter;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), getActivity());
        binding.vpTab.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.vpTab);

    }

    @Override
    public void onResume() {
        super.onResume();
    }
}