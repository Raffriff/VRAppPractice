package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page2a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////Button Variables////////////
        Button Yes3;
        Button No3;

        /////////////Button ID's/////////////////
        Yes3 = (Button) findViewById(R.id.Yes3);
        No3 = (Button) findViewById(R.id.No2);

        /////////////Button Events///////////////
        Yes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2a.this, Page2c.class));
            }
        });

        No3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2a.this, Page2b.class));
            }
        });
    }

}
