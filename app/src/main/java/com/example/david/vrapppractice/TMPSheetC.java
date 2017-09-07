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

public class TMPSheetC extends AppCompatActivity {

    /////////////////////////////Variables///////////////////////////////////////////

    FrameLayout FrameLayoutSheetC_1;
    FrameLayout FrameLayoutSheetC_2;
    FrameLayout FrameLayoutSheetC_3;
    FrameLayout FrameLayoutSheetC_4;
    FrameLayout FrameLayoutSheetC_4_1;
    FrameLayout FrameLayoutSheetC_4_2;
    FrameLayout FrameLayoutSheetC_4_3;
    FrameLayout FrameLayoutSheetC_4_4;
    FrameLayout FrameLayoutSheetC_5;
    FrameLayout FrameLayoutSheetC_5_1;
    FrameLayout FrameLayoutSheetC_5_2;
    FrameLayout FrameLayoutSheetC_5_3;
    FrameLayout FrameLayoutSheetC_5_4;
    FrameLayout FrameLayoutSheetC_5_5;
    FrameLayout FrameLayoutSheetC_5_6;
    FrameLayout FrameLayoutSheetC_5_7;
    FrameLayout FrameLayoutSheetC_5_8;
    FrameLayout FrameLayoutSheetC_5_9;

    CheckBox CKSheetC_2_Tickbox_Yes;

    CheckBox CKSheetC_3_Tickbox_Red;
    CheckBox CKSheetC_3_Tickbox_Orange;
    CheckBox CKSheetC_3_Tickbox_Yellow;
    CheckBox CKSheetC_3_Tickbox_Green;
    CheckBox CKSheetC_3_Tickbox_Blue;

    CheckBox CKSheetC_4_Tickbox_Less;
    CheckBox CKSheetC_4_Tickbox_More;

    CheckBox CKSheetC_4_1_Tickbox_Less;
    CheckBox CKSheetC_4_1_Tickbox_More;

    CheckBox CKSheetC_4_2_Tickbox_Less;
    CheckBox CKSheetC_4_2_Tickbox_More;

    CheckBox CKSheetC_4_3_Tickbox_Less;
    CheckBox CKSheetC_4_3_Tickbox_More;

    CheckBox CKSheetC_4_4_Tickbox_Less;
    CheckBox CKSheetC_4_4_Tickbox_More;

    Button BTSheetC_Start;
    Button BTSheetC_Plan10;
    Button BTSheetC_Plan11;
    Button BTSheetC_Plan12;
    Button BTSheetC_Plan13;
    Button BTSheetC_Plan14;
    Button BTSheetC_Plan15;
    Button BTSheetC_Plan16;
    Button BTSheetC_Plan17;
    Button BTSheetC_Plan18;
    Button BTSheetC_Plan19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's//////////////////////////////////

