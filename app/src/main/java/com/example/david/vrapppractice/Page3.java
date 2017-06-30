package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////Button Variables////////////
        Button Yes5;
        Button No5;

        /////////////Button ID's/////////////////
        Yes5 = (Button) findViewById(R.id.Yes5);
        No5 = (Button) findViewById(R.id.No5);

        /////////////Button Events///////////////
        Yes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page3.this, Page3a.class));
            }
        });

        No5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page3.this, Page4.class));
            }
        });
    }

}
