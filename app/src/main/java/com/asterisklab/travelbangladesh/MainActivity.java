package com.asterisklab.travelbangladesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coxBtn,bandarbanBtn,sundarbansBtn,ahsanmanzilBtn,mapBtn,mohasTestBtn;

        coxBtn = (Button) findViewById(R.id.coxBazarBtn);
        bandarbanBtn = (Button) findViewById(R.id.bandarbanBtn);
        mohasTestBtn = (Button) findViewById(R.id.testBtn);
        sundarbansBtn = (Button) findViewById(R.id.sundarbanBtn);
        ahsanmanzilBtn = (Button) findViewById(R.id.ahsanmanzilBtn);
        mapBtn = (Button) findViewById(R.id.mapBtn);

        final ImageView scene;
        scene = (ImageView) findViewById(R.id.display);

        final int[] allImages = {
                R.drawable.cox,
                R.drawable.bandarban,
                R.drawable.test,
                R.drawable.sundarbans,
                R.drawable.ahsanmanzil,
                R.drawable.map };

        coxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[0]);
            }
        });

        bandarbanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[1]);
            }
        });

        mohasTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[2]);
            }
        });



        sundarbansBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[3]);
            }
        });
        ahsanmanzilBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[4]);
            }
        });

        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scene.setImageResource(allImages[5]);
            }
        });


    }
}
