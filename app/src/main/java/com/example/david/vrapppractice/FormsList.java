package com.example.david.vrapppractice;

import android.animation.ObjectAnimator;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FormsList extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ProgressBar mprogressBar;

    private FirebaseAuth firebaseAuth;
    private Firebase mRootRef;
    Button tManageSelect;
    private TextView userCount;
    int totalUsers;
    String tUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Firebase.setAndroidContext(this);
        mRootRef = new Firebase("https://vrappproper-59289.firebaseio.com/");
        firebaseAuth = FirebaseAuth.getInstance();

        mRootRef.child("users").addListenerForSingleValueEvent(new com.firebase.client.ValueEventListener() {
            @Override
            public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {

                ////////////Progress bar animtion (Total Users)//////////////
                totalUsers = dataSnapshot.child("User Count").getValue(int.class);
                tUsers = Integer.toString(totalUsers);
                totalUsers = totalUsers/2;
                mprogressBar = (ProgressBar) findViewById(R.id.progressBar2);
                ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "Progress", 1, totalUsers);
                anim.setDuration(1500);
                anim.setInterpolator(new DecelerateInterpolator());
                anim.start();

                userCount = (TextView) findViewById(R.id.User_Count);
                userCount.setText("Total Users: " + tUsers);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        Date date = new Date();
        String currentDateandTime = DateFormat.getDateTimeInstance().format(date);

        Firebase childRef = mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").child("Time User last connected");
        childRef.setValue(currentDateandTime);



        tManageSelect = (Button) findViewById(R.id.tManageSelect);

        tManageSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                popupbox dialogFragment2 = popupbox.newInstance("WarningBoxRAWorkingatheights");
                dialogFragment2.show(fm, "Sample Fragment");
                //startActivity(new Intent(LandingPage.this, Sheet0.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if(firebaseAuth.getCurrentUser() == null){
            startActivity(new Intent(this, DCC_Login_or_Reg.class));
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the activity_sheet0/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            startActivity(new Intent(FormsList.this, User_Profile.class));
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(FormsList.this, Sheet0.class));
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_eula) {

            startActivity(new Intent(FormsList.this, EULA.class));
            Toast.makeText(this, "EULA Page", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_Logout) {
            firebaseAuth.signOut();
            startActivity(new Intent(FormsList.this, DCC_Login_or_Reg.class));
            Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show();
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}