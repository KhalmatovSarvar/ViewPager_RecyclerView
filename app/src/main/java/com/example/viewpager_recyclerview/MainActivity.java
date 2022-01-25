package com.example.viewpager_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager_recyclerview.adapter.ViewPagerAdapter;
import com.example.viewpager_recyclerview.fragments.Page1;
import com.example.viewpager_recyclerview.fragments.Page2;
import com.example.viewpager_recyclerview.fragments.Page3;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = findViewById(R.id.viewpager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new Page1(),"Contacts");
        viewPagerAdapter.add(new Page2(),"Users");
        viewPagerAdapter.add(new Page3(),"Posts");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);
    }
}