package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class TMPSheetA extends AppCompatActivity {

    ////////////////////////////////////////////Variables///////////////////////////////////////

    int plan;

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetA_1;
    FrameLayout FrameLayoutSheetA_2;
    FrameLayout FrameLayoutSheetA_3;
    FrameLayout FrameLayoutSheetA_3_1;
    FrameLayout FrameLayoutSheetA_4;
    FrameLayout FrameLayoutSheetA_5;
    FrameLayout FrameLayoutSheetA_6;

    CheckBox CKSheetA_2_Tickbox_No;
    CheckBox CKSheetA_2_Tickbox_Yes;

    CheckBox CKSheetA_3_Tickbox_Less;
    CheckBox CKSheetA_3_Tickbox_More;

    CheckBox CKSheetA_4_Tickbox_Yes;
    CheckBox CKSheetA_5_Tickbox_Minor;

    CheckBox CKSheetA_5_Tickbox_Major;

    CheckBox CKSheetA_6_Tickbox_Less;
    CheckBox CKSheetA_6_Tickbox_More;

    Button BTSheetA_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //////////////////////////////////////Variable ID's/////////////////////////////

        FrameLayoutSheetA_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_1);
        FrameLayoutSheetA_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_2);
        FrameLayoutSheetA_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_3);
        FrameLayoutSheetA_3_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_3_1);
        FrameLayoutSheetA_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_4);
        FrameLayoutSheetA_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_5);
        FrameLayoutSheetA_6 = (FrameLayout) findViewById(R.id.FrameLayoutSheetA_6);

        CKSheetA_2_Tickbox_No = (CheckBox) findViewById(R.id.CKSheetA_2_Tickbox_No);
        CKSheetA_2_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetA_2_Tickbox_Yes);

        CKSheetA_3_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetA_3_Tickbox_Less);
        CKSheetA_3_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetA_3_Tickbox_More);

        CKSheetA_4_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetA_4_Tickbox_Yes);

        CKSheetA_5_Tickbox_Minor = (CheckBox) findViewById(R.id.CKSheetA_5_Tickbox_Minor);

        CKSheetA_5_Tickbox_Major = (CheckBox) findViewById(R.id.CKSheetA_5_Tickbox_Major);

        CKSheetA_6_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetA_6_Tickbox_Less);
        CKSheetA_6_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetA_6_Tickbox_More);

        BTSheetA_Start = (Button) findViewById(R.id.BTSheetA_Start);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetA_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetA_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetA_3_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetA_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetA_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetA_6.setVisibility(LinearLayout.GONE);


        /////////////////////////////////Methods/////////////////////////////////////

        BTSheetA_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetA_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetA_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetA_3_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetA_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetA_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetA_6.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetA_2_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_2_Tickbox_Yes.isChecked()) {

                    Intent i = new Intent(TMPSheetA.this, TMPPlans.class);
                    i.putExtra("plan","7");
                    startActivity(i);
                    CKSheetA_2_Tickbox_No.setChecked(false);

                } else {
                    CKSheetA_2_Tickbox_No.setChecked(false);
                }
            }

        });

        CKSheetA_2_Tickbox_No.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_2_Tickbox_No.isChecked()) {

                    FrameLayoutSheetA_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetA_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetA_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetA_6.setVisibility(LinearLayout.GONE);
                    CKSheetA_2_Tickbox_Yes.setChecked(false);

                } else {
                    CKSheetA_2_Tickbox_Yes.setChecked(false);
                }
            }

        });

        CKSheetA_3_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_3_Tickbox_Less.isChecked()) {

                    FrameLayoutSheetA_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetA_6.setVisibility(LinearLayout.GONE);
                    CKSheetA_3_Tickbox_More.setChecked(false);

                } else {
                    CKSheetA_3_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetA_3_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_3_Tickbox_More.isChecked()) {

                    Intent i = new Intent(TMPSheetA.this, TMPPlans.class);
                    i.putExtra("plan","7");
                    startActivity(i);
                    CKSheetA_3_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetA_3_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetA_4_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_4_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetA_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_6.setVisibility(LinearLayout.GONE);


                } else {

                }
            }

        });

        CKSheetA_5_Tickbox_Minor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_5_Tickbox_Minor.isChecked()) {

                    Intent i = new Intent(TMPSheetA.this, TMPPlans.class);
                    i.putExtra("plan","3");
                    startActivity(i);
                    CKSheetA_5_Tickbox_Major.setChecked(false);

                } else {
                    CKSheetA_5_Tickbox_Major.setChecked(false);
                }
            }

        });

        CKSheetA_5_Tickbox_Major.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_5_Tickbox_Major.isChecked()) {

                    FrameLayoutSheetA_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_3_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetA_6.setVisibility(LinearLayout.VISIBLE);
                    CKSheetA_5_Tickbox_Minor.setChecked(false);

                } else {
                    CKSheetA_5_Tickbox_Minor.setChecked(false);
                }
            }

        });

        CKSheetA_6_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_6_Tickbox_Less.isChecked()) {

                    Intent i = new Intent(TMPSheetA.this, TMPPlans.class);
                    i.putExtra("plan","5");
                    startActivity(i);
                    CKSheetA_6_Tickbox_More.setChecked(false);

                } else {
                    CKSheetA_6_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetA_6_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetA_6_Tickbox_More.isChecked()) {

                    Intent i = new Intent(TMPSheetA.this, TMPPlans.class);
                    i.putExtra("plan","3");
                    startActivity(i);
                    CKSheetA_6_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetA_6_Tickbox_Less.setChecked(false);
                }
            }

        });


    }

}
