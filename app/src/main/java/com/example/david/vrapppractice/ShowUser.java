package com.example.david.vrapppractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;

public class ShowUser extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Firebase mRootRef;

    private TextView user_name, contact;

    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Firebase.setAndroidContext(this);
        mRootRef = new Firebase("https://vrappproper-59289.firebaseio.com/");
        firebaseAuth = FirebaseAuth.getInstance();

        mRootRef.child("users").child(firebaseAuth.getCurrentUser().getUid()).child("Profile").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {

                String userName = dataSnapshot.child("User Name").getValue(String.class);
                String userContact = dataSnapshot.child("Contact").getValue(String.class);

                user_name.setText(userName);
                contact.setText(userContact);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        user_name = (TextView) findViewById(R.id.user_name);
        contact = (TextView) findViewById(R.id.contact);

        home = (Button) findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShowUser.this, LandingPage.class));
            }
        });

    }

}
