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

public class TMPSheetK extends AppCompatActivity {

    ////////////////////////////////////////////Variables///////////////////////////////////////

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetK_1;
    FrameLayout FrameLayoutSheetK_2;
    FrameLayout FrameLayoutSheetK_3;
    FrameLayout FrameLayoutSheetK_4;
    FrameLayout FrameLayoutSheetK_5;
    FrameLayout FrameLayoutSheetK_6;
    FrameLayout FrameLayoutSheetK_7;

    FrameLayout FrameLayoutSheetK_UseSheet0;

    CheckBox CKSheetK_2_Tickbox_No;
    CheckBox CKSheetK_2_Tickbox_Yes;

    CheckBox CKSheetK_3_Tickbox_No;
    CheckBox CKSheetK_3_Tickbox_Yes;

    CheckBox CKSheetK_4_Tickbox_No;
    CheckBox CKSheetK_4_Tickbox_Yes;

    CheckBox CKSheetK_5_Tickbox_No;
    CheckBox CKSheetK_5_Tickbox_Yes;

    CheckBox CKSheetK_6_Tickbox_No;
    CheckBox CKSheetK_6_Tickbox_Yes;

    Button BTSheetK_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_k);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's/////////////////////////////

        FrameLayoutSheetK_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_1);
        FrameLayoutSheetK_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_2);
        FrameLayoutSheetK_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_3);
        FrameLayoutSheetK_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_4);
        FrameLayoutSheetK_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_5);
        FrameLayoutSheetK_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_6);
        FrameLayoutSheetK_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_7);

        FrameLayoutSheetK_UseSheet0 = (FrameLayout) findViewById(R.id.FrameLayoutSheetK_UseSheet0);

        CKSheetK_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetK_2_Tickbox_No);
        CKSheetK_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetK_2_Tickbox_Yes);

        CKSheetK_3_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetK_3_Tickbox_No);
        CKSheetK_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetK_3_Tickbox_Yes);

        CKSheetK_4_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetK_4_Tickbox_No);
        CKSheetK_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetK_4_Tickbox_Yes);

        CKSheetK_5_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetK_5_Tickbox_No);
        CKSheetK_5_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetK_5_Tickbox_Yes);

        CKSheetK_6_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetK_6_Tickbox_No);
        CKSheetK_6_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetK_6_Tickbox_Yes);

        BTSheetK_Start = (Button) findViewById(R.id.BTSheetK_Start);


        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetK_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);


        /////////////////////////////////Methods/////////////////////////////////////

        BTSheetK_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetK_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetK_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetK_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_2_Tickbox_No.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetK_2_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetK_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetK_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_2_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetK_2_Tickbox_No.setChecked(false);

                } else {
                    CKSheetK_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetK_3_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_3_Tickbox_No.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetK_3_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetK_3_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetK_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_3_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetK_3_Tickbox_No.setChecked(false);

                } else {
                    CKSheetK_3_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetK_4_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_4_Tickbox_No.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetK_4_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetK_4_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetK_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_4_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetK_4_Tickbox_No.setChecked(false);

                } else {
                    CKSheetK_4_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetK_5_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_5_Tickbox_No.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetK_5_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetK_5_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetK_5_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_5_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetK_5_Tickbox_No.setChecked(false);

                } else {
                    CKSheetK_5_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetK_6_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_6_Tickbox_No.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.VISIBLE);
                    CKSheetK_6_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetK_6_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetK_6_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetK_6_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetK_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetK_UseSheet0.setVisibility(LinearLayout.GONE);
                    CKSheetK_6_Tickbox_No.setChecked(false);

                } else {
                    CKSheetK_6_Tickbox_No.setChecked(false);
                }
            }

        });

    }

}
