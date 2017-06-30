package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page4a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////Button Variables////////////
        //Button Minor;
        //Button OneMajor;
        Button TwoMajor;

        /////////////Button ID's/////////////////
        //Minor = (Button) findViewById(R.id.Minor);
        //OneMajor = (Button) findViewById(R.id.OneMajor);
        TwoMajor = (Button) findViewById(R.id.TwoMajor);

        /////////////Button Events///////////////
        /*Minor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page4a.this, SheetC.class));
            }
        });

        OneMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page4a.this, SheetD.class));
            }
        });*/

        TwoMajor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page4a.this, Refer.class));
            }
        });
    }

}
