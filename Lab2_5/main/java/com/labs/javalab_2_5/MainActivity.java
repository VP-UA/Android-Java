package com.labs.javalab_2_5;



import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_anim);
        ObjectAnimator animX = ObjectAnimator.ofFloat(btn, "translationX", -400f);
        animX.setDuration(2200);
        animX.start();

        ObjectAnimator animY = ObjectAnimator.ofFloat(btn, "translationY", 200f);
        animY.setDuration(1400);
        animY.start();

        ImageButton imgbtn = findViewById(R.id.imgbtn_anim);
        ObjectAnimator any2 = ObjectAnimator.ofFloat(imgbtn, "translationY", 1400f);
        any2.setDuration(2200);
        any2.start();

        View txtv = findViewById(R.id.txt_anim);
        ObjectAnimator anim2 = ObjectAnimator.ofFloat(txtv, "translationY", 2000f);
        anim2.setDuration(2000);
        anim2.start();

        AnimatorSet set = new AnimatorSet();
        set.play(animY).before(animX);
        ValueAnimator fadeAnim = ObjectAnimator.ofFloat(btn,"opacity", 1f, 0f);
        fadeAnim.setDuration(1000);

    }
}