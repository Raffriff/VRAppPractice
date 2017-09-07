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

public class TMPSheetF extends AppCompatActivity {

    /////////////////////////////Variables///////////////////////////////////////////

    FrameLayout FrameLayoutSheetF_1;
    FrameLayout FrameLayoutSheetF_2;
    FrameLayout FrameLayoutSheetF_3;
    FrameLayout FrameLayoutSheetF_4;
    FrameLayout FrameLayoutSheetF_5;
    FrameLayout FrameLayoutSheetF_6;
    FrameLayout FrameLayoutSheetF_6_1;
    FrameLayout FrameLayoutSheetF_7;
    FrameLayout FrameLayoutSheetF_8;
    FrameLayout FrameLayoutSheetF_8_1;
    FrameLayout FrameLayoutSheetF_8_2;
    FrameLayout FrameLayoutSheetF_8_3;

    FrameLayout FrameLayoutSheetF_ReferToInspector_1;
    FrameLayout FrameLayoutSheetF_ReferToInspector_2;
    FrameLayout FrameLayoutSheetF_ReferToInspector_3;

    CheckBox CKSheetF_2_Tickbox_Yes;

    CheckBox CKSheetF_3_Tickbox_2Traff;
    CheckBox CKSheetF_3_Tickbox_3PlusTraff;

    CheckBox CKSheetF_4_Tickbox_1Bus;
    CheckBox CKSheetF_4_Tickbox_2Bus;

    CheckBox CKSheetF_5_Tickbox_With;
    CheckBox CKSheetF_5_Tickbox_Contra;

    CheckBox CKSheetF_6_Tickbox_Bus;
    CheckBox CKSheetF_6_Tickbox_Traff;

    CheckBox CKSheetF_6_1_Tickbox_Bus;
    CheckBox CKSheetF_6_1_Tickbox_Traff;

    CheckBox CKSheetF_7_Tickbox_Adj;
    CheckBox CKSheetF_7_Tickbox_NotAdj;

