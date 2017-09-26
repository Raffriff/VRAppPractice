package com.example.david.vrapppractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class TMPPlans extends AppCompatActivity {

    ////////////////////////////Variables//////////////////////

    String plan;

    FrameLayout plan1;
    FrameLayout plan2;
    FrameLayout plan3;
    FrameLayout plan4;
    FrameLayout plan5;
    FrameLayout plan6;
    FrameLayout plan7;
    FrameLayout plan10;
    FrameLayout plan11;
    FrameLayout plan12;
    FrameLayout plan13;
    FrameLayout plan14;
    FrameLayout plan15;
    FrameLayout plan16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpplans);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////Variable ID's/////////////////////////

        plan1 = (FrameLayout) findViewById(R.id.plan1);
        plan2 = (FrameLayout) findViewById(R.id.plan2);
        plan3 = (FrameLayout) findViewById(R.id.plan3);
        plan4 = (FrameLayout) findViewById(R.id.plan4);
        plan5 = (FrameLayout) findViewById(R.id.plan5);
        plan6 = (FrameLayout) findViewById(R.id.plan6);
        plan7 = (FrameLayout) findViewById(R.id.plan7);
        plan10 = (FrameLayout) findViewById(R.id.plan10);
        plan11 = (FrameLayout) findViewById(R.id.plan11);
        plan12 = (FrameLayout) findViewById(R.id.plan12);
        plan13 = (FrameLayout) findViewById(R.id.plan13);
        plan14 = (FrameLayout) findViewById(R.id.plan14);
        plan15 = (FrameLayout) findViewById(R.id.plan15);
        plan16 = (FrameLayout) findViewById(R.id.plan16);

        ////////////////////////////////Set Visibilities//////////////////////////

        plan1.setVisibility(LinearLayout.GONE);
        plan2.setVisibility(LinearLayout.GONE);
        plan3.setVisibility(LinearLayout.GONE);
        plan4.setVisibility(LinearLayout.GONE);
        plan5.setVisibility(LinearLayout.GONE);
        plan6.setVisibility(LinearLayout.GONE);
        plan7.setVisibility(LinearLayout.GONE);
        plan10.setVisibility(LinearLayout.GONE);
        plan11.setVisibility(LinearLayout.GONE);
        plan12.setVisibility(LinearLayout.GONE);
        plan13.setVisibility(LinearLayout.GONE);
        plan14.setVisibility(LinearLayout.GONE);
        plan15.setVisibility(LinearLayout.GONE);
        plan16.setVisibility(LinearLayout.GONE);

        //////////////////////Plan Anchor//////////////////////
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            plan = extras.getString("plan");
        }

        //////////////////////Methods//////////////////////////

        if(plan.equals("1")){

            plan1.setVisibility(LinearLayout.VISIBLE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("2")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.VISIBLE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("3")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.VISIBLE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("4")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.VISIBLE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("5")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.VISIBLE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("6")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.VISIBLE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("7")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.VISIBLE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("10")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.VISIBLE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("11")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.VISIBLE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("12")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.VISIBLE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("13")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.VISIBLE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("14")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.VISIBLE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("15")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.VISIBLE);
            plan16.setVisibility(LinearLayout.GONE);

        }

        else if(plan.equals("16")){

            plan1.setVisibility(LinearLayout.GONE);
            plan2.setVisibility(LinearLayout.GONE);
            plan3.setVisibility(LinearLayout.GONE);
            plan4.setVisibility(LinearLayout.GONE);
            plan5.setVisibility(LinearLayout.GONE);
            plan6.setVisibility(LinearLayout.GONE);
            plan7.setVisibility(LinearLayout.GONE);
            plan10.setVisibility(LinearLayout.GONE);
            plan11.setVisibility(LinearLayout.GONE);
            plan12.setVisibility(LinearLayout.GONE);
            plan13.setVisibility(LinearLayout.GONE);
            plan14.setVisibility(LinearLayout.GONE);
            plan15.setVisibility(LinearLayout.GONE);
            plan16.setVisibility(LinearLayout.VISIBLE);

        }

    }

}
