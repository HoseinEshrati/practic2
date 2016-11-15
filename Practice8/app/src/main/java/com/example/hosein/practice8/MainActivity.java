package com.example.hosein.practice8;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.appname);


        Button  noti =(Button)findViewById(R.id.notify);
        Button  nonotiiifffff=(Button)findViewById(R.id.nonotiff);

        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnoti2222 = new Intent(MainActivity.this,Page2.class);
                startActivity(intentnoti2222);
            }
        });

        nonotiiifffff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentno1111 =new Intent(MainActivity.this,Page3.class);
                startActivity(intentno1111);
            }
        });


    }
}
