package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SheetA1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_a1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button Variables//////////////
        Button MoreThan1;
        Button LessThan1;

        ///////////////Button ID's///////////////////
        MoreThan1 = (Button) findViewById(R.id.MoreThan1);
        LessThan1 = (Button) findViewById(R.id.LessThan1);

        ///////////////Button Events/////////////////
        MoreThan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA1.this, Plan7.class));
            }
        });

        LessThan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA1.this, SheetA2.class));
            }
        });
    }

}
