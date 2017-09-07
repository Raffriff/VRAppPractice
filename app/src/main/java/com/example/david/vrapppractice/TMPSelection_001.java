package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class TMPSelection_001 extends AppCompatActivity {


    ScrollView scrollView;

    FrameLayout FrameLayoutSheet0_ReferToInspector_1;
    FrameLayout FrameLayoutSheet0_ReferToInspector_2;
    FrameLayout FrameLayoutSheet0_ReferToInspector_3;
    FrameLayout FrameLayoutSheet0_ReferToInspector_4;

    FrameLayout FrameLayoutSheet0_2;
    FrameLayout FrameLayoutSheet0_2_1;
    FrameLayout FrameLayoutSheet0_2_1_1;
    FrameLayout FrameLayoutSheet0_2_2;

    FrameLayout FrameLayoutSheet0_3;
    FrameLayout FrameLayoutSheet0_3_1;
    FrameLayout FrameLayoutSheet0_3_2;
    FrameLayout FrameLayoutSheet0_3_2_1;
    FrameLayout FrameLayoutSheet0_4;
    FrameLayout FrameLayoutSheet0_4_1;
    FrameLayout FrameLayoutSheet0_4_1_1;
    FrameLayout FrameLayoutSheet0_4_1_2;

    FrameLayout FrameLayoutSheet0_5;
    FrameLayout FrameLayoutSheet0_5_1;
    FrameLayout FrameLayoutSheet0_5_1_1;

    FrameLayout FrameLayoutSheet0_6;
    FrameLayout FrameLayoutSheet0_6_1;
    //FrameLayout FrameLayoutSheetk_Reinstatment_Yes_Answer1;
    //FrameLayout FrameLayoutSheetk_Reinstatment_No_Answer;

    CheckBox CKSheet0_1_Tickbox_No;
    CheckBox CKSheet0_1_Tickbox_Yes;

    CheckBox CKSheet0_2_Tickbox_No;
    CheckBox CKSheet0_2_Tickbox_Yes;

    CheckBox CKSheet0_2_1_Tickbox_Yes;
    CheckBox CKSheet0_2_1_Tickbox_No;

    CheckBox CKSheet0_2_1_1_Tickbox_Yes;
    CheckBox CKSheet0_2_1_1_Tickbox_No;

    CheckBox CKSheet0_2_2_Tickbox_Yes;
    CheckBox CKSheet0_2_2_Tickbox_No;

    CheckBox CKSheet0_3_Tickbox_No;
    CheckBox CKSheet0_3_Tickbox_Yes;

    CheckBox CKSheet0_3_1_Tickbox_No;
    CheckBox CKSheet0_3_1_Tickbox_Yes;

    CheckBox CKSheet0_3_2_Tickbox_No;
    CheckBox CKSheet0_3_2_Tickbox_Yes;

    CheckBox CKSheet0_3_2_1_Tickbox_No;
    CheckBox CKSheet0_3_2_1_Tickbox_Yes;

    CheckBox CKSheet0_4_Tickbox_No;
    CheckBox CKSheet0_4_Tickbox_Yes;

    CheckBox CKSheet0_4_1_Tickbox_No;
    CheckBox CKSheet0_4_1_Tickbox_Yes;

    CheckBox CKSheet0_4_1_1_Tickbox_No;
    CheckBox CKSheet0_4_1_1_Tickbox_Yes;

    CheckBox CKSheet0_4_1_2_Tickbox_No;
    CheckBox CKSheet0_4_1_2_Tickbox_Yes;

    CheckBox CKSheet0_5_Tickbox_No;
    CheckBox CKSheet0_5_Tickbox_Yes;

    CheckBox CKSheet0_5_1_Tickbox_No;
    CheckBox CKSheet0_5_1_Tickbox_Yes;

    CheckBox CKSheet0_5_1_1_Tickbox_No;
    CheckBox CKSheet0_5_1_1_Tickbox_Yes;

    CheckBox CKSheet0_6_Tickbox_No;
    CheckBox CKSheet0_6_Tickbox_Yes;

    CheckBox CKSheet0_6_1_Tickbox_No;
    CheckBox CKSheet0_6_1_Tickbox_Yes;




    Boolean FrameLayoutSheet0_Road_RefertoInspectorpressed = false;
    Boolean FrameLayoutSheet0_Reinstatmentpressed = false;
    Boolean FrameLayoutSheet0_Reinstatment_minorpressed = false;
    Boolean FrameLayoutSheet0_Reinstatment_Allstoppressed = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpselection_001);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        scrollView = (ScrollView) findViewById(R.id.scrollView);

        CKSheet0_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_1_Tickbox_No);
        CKSheet0_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_1_Tickbox_Yes);

        CKSheet0_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_2_Tickbox_Yes);
        CKSheet0_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_2_Tickbox_No);

        CKSheet0_2_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_2_1_Tickbox_Yes);
        CKSheet0_2_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_2_1_Tickbox_No);

        CKSheet0_2_1_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_2_1_1_Tickbox_Yes);
        CKSheet0_2_1_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_2_1_1_Tickbox_No);

        CKSheet0_2_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_2_2_Tickbox_Yes);
        CKSheet0_2_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_2_2_Tickbox_No);

        CKSheet0_3_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_3_Tickbox_No);
        CKSheet0_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_3_Tickbox_Yes);

        CKSheet0_3_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_3_1_Tickbox_No);
        CKSheet0_3_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_3_1_Tickbox_Yes);

        CKSheet0_3_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_3_2_Tickbox_No);
        CKSheet0_3_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_3_2_Tickbox_Yes);

        CKSheet0_3_2_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_3_2_1_Tickbox_No);
        CKSheet0_3_2_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_3_2_1_Tickbox_Yes);

        CKSheet0_4_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_4_Tickbox_No);
        CKSheet0_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_4_Tickbox_Yes);

        CKSheet0_4_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_4_1_Tickbox_No);
        CKSheet0_4_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_4_1_Tickbox_Yes);

        CKSheet0_4_1_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_4_1_1_Tickbox_No);
        CKSheet0_4_1_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_4_1_1_Tickbox_Yes);

        CKSheet0_4_1_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_4_1_2_Tickbox_No);
        CKSheet0_4_1_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_4_1_2_Tickbox_Yes);

        CKSheet0_5_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_5_Tickbox_No);
        CKSheet0_5_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_5_Tickbox_Yes);

        CKSheet0_5_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_5_1_Tickbox_No);
        CKSheet0_5_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_5_1_Tickbox_Yes);

        CKSheet0_5_1_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_5_1_1_Tickbox_No);
        CKSheet0_5_1_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_5_1_1_Tickbox_Yes);

        CKSheet0_6_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_6_Tickbox_No);
        CKSheet0_6_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_6_Tickbox_Yes);

        CKSheet0_6_1_Tickbox_No = (CheckBox) findViewById(R.id.CKSheet0_6_1_Tickbox_No);
        CKSheet0_6_1_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheet0_6_1_Tickbox_Yes);

        FrameLayoutSheet0_ReferToInspector_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_ReferToInspector_1);
        FrameLayoutSheet0_ReferToInspector_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_ReferToInspector_2);
        FrameLayoutSheet0_ReferToInspector_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_ReferToInspector_3);
        FrameLayoutSheet0_ReferToInspector_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_ReferToInspector_4);

        FrameLayoutSheet0_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_2);
        FrameLayoutSheet0_2_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_2_1);
        FrameLayoutSheet0_2_1_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_2_1_1);
        FrameLayoutSheet0_2_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_2_2);


        FrameLayoutSheet0_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_3);
        FrameLayoutSheet0_3_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_3_1);
        FrameLayoutSheet0_3_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_3_2);
        FrameLayoutSheet0_3_2_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_3_2_1);

        FrameLayoutSheet0_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_4);
        FrameLayoutSheet0_4_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_4_1);
        FrameLayoutSheet0_4_1_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_4_1_1);
        FrameLayoutSheet0_4_1_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_4_1_2);

        FrameLayoutSheet0_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_5);
        FrameLayoutSheet0_5_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_5_1);
        FrameLayoutSheet0_5_1_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_5_1_1);

        FrameLayoutSheet0_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_6);
        FrameLayoutSheet0_6_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheet0_6_1);

        //FrameLayoutSheetk_Reinstatment_Yes_Answer = (FrameLayout) findViewById(R.id.FrameLayoutSheetk_Reinstatment_Yes_Answer);
        //FrameLayoutSheetk_Reinstatment_No_Answer = (FrameLayout) findViewById(R.id.FrameLayoutSheetk_Reinstatment_No_Answer);




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// FrameLayoutSheet0_Road /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);


        CKSheet0_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_1_Tickbox_Yes.isChecked()) {
                    if (FrameLayoutSheet0_Road_RefertoInspectorpressed == false) ;
                    {
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    CKSheet0_1_Tickbox_No.setChecked(false);
                    CKSheet0_2_Tickbox_No.setChecked(false);
                    CKSheet0_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatmentpressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_1_Tickbox_Yes.setChecked(false);
                    }
                } else {
                    FrameLayoutSheet0_2.setVisibility(LinearLayout.GONE);
                    CKSheet0_1_Tickbox_Yes.setChecked(false);
                    CKSheet0_2_Tickbox_No.setChecked(false);
                    CKSheet0_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// FrameLayoutSheet0_Road /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        CKSheet0_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatmentpressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_2_Tickbox_No.setChecked(false);


                    }
                } else {
                    FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                    CKSheet0_2_Tickbox_No.setChecked(false);
                    CKSheet0_2_1_Tickbox_No.setChecked(false);
                    CKSheet0_2_1_Tickbox_Yes.setChecked(false);

                }
            }


        });

        CKSheet0_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatmentpressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_2_Tickbox_Yes.setChecked(false);

                    }
                } else {
                    FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                    CKSheet0_2_Tickbox_Yes.setChecked(false);
                    CKSheet0_2_1_Tickbox_No.setChecked(false);
                    CKSheet0_2_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_2_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_1_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_minorpressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_2_1_Tickbox_No.setChecked(false);

                    }
                } else {
                    CKSheet0_2_1_Tickbox_No.setChecked(false);
                }
            }


        });

        CKSheet0_2_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_minorpressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_2_1_Tickbox_Yes.setChecked(false);

                    }
                } else {
                    FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                    CKSheet0_2_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_2_1_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_1_1_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetH.class));
                        CKSheet0_2_1_1_Tickbox_No.setChecked(false);

                    }
                } else {
                    CKSheet0_2_1_1_Tickbox_No.setChecked(false);
                }
            }


        });

        CKSheet0_2_1_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_1_1_Tickbox_No.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetJ.class));
                        CKSheet0_2_1_1_Tickbox_Yes.setChecked(false);
                    }
                } else {
                    FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                    CKSheet0_2_1_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_2_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_2_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetK.class));
                        CKSheet0_2_2_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_2_2_Tickbox_No.setChecked(false);
                }
            }


        });

        CKSheet0_2_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_2_2_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_2_2_Tickbox_Yes.setChecked(false);
                        CKSheet0_2_Tickbox_Yes.setChecked(false);
                        CKSheet0_2_Tickbox_No.setChecked(true);
                    }
                } else {
                    CKSheet0_2_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_3_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_3_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_3_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_3_Tickbox_Yes.setChecked(false);
                    }
                } else {
                    CKSheet0_3_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_3_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_1_Tickbox_Yes.isChecked()) {

                        startActivity(new Intent(TMPSelection_001.this, TMPSheetA.class));
                        CKSheet0_3_1_Tickbox_No.setChecked(false);

                } else {
                    CKSheet0_3_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_3_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_3_1_Tickbox_Yes.setChecked(false);
                    }
                } else {
                    CKSheet0_3_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_3_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_2_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_3_2_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_3_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_3_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_2_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_3_2_Tickbox_Yes.setChecked(false);
                        CKSheet0_3_Tickbox_Yes.setChecked(false);
                        CKSheet0_3_Tickbox_No.setChecked(true);

                    }
                } else {
                    CKSheet0_3_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_3_2_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_2_1_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetG.class));
                        CKSheet0_3_2_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_3_2_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_3_2_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_3_2_1_Tickbox_No.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetB.class));
                        CKSheet0_3_2_1_Tickbox_Yes.setChecked(false);
                    }
                } else {
                    CKSheet0_3_2_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_4_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_4_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_4_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_4_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_1_Tickbox_Yes.setChecked(false);
                        CKSheet0_4_Tickbox_Yes.setChecked(false);
                        CKSheet0_4_Tickbox_No.setChecked(true);


                    }
                } else {
                    CKSheet0_4_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_1_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetC.class));
                    }
                } else {
                    CKSheet0_4_1_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_1_1_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_4_1_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_2_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetD.class));
                    }
                } else {
                    CKSheet0_4_1_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_4_1_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_4_1_2_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_4_1_2_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_4_1_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_5_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_5_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_5_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_5_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_5_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_5_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_5_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_1_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_5_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_5_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_5_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_5_1_Tickbox_Yes.setChecked(false);
                        CKSheet0_5_Tickbox_Yes.setChecked(false);
                        CKSheet0_5_Tickbox_No.setChecked(true);


                    }
                } else {
                    CKSheet0_5_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_5_1_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_1_1_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetE.class));
                        CKSheet0_5_1_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_5_1_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_5_1_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_5_1_1_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_5_1_1_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_5_1_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_6_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_6_Tickbox_Yes.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.VISIBLE);
                        CKSheet0_6_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_6_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_6_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_6_Tickbox_No.isChecked()) {
                    {
                        if (FrameLayoutSheet0_Reinstatment_Allstoppressed == false) ;
                        FrameLayoutSheet0_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_ReferToInspector_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_2_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_3_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_3_2_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_4_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_4_1_2.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_5_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_5_1_1.setVisibility(LinearLayout.GONE);
                        FrameLayoutSheet0_6.setVisibility(LinearLayout.VISIBLE);
                        FrameLayoutSheet0_6_1.setVisibility(LinearLayout.GONE);
                        CKSheet0_6_Tickbox_Yes.setChecked(false);


                    }
                } else {
                    CKSheet0_6_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheet0_6_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_6_1_Tickbox_Yes.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetG.class));
                        CKSheet0_6_1_Tickbox_No.setChecked(false);
                    }
                } else {
                    CKSheet0_6_1_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheet0_6_1_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheet0_6_1_Tickbox_No.isChecked()) {
                    {
                        startActivity(new Intent(TMPSelection_001.this, TMPSheetF.class));
                        CKSheet0_6_1_Tickbox_Yes.setChecked(false);

                    }
                } else {
                    CKSheet0_6_1_Tickbox_Yes.setChecked(false);
                }
            }

        });

    }

}
