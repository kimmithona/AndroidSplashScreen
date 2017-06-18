package com.example.kimmithona.androidsplashscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class AndroidSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        EasySplashScreen easySplashScreen = new EasySplashScreen(AndroidSplashScreen.this)
                .withHeaderText("Hello dear I am a Header Of SplashScreen")
                .withFooterText("Hello dear I am a Footer Of SplashScreen")
                .withBeforeLogoText("Hello I'm a text Before SlplashScreen")
                .withAfterLogoText("Hello I'a a text after SlpashScreen")
                .withLogo(R.mipmap.ic_launcher)
                .withBackgroundColor(Color.parseColor("#66ff66"))
                .withFullScreen()//make full screen during splashscreen appear
                .withSplashTimeOut(5000)//5 second appear before go to MainActivity
                .withTargetActivity(MainActivity.class);//go to MainActivity


        easySplashScreen.getHeaderTextView().setTextColor(Color.WHITE); //Set the color of HeaderText
        easySplashScreen.getFooterTextView().setTextColor(Color.WHITE);//Set the color of FooterText
        easySplashScreen.getBeforeLogoTextView().setTextColor(Color.WHITE);//Set the color of BeforeText
        easySplashScreen.getAfterLogoTextView().setTextColor(Color.WHITE);//Set the color of AfterText

        View view = easySplashScreen.create();
        setContentView(view); //set easySlashScreenView.


    }
}
