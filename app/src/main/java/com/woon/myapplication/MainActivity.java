package com.woon.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.woon.myapplication.Fragment.ViewPagerAdater;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        ViewPagerAdater viewPagerAdater = new ViewPagerAdater(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdater);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.save:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.chat:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.contacts:
                        viewPager.setCurrentItem(2);
                        break;
                }
                return false;
            }
        });
    }

    private void initialize() {
        viewPager = findViewById(R.id.container);
        bottomNavigationView = findViewById(R.id.navigation);
    }
}
