package com.example.david.vrapppractice;

import android.content.Intent;
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

public class TMPSheetD extends AppCompatActivity {

    /////////////////////////////Variables///////////////////////////////////////////

    FrameLayout FrameLayoutSheetD_1;
    FrameLayout FrameLayoutSheetD_2;
    FrameLayout FrameLayoutSheetD_3;
    FrameLayout FrameLayoutSheetD_4;
    FrameLayout FrameLayoutSheetD_4_1;
    FrameLayout FrameLayoutSheetD_4_2;
    FrameLayout FrameLayoutSheetD_4_3;
    FrameLayout FrameLayoutSheetD_4_4;
    FrameLayout FrameLayoutSheetD_5;
    FrameLayout FrameLayoutSheetD_5_1;
    FrameLayout FrameLayoutSheetD_5_2;
    FrameLayout FrameLayoutSheetD_5_3;
    FrameLayout FrameLayoutSheetD_5_4;

    FrameLayout FrameLayoutSheetD_ReferToInspector_1;

    CheckBox CKSheetD_2_Tickbox_Yes;

    CheckBox CKSheetD_3_Tickbox_Red;
    CheckBox CKSheetD_3_Tickbox_Orange;
    CheckBox CKSheetD_3_Tickbox_Yellow;
    CheckBox CKSheetD_3_Tickbox_Green;
    CheckBox CKSheetD_3_Tickbox_Blue;

    CheckBox CKSheetD_4_Tickbox_Less;
    CheckBox CKSheetD_4_Tickbox_More;

    CheckBox CKSheetD_4_1_Tickbox_Less;
    CheckBox CKSheetD_4_1_Tickbox_More;

    CheckBox CKSheetD_4_2_Tickbox_Less;
    CheckBox CKSheetD_4_2_Tickbox_More;

    CheckBox CKSheetD_4_3_Tickbox_Less;
    CheckBox CKSheetD_4_3_Tickbox_More;

    CheckBox CKSheetD_4_4_Tickbox_Less;
    CheckBox CKSheetD_4_4_Tickbox_More;

