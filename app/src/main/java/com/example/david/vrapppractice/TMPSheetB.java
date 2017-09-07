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

public class TMPSheetB extends AppCompatActivity {

    ////////////////////////////////////////Variables/////////////////////////////////////////

    ScrollView scrollView;

    FrameLayout FrameLayoutSheetB_1;
    FrameLayout FrameLayoutSheetB_2;
    FrameLayout FrameLayoutSheetB_3;
    FrameLayout FrameLayoutSheetB_3_1;
    FrameLayout FrameLayoutSheetB_4;
    FrameLayout FrameLayoutSheetB_4_1;
    FrameLayout FrameLayoutSheetB_5;
    FrameLayout FrameLayoutSheetB_5_1;

    CheckBox CKSheetB_2_Tickbox_Kerb;
    CheckBox CKSheetB_2_Tickbox_Centre;

    CheckBox CKSheetB_3_Tickbox_Yes;

    CheckBox CKSheetB_3_1_Tickbox_Yes;

    CheckBox CKSheetB_4_Tickbox_Minor;
    CheckBox CKSheetB_4_Tickbox_Major;

    CheckBox CKSheetB_4_1_Tickbox_Minor;
    CheckBox CKSheetB_4_1_Tickbox_Major;

    CheckBox CKSheetB_5_Tickbox_Less;
    CheckBox CKSheetB_5_Tickbox_More;

    CheckBox CKSheetB_5_1_Tickbox_Less;
    CheckBox CKSheetB_5_1_Tickbox_More;

    Button BTSheetB_Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmpsheet_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /////////////////////////////////////Variable ID's/////////////////////////////////////

        FrameLayoutSheetB_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_1);
        FrameLayoutSheetB_2 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_2);
        FrameLayoutSheetB_3 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_3);
        FrameLayoutSheetB_3_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_3_1);
        FrameLayoutSheetB_4 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_4);
        FrameLayoutSheetB_4_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_4_1);
        FrameLayoutSheetB_5 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_5);
        FrameLayoutSheetB_5_1 = (FrameLayout) findViewById(R.id.FrameLayoutSheetB_5_1);

        CKSheetB_2_Tickbox_Kerb = (CheckBox) findViewById(R.id.CKSheetB_2_Tickbox_Kerb);
        CKSheetB_2_Tickbox_Centre  = (CheckBox) findViewById(R.id.CKSheetB_2_Tickbox_Centre);

        CKSheetB_3_Tickbox_Yes = (CheckBox) findViewById(R.id.CKSheetB_3_Tickbox_Yes);

        CKSheetB_3_1_Tickbox_Yes  = (CheckBox) findViewById(R.id.CKSheetB_3_1_Tickbox_Yes);

        CKSheetB_4_Tickbox_Minor = (CheckBox) findViewById(R.id.CKSheetB_4_Tickbox_Minor);
        CKSheetB_4_Tickbox_Major = (CheckBox) findViewById(R.id.CKSheetB_4_Tickbox_Major);

        CKSheetB_4_1_Tickbox_Minor = (CheckBox) findViewById(R.id.CKSheetB_4_1_Tickbox_Minor);
        CKSheetB_4_1_Tickbox_Major = (CheckBox) findViewById(R.id.CKSheetB_4_1_Tickbox_Major);

        CKSheetB_5_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetB_5_Tickbox_Less);
        CKSheetB_5_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetB_5_Tickbox_More);

        CKSheetB_5_1_Tickbox_Less = (CheckBox) findViewById(R.id.CKSheetB_5_1_Tickbox_Less);
        CKSheetB_5_1_Tickbox_More = (CheckBox) findViewById(R.id.CKSheetB_5_1_Tickbox_More);

        BTSheetB_Start = (Button) findViewById(R.id.BTSheetB_Start);

        ///////////////////////////////Set Starting Visibilities///////////////////////////

        FrameLayoutSheetB_2.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_3.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_4.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
        FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);

        ///////////////////////////////Methods////////////////////////////////////////
        BTSheetB_Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                FrameLayoutSheetB_3.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetB_4.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);

            }

        });

        CKSheetB_2_Tickbox_Kerb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_2_Tickbox_Kerb.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);
                    CKSheetB_2_Tickbox_Centre.setChecked(false);

                } else {
                    CKSheetB_2_Tickbox_Centre.setChecked(false);
                }
            }

        });

        CKSheetB_2_Tickbox_Centre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_2_Tickbox_Centre.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);
                    CKSheetB_2_Tickbox_Kerb.setChecked(false);

                } else {
                    CKSheetB_2_Tickbox_Kerb.setChecked(false);
                }
            }

        });

        CKSheetB_3_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_3_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetB_3_1_Tickbox_Yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_3_1_Tickbox_Yes.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);

                } else {

                }
            }

        });

        CKSheetB_4_Tickbox_Minor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_4_Tickbox_Minor.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.GONE);
                    CKSheetB_4_Tickbox_Major.setChecked(false);

                } else {
                    CKSheetB_4_Tickbox_Major.setChecked(false);
                }
            }

        });

        CKSheetB_4_Tickbox_Major.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_4_Tickbox_Major.isChecked()) {

                    FrameLayoutSheetB_2.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_3_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_4.setVisibility(LinearLayout.VISIBLE);
                    FrameLayoutSheetB_4_1.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5.setVisibility(LinearLayout.GONE);
                    FrameLayoutSheetB_5_1.setVisibility(LinearLayout.VISIBLE);
                    CKSheetB_4_Tickbox_Minor.setChecked(false);

                } else {
                    CKSheetB_4_Tickbox_Minor.setChecked(false);
                }
            }

        });

        CKSheetB_4_1_Tickbox_Minor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_4_1_Tickbox_Minor.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan4.class));
                    CKSheetB_4_1_Tickbox_Major.setChecked(false);

                } else {
                    CKSheetB_4_1_Tickbox_Major.setChecked(false);
                }
            }

        });

        CKSheetB_4_1_Tickbox_Major.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_4_1_Tickbox_Major.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan6.class));
                    CKSheetB_4_1_Tickbox_Minor.setChecked(false);

                } else {
                    CKSheetB_4_1_Tickbox_Minor.setChecked(false);
                }
            }

        });

        CKSheetB_5_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_5_Tickbox_Less.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan4.class));
                    CKSheetB_5_Tickbox_More.setChecked(false);

                } else {
                    CKSheetB_5_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetB_5_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_5_Tickbox_More.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan1.class));
                    CKSheetB_5_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetB_5_Tickbox_Less.setChecked(false);
                }
            }

        });

        CKSheetB_5_1_Tickbox_Less.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_5_1_Tickbox_Less.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan6.class));
                    CKSheetB_5_1_Tickbox_More.setChecked(false);

                } else {
                    CKSheetB_5_1_Tickbox_More.setChecked(false);
                }
            }

        });

        CKSheetB_5_1_Tickbox_More.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (CKSheetB_5_1_Tickbox_More.isChecked()) {

                    //startActivity(new Intent(TMPSheetB.this, TMPPlan2.class));
                    CKSheetB_5_1_Tickbox_Less.setChecked(false);

                } else {
                    CKSheetB_5_1_Tickbox_Less.setChecked(false);
                }
            }

        });

    }

}
