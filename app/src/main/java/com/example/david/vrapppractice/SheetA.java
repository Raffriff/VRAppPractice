package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SheetA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheeta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button Variables//////////////
        Button Yes13;
        Button No13;

        ///////////////Button ID's///////////////////
        Yes13 = (Button) findViewById(R.id.Yes13);
        No13 = (Button) findViewById(R.id.No13);

        ///////////////Button Events/////////////////
        Yes13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA.this, SheetA1.class));
            }
        });

        No13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA.this, Plan7.class));
            }
        });
    }

}
