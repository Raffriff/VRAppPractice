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

public class TMPSheetE extends AppCompatActivity {

    /////////////////////////////Variables///////////////////////////////////////////

    FrameLayout FrameLayoutSheetE_1;
    FrameLayout FrameLayoutSheetE_2;
    FrameLayout FrameLayoutSheetE_3;
    FrameLayout FrameLayoutSheetE_4;
    FrameLayout FrameLayoutSheetE_4_1;
    FrameLayout FrameLayoutSheetE_4_2;
    FrameLayout FrameLayoutSheetE_4_3;
    FrameLayout FrameLayoutSheetE_5;
    FrameLayout FrameLayoutSheetE_5_1;
    FrameLayout FrameLayoutSheetE_5_2;
    FrameLayout FrameLayoutSheetE_5_3;
    FrameLayout FrameLayoutSheetE_5_4;
    FrameLayout FrameLayoutSheetE_5_5;
    FrameLayout FrameLayoutSheetE_5_6;
    FrameLayout FrameLayoutSheetE_5_7;

    CheckBox CKSheetE_2_Tickbox_Yes;

    CheckBox CKSheetE_3_Tickbox_Red;
    CheckBox CKSheetE_3_Tickbox_Orange;
    CheckBox CKSheetE_3_Tickbox_Green;
    CheckBox CKSheetE_3_Tickbox_Blue;

    CheckBox CKSheetE_4_Tickbox_Less;
    CheckBox CKSheetE_4_Tickbox_More;

    CheckBox CKSheetE_4_1_Tickbox_Less;
    CheckBox CKSheetE_4_1_Tickbox_More;

    CheckBox CKSheetE_4_2_Tickbox_Less;
    CheckBox CKSheetE_4_2_Tickbox_More;

    CheckBox CKSheetE_4_3_Tickbox_Less;
    CheckBox CKSheetE_4_3_Tickbox_More;

    Button BTSheetE_Start;
    Button BTSheetE_Plan40;
    Button BTSheetE_Plan41;
    Button BTSheetE_Plan42;
    Button BTSheetE_Plan43;
    Button BTSheetE_Plan46;
    Button BTSheetE_Plan47;
    Button BTSheetE_Plan48;
    Button BTSheetE_Plan49;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_e);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's//////////////////////////////////

        FrameLayoutSheetE_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_1);
        FrameLayoutSheetE_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_2);
        FrameLayoutSheetE_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_3);
        FrameLayoutSheetE_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_4);
        FrameLayoutSheetE_4_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_4_1);
        FrameLayoutSheetE_4_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_4_2);
        FrameLayoutSheetE_4_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_4_3);
        FrameLayoutSheetE_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5);
        FrameLayoutSheetE_5_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_1);
        FrameLayoutSheetE_5_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_2);
        FrameLayoutSheetE_5_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_3);
        FrameLayoutSheetE_5_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_4);
        FrameLayoutSheetE_5_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_5);
        FrameLayoutSheetE_5_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_6);
        FrameLayoutSheetE_5_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetE_5_7);

        CKSheetE_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetE_2_Tickbox_Yes);

        CKSheetE_3_Tickbox_Red = (CheckBox) findViewById(R.id.CKSheetE_3_Tickbox_Red);
        CKSheetE_3_Tickbox_Orange = (CheckBox) findViewById(R.id.CKSheetE_3_Tickbox_Orange);
        CKSheetE_3_Tickbox_Green = (CheckBox) findViewById(R.id.CKSheetE_3_Tickbox_Green);
        CKSheetE_3_Tickbox_Blue = (CheckBox) findViewById(R.id.CKSheetE_3_Tickbox_Blue);

        CKSheetE_4_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetE_4_Tickbox_Less);
        CKSheetE_4_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetE_4_Tickbox_More);

        CKSheetE_4_1_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetE_4_1_Tickbox_Less);
        CKSheetE_4_1_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetE_4_1_Tickbox_More);

        CKSheetE_4_2_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetE_4_2_Tickbox_Less);
        CKSheetE_4_2_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetE_4_2_Tickbox_More);

        CKSheetE_4_3_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetE_4_3_Tickbox_Less);
        CKSheetE_4_3_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetE_4_3_Tickbox_More);


        BTSheetE_Start = (Button) findViewById(R.id.BTSheetE_Start);
        BTSheetE_Plan40 = (Button) findViewById(R.id.BTSheetE_Plan40);
        BTSheetE_Plan41 = (Button) findViewById(R.id.BTSheetE_Plan41);
        BTSheetE_Plan42 = (Button) findViewById(R.id.BTSheetE_Plan42);
        BTSheetE_Plan43 = (Button) findViewById(R.id.BTSheetE_Plan43);
        BTSheetE_Plan46 = (Button) findViewById(R.id.BTSheetE_Plan46);
        BTSheetE_Plan47 = (Button) findViewById(R.id.BTSheetE_Plan47);
        BTSheetE_Plan48 = (Button) findViewById(R.id.BTSheetE_Plan48);
        BTSheetE_Plan49 = (Button) findViewById(R.id.BTSheetE_Plan49);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetE_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);

        ///////////////////////////////Methods////////////////////////////////////////
        BTSheetE_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetE_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetE_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetE_3_Tickbox_Red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_3_Tickbox_Red.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetE_3_Tickbox_Orange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_3_Tickbox_Orange.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetE_3_Tickbox_Green.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_3_Tickbox_Green.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetE_3_Tickbox_Blue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_3_Tickbox_Blue.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                } else {
                    CKSheetE_3_Tickbox_Red.setChecked(false);
                    CKSheetE_3_Tickbox_Orange.setChecked(false);
                    CKSheetE_3_Tickbox_Green.setChecked(false);
                }
            }

        });

        CKSheetE_4_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_Tickbox_More.setChecked(false);

                } else {
                    CKSheetE_4_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetE_4_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_Tickbox_More.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetE_4_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetE_4_1_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_1_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_1_Tickbox_More.setChecked(false);

                } else {
                    CKSheetE_4_1_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetE_4_1_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_1_Tickbox_More.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_1_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetE_4_1_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetE_4_2_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_2_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_2_Tickbox_More.setChecked(false);

                } else {
                    CKSheetE_4_2_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetE_4_2_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_2_Tickbox_More.isChecked()) {
                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_2_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetE_4_2_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetE_4_3_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_3_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.VISIBLE);
                    CKSheetE_4_3_Tickbox_More.setChecked(false);

                } else {
                    CKSheetE_4_3_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetE_4_3_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetE_4_3_Tickbox_More.isChecked()) {

                    FrameLayoutSheetE_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetE_5_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetE_5_7.setVisibility(LinearLayout.GONE);
                    CKSheetE_4_3_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetE_4_3_Tickbox_Less.setChecked(false);
                }
            }

        });

        BTSheetE_Plan40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan40.class));

            }

        });

        BTSheetE_Plan41.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan41.class));

            }

        });

        BTSheetE_Plan42.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan42.class));

            }

        });

        BTSheetE_Plan43.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan43.class));

            }

        });

        BTSheetE_Plan46.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan46.class));

            }

        });

        BTSheetE_Plan47.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan47.class));

            }

        });

        BTSheetE_Plan48.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan48.class));

            }

        });

        BTSheetE_Plan49.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheete.this, TMPPlan49.class));

            }

        });

    }

}
