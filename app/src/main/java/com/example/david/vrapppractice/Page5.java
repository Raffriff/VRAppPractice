package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////Button Variables////////////
        Button Yes9;
        Button No9;

        /////////////Button ID's/////////////////
        Yes9 = (Button) findViewById(R.id.Yes9);
        No9 = (Button) findViewById(R.id.No9);

        /////////////Button Events///////////////
        Yes9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page5.this, Page5a.class));
            }
        });

        No9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page5.this, Page6.class));
            }
        });
    }

}
