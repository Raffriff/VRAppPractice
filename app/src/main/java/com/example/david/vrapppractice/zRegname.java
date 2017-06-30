package com.example.david.vrapppractice;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class zRegname extends AppCompatActivity implements View.OnClickListener {


    private Firebase mRootRef;
    private FirebaseAuth firebaseAuth;

    private EditText etuser_name, etuser_access_level,etuser_date, etcontact;
    private ImageButton z_regnamerightarrow,z_regnameleftarrow, z_regnamerightarrow2,z_regnameleftarrow2;

    private ProgressDialog progressDialog;

    FrameLayout Step1of3, Step2of3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_regname);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressDialog = new ProgressDialog(this);

        Firebase.setAndroidContext(this);
        mRootRef = new Firebase("https://vrappproper-59289.firebaseio.com/");
        firebaseAuth = FirebaseAuth.getInstance();

        z_regnamerightarrow = (ImageButton) findViewById(R.id.z_regnamerightarrow);
        z_regnameleftarrow = (ImageButton) findViewById(R.id.z_regnameleftarrow);
        z_regnamerightarrow2 = (ImageButton) findViewById(R.id.z_regnamerightarrow2);
        z_regnameleftarrow2 = (ImageButton) findViewById(R.id.z_regnameleftarrow2);

        Step1of3 = (FrameLayout) findViewById(R.id.Step1of3);
        Step2of3 = (FrameLayout) findViewById(R.id.Step2of3);


        etuser_name = (EditText) findViewById(R.id.etuser_name);
        etcontact =(EditText) findViewById(R.id.etcontact);
        etuser_access_level = (EditText) findViewById(R.id.etuser_access_level);
        etuser_date = (EditText) findViewById(R.id.etuser_date);

        z_regnamerightarrow.setOnClickListener(this);
        z_regnameleftarrow.setOnClickListener(this);
        z_regnamerightarrow2.setOnClickListener(this);
        z_regnameleftarrow2.setOnClickListener(this);

        Step2of3.setVisibility(View.GONE);

        Date date = new Date();
        String currentDateandTime = DateFormat.getDateTimeInstance().format(date);


        Firebase childRef3 = mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").child("User Account Created on");
        childRef3.setValue(currentDateandTime);

        Firebase childRef3a = mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").child("Time User last connected");
        childRef3a.setValue(currentDateandTime);


        mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {

                String user_name = dataSnapshot.child("User Name").getValue(String.class);

                if (user_name == null) {
                    etuser_name.setText("");
                } else {
                    etuser_name.setText(user_name);
                }

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view == z_regnamerightarrow) {

            progressDialog.setMessage("Adding User Name...");
            progressDialog.show();

            Firebase childRef = mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").child("User Name");
            String user_name = etuser_name.getText().toString();
            childRef.setValue(user_name);

            if(TextUtils.isEmpty(user_name)) {

                Toast.makeText(this, "Please enter User Name", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
                return;
            }

            Step1of3.setVisibility(View.GONE);
            Step2of3.setVisibility(View.VISIBLE);
            progressDialog.dismiss();

        }
        if (view == z_regnameleftarrow) {
            firebaseAuth.signOut();
            startActivity(new Intent(this, Login_Page.class));

        }

        if (view == z_regnamerightarrow2) {

            progressDialog.setMessage("Adding Contact Details...");
            progressDialog.show();

            Firebase childRef = mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").child("Contact");
            String contact = etcontact.getText().toString();
            childRef.setValue(contact);

            if(TextUtils.isEmpty(contact)) {

                Toast.makeText(this, "Please enter Contact Number", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
                return;
            }

            startActivity(new Intent(this, LandingPage.class));
            progressDialog.dismiss();

        }
        if (view == z_regnameleftarrow2) {
            firebaseAuth.signOut();
            Step2of3.setVisibility(View.GONE);
            Step1of3.setVisibility(View.VISIBLE);

        }
    }

}