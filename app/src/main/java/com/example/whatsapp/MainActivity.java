package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        viewPager=(ViewPager) findViewById(R.id.viewpager_id);


        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new FragmentCall(),"");
        viewPagerAdapter.AddFragment(new FragmentContact(),"");
        viewPagerAdapter.AddFragment(new FragmentStatus(),"");
        viewPager.setAdapter(viewPagerAdapter);

tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.call);
        tabLayout.getTabAt(1).setIcon(R.drawable.contact);
        tabLayout.getTabAt(2).setIcon(R.drawable.status);
    }
}