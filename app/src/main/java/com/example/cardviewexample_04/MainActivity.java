package com.example.cardviewexample_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.cardviewexample_04.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Button anim1,anim2,anim3;
    CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        anim1= binding.anim1;
        anim2=binding.anim2;
        anim3=binding.anim3;
        card=binding.card;

        Animation animation1= AnimationUtils.loadAnimation(this,R.anim.animation1);
        Animation animation2= AnimationUtils.loadAnimation(this,R.anim.animation2);
        Animation animation3= AnimationUtils.loadAnimation(this,R.anim.animation3);

        anim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(animation1);
            }
        });

        anim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(animation2);
            }
        });

        anim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(animation3);
            }
        });



    }
}