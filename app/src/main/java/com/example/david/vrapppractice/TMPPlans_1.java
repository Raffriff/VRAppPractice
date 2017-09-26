package com.example.david.vrapppractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class TMPPlans_1 extends AppCompatActivity {

    ////////////////////////////////////Variables/////////////////////////////////////
    String plan;

    FrameLayout plan18;
    FrameLayout plan20;
    FrameLayout plan21;
    FrameLayout plan22;
    FrameLayout plan23;
    FrameLayout plan24;
    FrameLayout plan30;
    FrameLayout plan31;
    FrameLayout plan32;
    FrameLayout plan33;
    FrameLayout plan40;
    FrameLayout plan41;
    FrameLayout plan42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpplans_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////////////////Variable ID's///////////////////////////////////////
        plan18 = (FrameLayout) findViewById(R.id.plan18);
        plan20 = (FrameLayout) findViewById(R.id.plan20);
        plan21 = (FrameLayout) findViewById(R.id.plan21);
        plan22 = (FrameLayout) findViewById(R.id.plan22);
        plan23 = (FrameLayout) findViewById(R.id.plan23);
        plan24 = (FrameLayout) findViewById(R.id.plan24);
        plan30 = (FrameLayout) findViewById(R.id.plan30);
        plan31 = (FrameLayout) findViewById(R.id.plan31);
        plan32 = (FrameLayout) findViewById(R.id.plan32);
        plan33 = (FrameLayout) findViewById(R.id.plan33);
        plan40 = (FrameLayout) findViewById(R.id.plan40);
        plan41 = (FrameLayout) findViewById(R.id.plan41);
        plan42 = (FrameLayout) findViewById(R.id.plan42);

        //////////////////////Plan Anchor//////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            plan = extras.getString("plan");
        }

        if(plan.equals("18")){

            plan18.setVisibility(LinearLayout.VISIBLE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("20")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.VISIBLE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("21")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.VISIBLE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("22")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.VISIBLE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("23")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.VISIBLE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("24")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.VISIBLE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("30")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.VISIBLE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("31")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.VISIBLE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("32")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.VISIBLE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("33")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.VISIBLE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("40")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.VISIBLE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("41")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.VISIBLE);
            plan42.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("42")){

            plan18.setVisibility(LinearLayout.GONE);
            plan20.setVisibility(LinearLayout.GONE);
            plan21.setVisibility(LinearLayout.GONE);
            plan22.setVisibility(LinearLayout.GONE);
            plan23.setVisibility(LinearLayout.GONE);
            plan24.setVisibility(LinearLayout.GONE);
            plan30.setVisibility(LinearLayout.GONE);
            plan31.setVisibility(LinearLayout.GONE);
            plan32.setVisibility(LinearLayout.GONE);
            plan33.setVisibility(LinearLayout.GONE);
            plan40.setVisibility(LinearLayout.GONE);
            plan41.setVisibility(LinearLayout.GONE);
            plan42.setVisibility(LinearLayout.VISIBLE);

        }

    }

}
