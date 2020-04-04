package com.example.submission2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter ( getSupportFragmentManager () , this );
        ViewPager viewPager = findViewById ( R.id.view_pager );
        viewPager.setAdapter ( sectionsPagerAdapter );
        TabLayout tabLayout = findViewById ( R.id.tabs );
        tabLayout.setupWithViewPager ( viewPager );

        getSupportActionBar ().setElevation ( 0 );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()){
            case R.id.setting:
                Intent mIntent = new Intent( Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);;
                return true;
            default:
                return true;
        }
    }
}
