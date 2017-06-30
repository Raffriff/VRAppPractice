package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SheetA4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheet_a4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button Variables//////////////
        Button LessThan2;
        Button MoreThan2;

        ///////////////Button ID's///////////////////
        LessThan2 = (Button) findViewById(R.id.LessThan2);
        MoreThan2 = (Button) findViewById(R.id.MoreThan2);

        ///////////////Button Events/////////////////
        LessThan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA4.this, Plan5.class));
            }
        });

        MoreThan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SheetA4.this, Plan3.class));
            }
        });
    }

}