    Button BTSheetD_Start;
    Button BTSheetD_Plan20;
    Button BTSheetD_Plan21;
    Button BTSheetD_Plan22;
    Button BTSheetD_Plan23;
    Button BTSheetD_Plan24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_d);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's//////////////////////////////////

        FrameLayoutSheetD_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_1);
        FrameLayoutSheetD_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_2);
        FrameLayoutSheetD_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_3);
        FrameLayoutSheetD_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_4);
        FrameLayoutSheetD_4_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_4_1);
        FrameLayoutSheetD_4_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_4_2);
        FrameLayoutSheetD_4_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_4_3);
        FrameLayoutSheetD_4_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_4_4);
        FrameLayoutSheetD_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_5);
        FrameLayoutSheetD_5_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_5_1);
        FrameLayoutSheetD_5_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_5_2);
        FrameLayoutSheetD_5_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_5_3);
        FrameLayoutSheetD_5_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_5_4);

        FrameLayoutSheetD_ReferToInspector_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetD_ReferToInspector_1);

        CKSheetD_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetD_2_Tickbox_Yes);

        CKSheetD_3_Tickbox_Red = (CheckBox) findViewById(R.id.CKSheetD_3_Tickbox_Red);
        CKSheetD_3_Tickbox_Orange = (CheckBox) findViewById(R.id.CKSheetD_3_Tickbox_Orange);
        CKSheetD_3_Tickbox_Yellow = (CheckBox) findViewById(R.id.CKSheetD_3_Tickbox_Yellow);
        CKSheetD_3_Tickbox_Green = (CheckBox) findViewById(R.id.CKSheetD_3_Tickbox_Green);
        CKSheetD_3_Tickbox_Blue = (CheckBox) findViewById(R.id.CKSheetD_3_Tickbox_Blue);

        CKSheetD_4_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetD_4_Tickbox_Less);
        CKSheetD_4_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetD_4_Tickbox_More);

        CKSheetD_4_1_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetD_4_1_Tickbox_Less);
        CKSheetD_4_1_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetD_4_1_Tickbox_More);

        CKSheetD_4_2_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetD_4_2_Tickbox_Less);
        CKSheetD_4_2_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetD_4_2_Tickbox_More);

        CKSheetD_4_3_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetD_4_3_Tickbox_Less);
        CKSheetD_4_3_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetD_4_3_Tickbox_More);

        CKSheetD_4_4_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetD_4_4_Tickbox_Less);
        CKSheetD_4_4_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetD_4_4_Tickbox_More);

        BTSheetD_Start = (Button) findViewById(R.id.BTSheetD_Start);
        BTSheetD_Plan20 = (Button) findViewById(R.id.BTSheetD_Plan20);
        BTSheetD_Plan21 = (Button) findViewById(R.id.BTSheetD_Plan21);
        BTSheetD_Plan22 = (Button) findViewById(R.id.BTSheetD_Plan22);
        BTSheetD_Plan23 = (Button) findViewById(R.id.BTSheetD_Plan23);
        BTSheetD_Plan24 = (Button) findViewById(R.id.BTSheetD_Plan24);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetD_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);

        ///////////////////////////////Methods////////////////////////////////////////
        BTSheetD_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetD_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetD_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_2_Tickbox_Yes.isChecked()) {



                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetD_3_Tickbox_Red.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_3_Tickbox_Red.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetD_3_Tickbox_Orange.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_3_Tickbox_Orange.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetD_3_Tickbox_Yellow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_3_Tickbox_Yellow.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetD_3_Tickbox_Green.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_3_Tickbox_Green.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                } else {
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Blue.setChecked(false);
                }
            }

        });

        CKSheetD_3_Tickbox_Blue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_3_Tickbox_Blue.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                } else {
                    CKSheetD_3_Tickbox_Red.setChecked(false);
                    CKSheetD_3_Tickbox_Orange.setChecked(false);
                    CKSheetD_3_Tickbox_Yellow.setChecked(false);
                    CKSheetD_3_Tickbox_Green.setChecked(false);
                }
            }

        });

        CKSheetD_4_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_Tickbox_More.setChecked(false);

                } else {
                    CKSheetD_4_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetD_4_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_Tickbox_More.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetD_4_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetD_4_1_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_1_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_1_Tickbox_More.setChecked(false);

                } else {
                    CKSheetD_4_1_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetD_4_1_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_1_Tickbox_More.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_1_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetD_4_1_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetD_4_2_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_2_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_2_Tickbox_More.setChecked(false);

                } else {
                    CKSheetD_4_2_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetD_4_2_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_2_Tickbox_More.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_2_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetD_4_2_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetD_4_3_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_3_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_3_Tickbox_More.setChecked(false);

                } else {
                    CKSheetD_4_3_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetD_4_3_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_3_Tickbox_More.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_3_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetD_4_3_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetD_4_4_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_4_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.GONE);
                    CKSheetD_4_4_Tickbox_More.setChecked(false);

                } else {
                    CKSheetD_4_4_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetD_4_4_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetD_4_4_Tickbox_More.isChecked()) {
                    FrameLayoutSheetD_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_4_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetD_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetD_5_4.setVisibility(LinearLayout.VISIBLE);
                    CKSheetD_4_4_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetD_4_4_Tickbox_Less.setChecked(false);
                }
            }

        });

        BTSheetD_Plan20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(TMPSheetD.this, TMPPlans_1.class);
                i.putExtra("plan","20");
                startActivity(i);

            }

        });

        BTSheetD_Plan21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(TMPSheetD.this, TMPPlans_1.class);
                i.putExtra("plan","21");
                startActivity(i);

            }

        });

        BTSheetD_Plan22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(TMPSheetD.this, TMPPlans_1.class);
                i.putExtra("plan","22");
                startActivity(i);

            }

        });

        BTSheetD_Plan23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(TMPSheetD.this, TMPPlans_1.class);
                i.putExtra("plan","23");
                startActivity(i);

            }

        });

        BTSheetD_Plan24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(TMPSheetD.this, TMPPlans_1.class);
                i.putExtra("plan","24");
                startActivity(i);

            }

        });
    }

}
