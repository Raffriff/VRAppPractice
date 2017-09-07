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

public class TMPSheetH extends AppCompatActivity {

    ////////////////////////////////////////////Variables///////////////////////////////////////

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetH_1;
    FrameLayout FrameLayoutSheetH_2;
    FrameLayout FrameLayoutSheetH_3;
    FrameLayout FrameLayoutSheetH_4;
    FrameLayout FrameLayoutSheetH_5;
    FrameLayout FrameLayoutSheetH_6;
    FrameLayout FrameLayoutSheetH_7;
    FrameLayout FrameLayoutSheetH_8;
    FrameLayout FrameLayoutSheetH_9;
    FrameLayout FrameLayoutSheetH_10;

    FrameLayout FrameLayoutSheetH_UseSheet0;

    CheckBox CKSheetH_2_Tickbox_No;
    CheckBox CKSheetH_2_Tickbox_Yes;

    CheckBox CKSheetH_3_Tickbox_No;
    CheckBox CKSheetH_3_Tickbox_Yes;

    CheckBox CKSheetH_4_Tickbox_No;
    CheckBox CKSheetH_4_Tickbox_Yes;

    CheckBox CKSheetH_5_Tickbox_No;
    CheckBox CKSheetH_5_Tickbox_Yes;

    CheckBox CKSheetH_6_Tickbox_No;
    CheckBox CKSheetH_6_Tickbox_Yes;

    CheckBox CKSheetH_7_Tickbox_No;
    CheckBox CKSheetH_7_Tickbox_Yes;

    CheckBox CKSheetH_8_Tickbox_No;
    CheckBox CKSheetH_8_Tickbox_Yes;

    CheckBox CKSheetH_9_Tickbox_No;
    CheckBox CKSheetH_9_Tickbox_Yes;

    Button BTSheetH_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_h);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's/////////////////////////////

        FrameLayoutSheetH_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_1);
        FrameLayoutSheetH_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_2);
        FrameLayoutSheetH_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_3);
        FrameLayoutSheetH_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_4);
        FrameLayoutSheetH_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_5);
        FrameLayoutSheetH_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_6);
        FrameLayoutSheetH_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_7);
        FrameLayoutSheetH_8 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_8);
        FrameLayoutSheetH_9 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_9);
        FrameLayoutSheetH_10 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_10);


        FrameLayoutSheetH_UseSheet0 = (FrameLayout) findViewById(R.id.FrameLayoutSheetH_UseSheet0);

        CKSheetH_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_2_Tickbox_No);
        CKSheetH_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_2_Tickbox_Yes);

        CKSheetH_3_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_3_Tickbox_No);
        CKSheetH_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_3_Tickbox_Yes);

        CKSheetH_4_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_4_Tickbox_No);
        CKSheetH_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_4_Tickbox_Yes);

        CKSheetH_5_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_5_Tickbox_No);
        CKSheetH_5_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_5_Tickbox_Yes);

        CKSheetH_6_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_6_Tickbox_No);
        CKSheetH_6_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_6_Tickbox_Yes);

        CKSheetH_7_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_7_Tickbox_No);
        CKSheetH_7_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_7_Tickbox_Yes);

        CKSheetH_8_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_8_Tickbox_No);
        CKSheetH_8_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_8_Tickbox_Yes);

        CKSheetH_9_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetH_9_Tickbox_No);
        CKSheetH_9_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetH_9_Tickbox_Yes);

        BTSheetH_Start = (Button) findViewById(R.id.BTSheetH_Start);


        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetH_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);


        /////////////////////////////////Methods/////////////////////////////////////

        BTSheetH_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetH_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetH_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_2_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_2_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_2_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_3_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_3_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_3_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_3_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_3_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_3_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_3_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_4_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_4_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_4_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_4_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_4_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_4_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_4_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_5_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_5_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_5_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_5_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_5_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_5_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_5_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_5_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_6_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_6_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_6_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_6_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_6_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_6_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_6_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_6_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_7_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_7_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_7_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_7_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_7_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_7_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_7_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_7_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_8_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_8_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetH_8_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetH_8_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_8_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_8_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_8_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_8_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetH_9_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_9_Tickbox_No.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.VISIBLE);

                } else {
                    CKSheetH_9_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetH_9_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetH_9_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetH_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_9.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_10.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetH_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetH_9_Tickbox_No.setChecked(false);

                } else {
                    CKSheetH_9_Tickbox_No.setChecked(false);
                }
            }

        });

    }

}
