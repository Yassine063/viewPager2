package com.example.viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2Employee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewPager2Employee = findViewById(R.id.viewPager2_employee);

        // Employee FragmentStateAdapter.
        EmployeeFragmentStateAdapter adapter = new EmployeeFragmentStateAdapter(this);
        this.viewPager2Employee.setAdapter(adapter);
    }
}