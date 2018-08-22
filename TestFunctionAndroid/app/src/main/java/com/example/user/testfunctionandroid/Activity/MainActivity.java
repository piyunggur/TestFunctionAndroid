package com.example.user.testfunctionandroid.Activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.user.testfunctionandroid.Adapter.Adapter;
import com.example.user.testfunctionandroid.Fragment.UserFragment;
import com.example.user.testfunctionandroid.R;

public class MainActivity extends AppCompatActivity{

    //set data
    //TextView text;

    ViewPager page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        
//        text = (TextView) findViewById(R.id.main_text);
//        Typeface typeface = Typeface.createFromAsset(this.getAssets(),"fonts/Kanit-Medium.ttf");
//        text.setTypeface(typeface);

        page = (ViewPager) findViewById(R.id.main_viewpage);
        Adapter adapter = new Adapter(getSupportFragmentManager(),this);
        page.setAdapter(adapter);

        BottomNavigationView bottomNavigation = findViewById(R.id.main_botttomnavigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationList);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationList =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment =null;

                    if(item.getItemId() == R.id.bottomnav_itemhome){
                        page.setCurrentItem(0);

                    }else if(item.getItemId() == R.id.bottomnav_itemshopping){
                        page.setCurrentItem(1);

                    }else if(item.getItemId() == R.id.bottomnav_itemuser) {
                        page.setCurrentItem(2);
                    }

                    return true;
                }
            };
}