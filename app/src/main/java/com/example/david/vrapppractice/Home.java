package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

public class Home extends AppCompatActivity {

    ///////////////Button Variables//////////////
    Button Yes1;
    Button No1;
    Button Yes2;
    Button No2;
    Button Yes2_1;
    Button No2_1;
    Button Yes2_2;
    Button No2_2;
    Button Yes3;
    Button Yes3_1_1;
    Button Yes3_1_2;
    Button No3;
    Button Yes4;
    Button No4;
    Button Yes5;
    Button No5;
    Button Yes6;
    Button No6;

    ////////////Layout Variables///////////
    FrameLayout sheet0_1, sheet0_2, sheet0_2_1, sheet0_2_2, sheet0_3_1, sheet0_3, sheet0_4, sheet0_5, sheet0_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///////////////Button ID's///////////////////
        Yes1 = (Button) findViewById(R.id.Yes1);
        No1 = (Button) findViewById(R.id.No1);
        Yes2 = (Button) findViewById(R.id.Yes2);
        No2 = (Button) findViewById(R.id.No2);
        Yes2_1 = (Button) findViewById(R.id.Yes2_1);
        No2_1 = (Button) findViewById(R.id.No2_1);
        Yes2_2 = (Button) findViewById(R.id.Yes2_2);
        No2_2 = (Button) findViewById(R.id.No2_2);
        Yes3 = (Button) findViewById(R.id.Yes3);
        No3 = (Button) findViewById(R.id.No3);
        Yes3_1_1 = (Button) findViewById(R.id.Yes3_1_1);
        Yes3_1_2 = (Button) findViewById(R.id.Yes3_1_2);
        Yes4 = (Button) findViewById(R.id.Yes4);
        No4 = (Button) findViewById(R.id.No4);
        Yes5 = (Button) findViewById(R.id.Yes5);
        No5 = (Button) findViewById(R.id.No5);
        Yes6 = (Button) findViewById(R.id.Yes6);
        No6 = (Button) findViewById(R.id.No6);

        ////////////Frame ID's//////////////////
        sheet0_1 = (FrameLayout) findViewById(R.id.sheet0_1);
        sheet0_2 = (FrameLayout) findViewById(R.id.sheet0_2);
        sheet0_2_1 = (FrameLayout) findViewById(R.id.sheet0_2_1);
        sheet0_2_2 = (FrameLayout) findViewById(R.id.sheet0_2_2);
        sheet0_3 = (FrameLayout) findViewById(R.id.sheet0_3);
        sheet0_3_1 = (FrameLayout) findViewById(R.id.sheet0_3_1);
        sheet0_4 = (FrameLayout) findViewById(R.id.sheet0_4);
        sheet0_5 = (FrameLayout) findViewById(R.id.sheet0_5);
        sheet0_6 = (FrameLayout) findViewById(R.id.sheet0_6);

        ////////////Set Start Views/////////////
        //sheet0_1.setVisibility(View.VISIBLE);
        sheet0_2.setVisibility(View.GONE);
        sheet0_2_1.setVisibility(View.GONE);
        sheet0_2_2.setVisibility(View.GONE);
        sheet0_3.setVisibility(View.GONE);
        sheet0_3_1.setVisibility(View.GONE);
        sheet0_4.setVisibility(View.GONE);
        sheet0_5.setVisibility(View.GONE);
        sheet0_6.setVisibility(View.GONE);


        ////////////Button Events///////////////
        Yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Refer.class));
            }
        });

        No1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_1.setVisibility(View.GONE);
                sheet0_2.setVisibility(View.VISIBLE);
            }
        });

        Yes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2.setVisibility(View.GONE);
                sheet0_2_1.setVisibility(View.VISIBLE);
            }
        });

        No2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2.setVisibility(View.GONE);
                sheet0_3.setVisibility(View.VISIBLE);
            }
        });

        /*Yes2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2.setVisibility(View.GONE);
                sheet0_2_1.setVisibility(View.VISIBLE);
            }
        });*/

        No2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2_1.setVisibility(View.GONE);
                sheet0_2_2.setVisibility(View.VISIBLE);
            }
        });

        /*Yes2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2.setVisibility(View.GONE);
                sheet0_2_1.setVisibility(View.VISIBLE);
            }
        });*/

        No2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_2_2.setVisibility(View.GONE);
                sheet0_3.setVisibility(View.VISIBLE);
            }
        });

        Yes3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_3.setVisibility(View.GONE);
                sheet0_3_1.setVisibility(View.VISIBLE);
            }
        });

        No3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_3.setVisibility(View.GONE);
                sheet0_4.setVisibility(View.VISIBLE);
            }
        });

        /*Yes3_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_3_1.setVisibility(View.GONE);
                sheetA.setVisibility(View.VISIBLE);
            }
        });

        Yes3_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_3_1.setVisibility(View.GONE);
                sheet0_3_2.setVisibility(View.VISIBLE);
            }
        });*/

        /*Yes4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_1.setVisibility(View.GONE);
                sheet0_2.setVisibility(View.VISIBLE);
            }
        });*/

        No4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_4.setVisibility(View.GONE);
                sheet0_5.setVisibility(View.VISIBLE);
            }
        });

        /*Yes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_1.setVisibility(View.GONE);
                sheet0_2.setVisibility(View.VISIBLE);
            }
        });*/

        No5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_5.setVisibility(View.GONE);
                sheet0_6.setVisibility(View.VISIBLE);
            }
        });

        /*Yes6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sheet0_1.setVisibility(View.GONE);
                sheet0_2.setVisibility(View.VISIBLE);
            }
        });*/

        No6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Refer.class));
            }
        });

        /*WebSiteButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Page2.this, WebsiteNew.class));
            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
