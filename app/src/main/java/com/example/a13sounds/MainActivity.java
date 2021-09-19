package com.example.a13sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView cat;
    private ImageView dog;
    private MediaPlayer catSound;
    private MediaPlayer dogSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        cat = findViewById( R.id.ivCat );
        dog = findViewById( R.id.ivDog );
        catSound = MediaPlayer.create(this, R.raw.meow );
        dogSound = MediaPlayer.create( this,R.raw.bark );
        ImageClick();


    }
    public void ImageClick(){
        cat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaySound( catSound );
            }
        } );
        dog.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaySound( dogSound );
            }
        } );

    }
    public void PlaySound(MediaPlayer mediaPlayer){
        mediaPlayer.start();
    }


    }






