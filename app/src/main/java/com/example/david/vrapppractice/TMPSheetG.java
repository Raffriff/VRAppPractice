package com.example.david.vrapppractice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class TMPSheetG extends AppCompatActivity {


    ////////////////////////////////////////////Variables///////////////////////////////////////

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetG_1;
    FrameLayout FrameLayoutSheetG_2;
    FrameLayout FrameLayoutSheetG_3;
    FrameLayout FrameLayoutSheetG_4;
    FrameLayout FrameLayoutSheetG_5;
    FrameLayout FrameLayoutSheetG_6;
    FrameLayout FrameLayoutSheetG_7;
    FrameLayout FrameLayoutSheetG_8;
    FrameLayout FrameLayoutSheetG_9;
    FrameLayout FrameLayoutSheetG_10;
    FrameLayout FrameLayoutSheetG_11;

    FrameLayout FrameLayoutSheetG_UseSheet0;
    FrameLayout FrameLayoutSheetG_Passive;
    FrameLayout FrameLayoutSheetG_AdvanceWarning;

    CheckBox CKSheetG_2_Tickbox_No;
    CheckBox CKSheetG_2_Tickbox_Yes;

    CheckBox CKSheetG_3_Tickbox_No;
    CheckBox CKSheetG_3_Tickbox_Yes;

    CheckBox CKSheetG_4_Tickbox_No;
    CheckBox CKSheetG_4_Tickbox_Yes;

    CheckBox CKSheetG_5_Tickbox_No;
    CheckBox CKSheetG_5_Tickbox_Yes;

    CheckBox CKSheetG_6_Tickbox_No;
    CheckBox CKSheetG_6_Tickbox_Yes;

    CheckBox CKSheetG_7_Tickbox_No;
    CheckBox CKSheetG_7_Tickbox_Yes;

    CheckBox CKSheetG_8_Tickbox_No;
    CheckBox CKSheetG_8_Tickbox_Yes;

    CheckBox CKSheetG_9_Tickbox_No;
    CheckBox CKSheetG_9_Tickbox_Yes;

    CheckBox CKSheetG_10_Tickbox_No;
    CheckBox CKSheetG_10_Tickbox_Yes;

    Button BTSheetG_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_g);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's/////////////////////////////

        FrameLayoutSheetG_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_1);
        FrameLayoutSheetG_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_2);
        FrameLayoutSheetG_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_3);
        FrameLayoutSheetG_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_4);
        FrameLayoutSheetG_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_5);
        FrameLayoutSheetG_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_6);
        FrameLayoutSheetG_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_7);
        FrameLayoutSheetG_8 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_8);
        FrameLayoutSheetG_9 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_9);
        FrameLayoutSheetG_10 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_10);
        FrameLayoutSheetG_11 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_11);

        FrameLayoutSheetG_UseSheet0 = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_UseSheet0);
        FrameLayoutSheetG_Passive = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_Passive);
        FrameLayoutSheetG_AdvanceWarning = (FrameLayout) findViewById(R.id.FrameLayoutSheetG_AdvanceWarning);

        CKSheetG_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_2_Tickbox_No);
        CKSheetG_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_2_Tickbox_Yes);

        CKSheetG_3_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_3_Tickbox_No);
        CKSheetG_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_3_Tickbox_Yes);

        CKSheetG_4_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_4_Tickbox_No);
        CKSheetG_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_4_Tickbox_Yes);

        CKSheetG_5_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_5_Tickbox_No);
        CKSheetG_5_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_5_Tickbox_Yes);

        CKSheetG_6_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_6_Tickbox_No);
        CKSheetG_6_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_6_Tickbox_Yes);

        CKSheetG_7_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_7_Tickbox_No);
        CKSheetG_7_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_7_Tickbox_Yes);

        CKSheetG_8_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_8_Tickbox_No);
        CKSheetG_8_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_8_Tickbox_Yes);

        CKSheetG_9_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_9_Tickbox_No);
        CKSheetG_9_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_9_Tickbox_Yes);

        CKSheetG_10_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetG_10_Tickbox_No);
        CKSheetG_10_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetG_10_Tickbox_Yes);

        BTSheetG_Start = (Button) findViewById(R.id.BTSheetG_Start);


        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetG_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);


        /////////////////////////////////Methods/////////////////////////////////////

        BTSheetG_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetG_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetG_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_2_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_2_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_2_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_3_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_3_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_3_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_3_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_3_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_3_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_3_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_4_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_4_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_4_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_4_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_4_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_4_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_4_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_5_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_5_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_5_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_5_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_5_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_5_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_5_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_5_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_6_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_6_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_6_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_6_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_6_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_6_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_6_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_6_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_7_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_7_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_7_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_7_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_7_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_7_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_7_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_7_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_8_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_8_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_8_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_8_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_8_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_8_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_8_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_8_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_9_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_9_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_9_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_9_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_9_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_9_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_9_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_9_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetG_10_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_10_Tickbox_No.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.GONE);
                    CKSheetG_10_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetG_10_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetG_10_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetG_10_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetG_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_10.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_11.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetG_UseSheet0.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_Passive.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetG_AdvanceWarning.setVisibility(LinearLayout.VISIBLE);
                    CKSheetG_10_Tickbox_No.setChecked(false);

                } else {
                    CKSheetG_10_Tickbox_No.setChecked(false);
                }
            }

        });

    }

}