    Button BTSheetF_Start;
    Button BTSheetF_Plan30;
    Button BTSheetF_Plan31;
    Button BTSheetF_Plan32;
    Button BTSheetF_Plan33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_f);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's//////////////////////////////////

        FrameLayoutSheetF_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_1);
        FrameLayoutSheetF_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_2);
        FrameLayoutSheetF_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_3);
        FrameLayoutSheetF_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_4);
        FrameLayoutSheetF_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_5);
        FrameLayoutSheetF_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_6);
        FrameLayoutSheetF_6_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_6_1);
        FrameLayoutSheetF_7 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_7);
        FrameLayoutSheetF_8 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_8);
        FrameLayoutSheetF_8_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_8_1);
        FrameLayoutSheetF_8_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_8_2);
        FrameLayoutSheetF_8_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_8_3);

        FrameLayoutSheetF_ReferToInspector_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_ReferToInspector_1);
        FrameLayoutSheetF_ReferToInspector_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_ReferToInspector_2);
        FrameLayoutSheetF_ReferToInspector_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetF_ReferToInspector_3);

        CKSheetF_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetF_2_Tickbox_Yes);

        CKSheetF_3_Tickbox_2Traff = (CheckBox) findViewById(R.id.CKSheetF_3_Tickbox_2Traff);
        CKSheetF_3_Tickbox_3PlusTraff = (CheckBox) findViewById(R.id.CKSheetF_3_Tickbox_3PlusTraff);

        CKSheetF_4_Tickbox_1Bus = (CheckBox) findViewById(R.id.CKSheetF_4_Tickbox_1Bus);
        CKSheetF_4_Tickbox_2Bus = (CheckBox) findViewById(R.id.CKSheetF_4_Tickbox_2Bus);

        CKSheetF_5_Tickbox_With = (CheckBox) findViewById(R.id.CKSheetF_5_Tickbox_With);
        CKSheetF_5_Tickbox_Contra = (CheckBox) findViewById(R.id.CKSheetF_5_Tickbox_Contra);

        CKSheetF_6_Tickbox_Bus = (CheckBox) findViewById(R.id.CKSheetF_6_Tickbox_Bus);
        CKSheetF_6_Tickbox_Traff = (CheckBox) findViewById(R.id.CKSheetF_6_Tickbox_Traff);

        CKSheetF_6_1_Tickbox_Bus = (CheckBox) findViewById(R.id.CKSheetF_6_1_Tickbox_Bus);
        CKSheetF_6_1_Tickbox_Traff = (CheckBox) findViewById(R.id.CKSheetF_6_1_Tickbox_Traff);

        CKSheetF_7_Tickbox_Adj = (CheckBox) findViewById(R.id.CKSheetF_7_Tickbox_Adj);
        CKSheetF_7_Tickbox_NotAdj = (CheckBox) findViewById(R.id.CKSheetF_7_Tickbox_NotAdj);

        BTSheetF_Start = (Button) findViewById(R.id.BTSheetF_Start);
        BTSheetF_Plan30 = (Button) findViewById(R.id.BTSheetF_Plan30);
        BTSheetF_Plan31 = (Button) findViewById(R.id.BTSheetF_Plan31);
        BTSheetF_Plan32 = (Button) findViewById(R.id.BTSheetF_Plan32);
        BTSheetF_Plan33 = (Button) findViewById(R.id.BTSheetF_Plan33);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetF_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);

        ///////////////////////////////Methods////////////////////////////////////////
        BTSheetF_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetF_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetF_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_2_Tickbox_Yes.isChecked()) {



                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetF_3_Tickbox_2Traff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_3_Tickbox_2Traff.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_3_Tickbox_3PlusTraff.setChecked(false);
                } else {
                    CKSheetF_3_Tickbox_3PlusTraff.setChecked(false);
                }
            }

        });

        CKSheetF_3_Tickbox_3PlusTraff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_3_Tickbox_3PlusTraff.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_3_Tickbox_2Traff.setChecked(false);
                } else {
                    CKSheetF_3_Tickbox_2Traff.setChecked(false);
                }
            }

        });

        CKSheetF_4_Tickbox_1Bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_4_Tickbox_1Bus.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_4_Tickbox_2Bus.setChecked(false);

                } else {
                    CKSheetF_4_Tickbox_2Bus.setChecked(false);
                }
            }

        });

        CKSheetF_4_Tickbox_2Bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_4_Tickbox_2Bus.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_4_Tickbox_1Bus.setChecked(false);

                } else {
                    CKSheetF_4_Tickbox_1Bus.setChecked(false);
                }
            }

        });

        CKSheetF_5_Tickbox_With.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_5_Tickbox_With.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_5_Tickbox_Contra.setChecked(false);

                } else {
                    CKSheetF_5_Tickbox_Contra.setChecked(false);
                }
            }

        });

        CKSheetF_5_Tickbox_Contra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_5_Tickbox_Contra.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_5_Tickbox_With.setChecked(false);

                } else {
                    CKSheetF_5_Tickbox_With.setChecked(false);
                }
            }

        });

        CKSheetF_6_Tickbox_Bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_6_Tickbox_Bus.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_6_Tickbox_Traff.setChecked(false);

                } else {
                    CKSheetF_6_Tickbox_Traff.setChecked(false);
                }
            }

        });

        CKSheetF_6_Tickbox_Traff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_6_Tickbox_Traff.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_6_Tickbox_Bus.setChecked(false);

                } else {
                    CKSheetF_6_Tickbox_Bus.setChecked(false);
                }
            }

        });

        CKSheetF_6_1_Tickbox_Bus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_6_1_Tickbox_Bus.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_6_1_Tickbox_Traff.setChecked(false);

                } else {
                    CKSheetF_6_1_Tickbox_Traff.setChecked(false);
                }
            }

        });

        CKSheetF_6_1_Tickbox_Traff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_6_1_Tickbox_Traff.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.VISIBLE);
                    CKSheetF_6_1_Tickbox_Bus.setChecked(false);

                } else {
                    CKSheetF_6_1_Tickbox_Bus.setChecked(false);
                }
            }

        });

        CKSheetF_7_Tickbox_Adj.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_7_Tickbox_Adj.isChecked()) {

                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_7_Tickbox_NotAdj.setChecked(false);

                } else {
                    CKSheetF_7_Tickbox_NotAdj.setChecked(false);
                }
            }

        });

        CKSheetF_7_Tickbox_NotAdj.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetF_7_Tickbox_NotAdj.isChecked()) {
                    FrameLayoutSheetF_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_6_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_7.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_ReferToInspector_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_ReferToInspector_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetF_8.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_2.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetF_8_3.setVisibility(LinearLayout.GONE);
                    CKSheetF_7_Tickbox_Adj.setChecked(false);

                } else {
                    CKSheetF_7_Tickbox_Adj.setChecked(false);
                }
            }

        });

        BTSheetF_Plan30.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetF.this, TMPPlan30.class));

            }

        });

        BTSheetF_Plan31.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetF.this, TMPPlan31.class));

            }

        });

        BTSheetF_Plan32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetF.this, TMPPlan32.class));

            }

        });

        BTSheetF_Plan33.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //startActivity(new Intent(TMPSheetF.this, TMPPlan33.class));

            }

        });

    }

}