        FrameLayoutSheetC_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_1);
        FrameLayoutSheetC_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_2);
        FrameLayoutSheetC_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_3);
        FrameLayoutSheetC_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_4);
        FrameLayoutSheetC_4_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_4_1);
        FrameLayoutSheetC_4_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_4_2);
        FrameLayoutSheetC_4_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_4_3);
        FrameLayoutSheetC_4_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_4_4);
        FrameLayoutSheetC_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5);
        FrameLayoutSheetC_5_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_1);
        FrameLayoutSheetC_5_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_2);
        FrameLayoutSheetC_5_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_3);
        FrameLayoutSheetC_5_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_4);
        FrameLayoutSheetC_5_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_5);
        FrameLayoutSheetC_5_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_6);
        FrameLayoutSheetC_5_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_7);
        FrameLayoutSheetC_5_8 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_8);
        FrameLayoutSheetC_5_9 = (FrameLayout) findViewById(R.id.FrameLayoutSheetC_5_9);

        CKSheetC_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetC_2_Tickbox_Yes);

        CKSheetC_3_Tickbox_Red = (CheckBox) findViewById(R.id.CKSheetC_3_Tickbox_Red);
        CKSheetC_3_Tickbox_Orange = (CheckBox) findViewById(R.id.CKSheetC_3_Tickbox_Orange);
        CKSheetC_3_Tickbox_Yellow = (CheckBox) findViewById(R.id.CKSheetC_3_Tickbox_Yellow);
        CKSheetC_3_Tickbox_Green = (CheckBox) findViewById(R.id.CKSheetC_3_Tickbox_Green);
        CKSheetC_3_Tickbox_Blue = (CheckBox) findViewById(R.id.CKSheetC_3_Tickbox_Blue);

        CKSheetC_4_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetC_4_Tickbox_Less);
        CKSheetC_4_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetC_4_Tickbox_More);

        CKSheetC_4_1_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetC_4_1_Tickbox_Less);
        CKSheetC_4_1_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetC_4_1_Tickbox_More);

        CKSheetC_4_2_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetC_4_2_Tickbox_Less);
        CKSheetC_4_2_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetC_4_2_Tickbox_More);

        CKSheetC_4_3_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetC_4_3_Tickbox_Less);
        CKSheetC_4_3_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetC_4_3_Tickbox_More);

        CKSheetC_4_4_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetC_4_4_Tickbox_Less);
        CKSheetC_4_4_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetC_4_4_Tickbox_More);

        BTSheetC_Start = (Button) findViewById(R.id.BTSheetC_Start);
        BTSheetC_Plan10 = (Button) findViewById(R.id.BTSheetC_Plan10);
        BTSheetC_Plan11 = (Button) findViewById(R.id.BTSheetC_Plan11);
        BTSheetC_Plan12 = (Button) findViewById(R.id.BTSheetC_Plan12);
        BTSheetC_Plan13 = (Button) findViewById(R.id.BTSheetC_Plan13);
        BTSheetC_Plan14 = (Button) findViewById(R.id.BTSheetC_Plan14);
        BTSheetC_Plan15 = (Button) findViewById(R.id.BTSheetC_Plan15);
        BTSheetC_Plan16 = (Button) findViewById(R.id.BTSheetC_Plan16);
        BTSheetC_Plan17 = (Button) findViewById(R.id.BTSheetC_Plan17);
        BTSheetC_Plan18 = (Button) findViewById(R.id.BTSheetC_Plan18);
        BTSheetC_Plan19 = (Button) findViewById(R.id.BTSheetC_Plan19);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetC_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);

        ///////////////////////////////Methods////////////////////////////////////////
        BTSheetC_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetC_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetC_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetC_3_Tickbox_Red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_3_Tickbox_Red.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetC_3_Tickbox_Orange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_3_Tickbox_Orange.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetC_3_Tickbox_Yellow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_3_Tickbox_Yellow.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetC_3_Tickbox_Green.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_3_Tickbox_Green.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetC_3_Tickbox_Blue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_3_Tickbox_Blue.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                } else {
                    CKSheetC_3_Tickbox_Red.setChecked(false);
                    CKSheetC_3_Tickbox_Orange.setChecked(false);
                    CKSheetC_3_Tickbox_Yellow.setChecked(false);
                    CKSheetC_3_Tickbox_Green.setChecked(false);
                }
            }

        });

        CKSheetC_4_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_Tickbox_More.setChecked(false);

                } else {
                    CKSheetC_4_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetC_4_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_Tickbox_More.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetC_4_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetC_4_1_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_1_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_1_Tickbox_More.setChecked(false);

                } else {
                    CKSheetC_4_1_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetC_4_1_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_1_Tickbox_More.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_1_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetC_4_1_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetC_4_2_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_2_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_2_Tickbox_More.setChecked(false);

                } else {
                    CKSheetC_4_2_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetC_4_2_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_2_Tickbox_More.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_2_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetC_4_2_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetC_4_3_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_3_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_3_Tickbox_More.setChecked(false);

                } else {
                    CKSheetC_4_3_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetC_4_3_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_3_Tickbox_More.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_3_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetC_4_3_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetC_4_4_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_4_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.VISIBLE);
                    CKSheetC_4_4_Tickbox_More.setChecked(false);

                } else {
                    CKSheetC_4_4_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetC_4_4_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetC_4_4_Tickbox_More.isChecked()) {

                    FrameLayoutSheetC_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetC_5_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetC_5_9.setVisibility(LinearLayout.GONE);
                    CKSheetC_4_4_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetC_4_4_Tickbox_Less.setChecked(false);
                }
            }

        });

        BTSheetC_Plan10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    //startActivity(new Intent(TMPSheetC.this, TMPPlan10.class));

            }

        });

        BTSheetC_Plan11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan11.class));

            }

        });

        BTSheetC_Plan12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan12.class));

            }

        });

        BTSheetC_Plan13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan13.class));

            }

        });

        BTSheetC_Plan14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan14.class));

            }

        });

        BTSheetC_Plan15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan15.class));

            }

        });

        BTSheetC_Plan16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan16.class));

            }

        });

        BTSheetC_Plan17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan17.class));

            }

        });

        BTSheetC_Plan18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan18.class));

            }

        });

        BTSheetC_Plan19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetC.this, TMPPlan19.class));

            }

        });

    }

}
