package com.example.hosein.practice8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Button buttonreg00=(Button)findViewById(R.id.regbtn111100);

        buttonreg00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent logintent = new Intent(Page2.this,Page3.class);
                startActivity(logintent);

            }
        });


    }


}
