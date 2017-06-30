package com.example.david.vrapppractice;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Animation anim;
    ImageView mskull;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        mp = MediaPlayer.create(this, R.raw.beep_button);
        mp.start();

        setContentView(R.layout.activity_splash_screen);

        Thread myThread = new Thread() {
            @Override
            public void run(){
                try{
                    sleep(2000);
                    Intent startMainScreen = new Intent(getApplicationContext(),DCC_Login_or_Reg.class);
                    startActivity(startMainScreen);
                    finish();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        myThread.start();

        mskull = (ImageView) this.findViewById(R.id.mskull);
        anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        mskull.startAnimation(anim);
    }

}
