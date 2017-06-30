package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class EULA extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth firebaseAuth;

    private Button eulaagree;
    private Button euladisagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eul);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        eulaagree = (Button) findViewById(R.id.eulaagree);
        eulaagree.setOnClickListener(this);
        euladisagree = (Button) findViewById(R.id.euladisagree);
        euladisagree.setOnClickListener(this);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void onClick(View v) {
        // Do something when the button is clicked

        switch (v.getId()) {

            case R.id.eulaagree:
                startActivity(new Intent(getApplicationContext(), LandingPage.class));
                Toast.makeText(this, "Welcome to the Main Menu", Toast.LENGTH_SHORT).show();
                break;
        }

        switch (v.getId()) {
            case R.id.euladisagree:
                firebaseAuth.signOut();
                startActivity(new Intent(getApplicationContext(), Login_Page.class));
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;

        }
    }


    }


