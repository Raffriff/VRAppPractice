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

public class TMPSheetJ extends AppCompatActivity {

    ////////////////////////////////////////////Variables///////////////////////////////////////

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetJ_1;
    FrameLayout FrameLayoutSheetJ_2;
    FrameLayout FrameLayoutSheetJ_3;
    FrameLayout FrameLayoutSheetJ_4;
    FrameLayout FrameLayoutSheetJ_5;
    FrameLayout FrameLayoutSheetJ_6;
    FrameLayout FrameLayoutSheetJ_7;
    FrameLayout FrameLayoutSheetJ_8;

    FrameLayout FrameLayoutSheetJ_UseSheet0;

    CheckBox CKSheetJ_2_Tickbox_No;
    CheckBox CKSheetJ_2_Tickbox_Yes;

    CheckBox CKSheetJ_3_Tickbox_No;
    CheckBox CKSheetJ_3_Tickbox_Yes;

    CheckBox CKSheetJ_4_Tickbox_No;
    CheckBox CKSheetJ_4_Tickbox_Yes;

    CheckBox CKSheetJ_5_Tickbox_No;
    CheckBox CKSheetJ_5_Tickbox_Yes;

    CheckBox CKSheetJ_6_Tickbox_No;
    CheckBox CKSheetJ_6_Tickbox_Yes;

    CheckBox CKSheetJ_7_Tickbox_No;
    CheckBox CKSheetJ_7_Tickbox_Yes;

    Button BTSheetJ_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_j);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's/////////////////////////////

        FrameLayoutSheetJ_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_1);
        FrameLayoutSheetJ_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_2);
        FrameLayoutSheetJ_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_3);
        FrameLayoutSheetJ_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_4);
        FrameLayoutSheetJ_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_5);
        FrameLayoutSheetJ_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_6);
        FrameLayoutSheetJ_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_7);
        FrameLayoutSheetJ_8 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_8);

        FrameLayoutSheetJ_UseSheet0 = (FrameLayout) findViewById(R.id.FrameLayoutSheetJ_UseSheet0);

        CKSheetJ_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_2_Tickbox_No);
        CKSheetJ_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_2_Tickbox_Yes);

        CKSheetJ_3_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_3_Tickbox_No);
        CKSheetJ_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_3_Tickbox_Yes);

        CKSheetJ_4_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_4_Tickbox_No);
        CKSheetJ_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_4_Tickbox_Yes);

        CKSheetJ_5_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_5_Tickbox_No);
        CKSheetJ_5_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_5_Tickbox_Yes);

        CKSheetJ_6_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_6_Tickbox_No);
        CKSheetJ_6_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_6_Tickbox_Yes);

        CKSheetJ_7_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetJ_7_Tickbox_No);
        CKSheetJ_7_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetJ_7_Tickbox_Yes);

        BTSheetJ_Start = (Button) findViewById(R.id.BTSheetJ_Start);


        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetJ_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);


        /////////////////////////////////Methods/////////////////////////////////////

        BTSheetJ_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetJ_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetJ_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_2_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_2_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_2_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetJ_3_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_3_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_3_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_3_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_3_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_3_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_3_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetJ_4_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_4_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_4_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_4_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_4_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_4_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_4_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetJ_5_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_5_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_5_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_5_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_5_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_5_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_5_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_5_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetJ_6_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_6_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_6_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_6_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_6_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_6_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_6_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_6_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetJ_7_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_7_Tickbox_No.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetJ_7_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetJ_7_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetJ_7_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetJ_7_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetJ_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetJ_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetJ_7_Tickbox_No.setChecked(false);

                } else {
                    CKSheetJ_7_Tickbox_No.setChecked(false);
                }
            }

        });

    }

}
