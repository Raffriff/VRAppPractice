package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Page2c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button Variables//////////////
        /*Button SheetJ1;
        Button SheetH1;

        ///////////////Button ID's///////////////////
        SheetJ1 = (Button) findViewById(R.id.SheetJ1);
        SheetH1 = (Button) findViewById(R.id.SheetH1);

        ///////////////Button Events/////////////////
        SheetJ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2c.this, SheetJ.class));
            }
        });

        SheetH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2c.this, PageH.class));
            }
        });*/
    }

}
