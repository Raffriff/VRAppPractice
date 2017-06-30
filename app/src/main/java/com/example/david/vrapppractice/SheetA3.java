package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SheetA3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_a3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button Variables//////////////
        Button Minor1;
        Button Major1;

        ///////////////Button ID's///////////////////
        Minor1 = (Button) findViewById(R.id.Minor1);
        Major1 = (Button) findViewById(R.id.Major1);

        ///////////////Button Events/////////////////
        Minor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA3.this, Plan3.class));
            }
        });

        Major1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA3.this, SheetA4.class));
            }
        });
    }

}
