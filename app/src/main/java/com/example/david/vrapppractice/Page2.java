package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class Page2 extends AppCompatActivity {

    ////////////Button Variables////////////
    Button ShowBoxA, ShowBoxC, Back1, Back2;

    ////////////Image Buttons///////////////
    ImageButton ShowBoxB;
    ImageButton WebSiteButt;

    ////////////Layout Variables///////////
    FrameLayout Box1, Box2, Box3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ////////////Button ID's/Instantiation/////////////////
        Back1 = (Button) findViewById(R.id.Back1);
        Back2 = (Button) findViewById(R.id.Back2);
        ShowBoxB = (ImageButton) findViewById(R.id.ShowBoxB);
        WebSiteButt = (ImageButton) findViewById(R.id.WebSiteButt);
        ShowBoxC = (Button) findViewById(R.id.ShowBoxC);

        ////////////Frame ID's//////////////////
        Box1 = (FrameLayout) findViewById(R.id.Box1);
        Box2 = (FrameLayout) findViewById(R.id.Box2);
        Box3 = (FrameLayout) findViewById(R.id.Box3);

        ////////////Set Start Views/////////////
        //Box1.setVisibility(View.VISIBLE);
        Box2.setVisibility(View.GONE);
        Box3.setVisibility(View.GONE);

        ////////////Button Events///////////////
        ShowBoxB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Box1.setVisibility(View.GONE);
                Box2.setVisibility(View.VISIBLE);
            }
        });

        ShowBoxC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Box2.setVisibility(View.GONE);
                Box3.setVisibility(View.VISIBLE);
            }
        });

        Back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Box2.setVisibility(View.GONE);
                Box1.setVisibility(View.VISIBLE);
            }
        });

        Back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Box3.setVisibility(View.GONE);
                Box2.setVisibility(View.VISIBLE);
            }
        });

        WebSiteButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, WebsiteNew.class));
            }
        });

    }

}
