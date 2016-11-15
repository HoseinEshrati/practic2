package com.example.hosein.practic7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btsign=(Button)findViewById(R.id.signup);
        final Button btlog=(Button)findViewById(R.id.login);
        btsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent  = new Intent(MainActivity.this,Page2.class);
                startActivity(intent);



            }
        });

        btlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentlog = new Intent(MainActivity.this,Page3.class);
                startActivity(intentlog);

            }
        });
    }
}
