package com.example.david.vrapppractice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.auth.FirebaseAuth;

public class User_Profile extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Firebase mRootRef;

    private TextView user_name, contact, countView;

    Button home;
    Button bCount;

    boolean internet_connected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
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
        bCount = (Button) findViewById(R.id.bCount);

        internet_connected = Online_check();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(User_Profile.this, LandingPage.class));
            }
        });

        bCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    mRootRef.child("users").addListenerForSingleValueEvent(new com.firebase.client.ValueEventListener() {
                        @Override
                        public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
                            int Count = dataSnapshot.child("Test Count").getValue(int.class);
                            int Counted = Counter(Count);
                            Firebase childRef = mRootRef.child("users").child("Test Count");
                            childRef.setValue(Counted);

                            countView = (TextView) findViewById(R.id.countView);
                            String tCount = Integer.toString(Counted);
                            countView.setText("Total Count: " + tCount);
                    }
                        @Override
                        public void onCancelled(FirebaseError firebaseError) {

                        }
                    });
                }





        });

    }

    public int Counter(int Count){

        Count = Count + 2;
        return Count;
    }

    public boolean Online_check(){

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();

    }

}
