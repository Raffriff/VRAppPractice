package com.example.david.vrapppractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class TMPPlans_2 extends AppCompatActivity {

    ////////////////////////////Variables//////////////////////

    String plan;

    FrameLayout plan43;
    FrameLayout plan46;
    FrameLayout plan48;
    FrameLayout plan50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpplans_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////Variable ID's/////////////////////////

        plan43 = (FrameLayout) findViewById(R.id.plan43);
        plan46 = (FrameLayout) findViewById(R.id.plan46);
        plan48 = (FrameLayout) findViewById(R.id.plan48);
        plan50 = (FrameLayout) findViewById(R.id.plan50);

        ////////////////////////////////Set Visibilities//////////////////////////

        plan43.setVisibility(LinearLayout.GONE);
        plan46.setVisibility(LinearLayout.GONE);
        plan48.setVisibility(LinearLayout.GONE);
        plan50.setVisibility(LinearLayout.GONE);

        //////////////////////Plan Anchor//////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            plan = extras.getString("plan");
        }

        //////////////////////Methods//////////////////////////

        if(plan.equals("43")){

            plan43.setVisibility(LinearLayout.VISIBLE);
            plan46.setVisibility(LinearLayout.GONE);
            plan48.setVisibility(LinearLayout.GONE);
            plan50.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("46")){

            plan43.setVisibility(LinearLayout.GONE);
            plan46.setVisibility(LinearLayout.VISIBLE);
            plan48.setVisibility(LinearLayout.GONE);
            plan50.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("48")){

            plan43.setVisibility(LinearLayout.GONE);
            plan46.setVisibility(LinearLayout.GONE);
            plan48.setVisibility(LinearLayout.VISIBLE);
            plan50.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("50")) {

            plan43.setVisibility(LinearLayout.GONE);
            plan46.setVisibility(LinearLayout.GONE);
            plan48.setVisibility(LinearLayout.GONE);
            plan50.setVisibility(LinearLayout.VISIBLE);

        }

    }

}
