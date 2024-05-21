package com.example.testpas2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testpas2.fragments.League1;
import com.example.testpas2.fragments.League2;
import com.example.testpas2.fragments.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomePage extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    League1 league1 = new League1();
    League2 league2 = new League2();

    Profile profile = new Profile();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bottomNavigationView = findViewById(R.id.bottomNavbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,league1).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();

                if(itemId == R.id.leagueEnglish){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,league1).commit();
                }else if(itemId == R.id.leagueSpanyol){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,league2).commit();
                }else{
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,profile).commit();
                }
                return true;
            }
        });
    }
}