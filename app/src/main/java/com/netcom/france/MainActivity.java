package com.netcom.france;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containers,new first()).commit();

    }
private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedfragment=null;
        switch (item.getItemId())
        {
            case R.id.home_tab:
            selectedfragment=new first();
            break;
            case R.id.msg_tab:
                selectedfragment=new second();
                break;
            case  R.id.net_tab:
                selectedfragment=new third();
                break;
            case  R.id.list_tab:
                selectedfragment=new fourth();
                break;
        }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_containers,selectedfragment).commit();
        return true;
    }
};
}