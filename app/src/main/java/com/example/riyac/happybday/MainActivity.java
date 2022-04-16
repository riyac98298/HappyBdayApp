package com.example.riyac.happybday;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;

        imageView1=(ImageView)findViewById(R.id.img1);
        imageView2=(ImageView)findViewById(R.id.img2);
        imageView3=(ImageView)findViewById(R.id.img3);
        button=(Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
                imageView1.startAnimation(animation1);
                final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hbdsong);
                animation1.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        mediaPlayer.start();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mediaPlayer.stop();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                });

                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation2);
                imageView2.startAnimation(animation2);
                Animation animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation3);
                imageView3.startAnimation(animation3);
            }
        });



    }}
