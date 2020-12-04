package com.example.adminangkut;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.adminangkut.databinding.ActivityMainBinding;
import com.example.adminangkut.ui.adapter.ViewPagerAdapter;
import com.example.adminangkut.ui.home.BiayaFragment;
import com.example.adminangkut.ui.home.DriverFragment;
import com.example.adminangkut.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home){
                    setFragment(new HomeFragment());
                }else if (item.getItemId() == R.id.nav_biaya){
                    setFragment(new BiayaFragment());
                }else if (item.getItemId() == R.id.nav_driver){
                    setFragment(new DriverFragment());
                }

                return true;
            }
        });

        setFragment(new HomeFragment());

        FirebaseMessaging.getInstance().subscribeToTopic("all");

    }
    public void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(binding.frameMain.getId(), fragment);
        transaction.commit();
    }


}