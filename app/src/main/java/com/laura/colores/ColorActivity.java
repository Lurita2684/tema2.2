package com.laura.colores;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class ColorActivity extends AppCompatActivity {

    RelativeLayout relContainer;
    FloatingActionButton buttonFloating;
    String url = "https://www.google.com/search?q=";
    ImageView imgV;
    RadioGroup radioGr;
    RadioButton rduno;
    RadioButton rddos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        imgV = findViewById(R.id.imgView);
        relContainer = findViewById(R.id.container);
        buttonFloating = findViewById(R.id.floatingButton);
        radioGr = findViewById(R.id.radiogr);
        rduno = findViewById(R.id.radiouno);
        rddos = findViewById(R.id.radiodos);

        int colorRecuperado = getIntent().getIntExtra("color", 0);

        switch (colorRecuperado) {

            case 1:
                imgV.setImageResource(R.drawable.pavorojo);
                relContainer.setBackgroundColor(Color.RED);
                url += "red";
                break;
            case 2:
                imgV.setImageResource(R.drawable.imgazul);
                relContainer.setBackgroundColor(Color.BLUE);
                url += "blue";
                break;
            case 3:
                imgV.setImageResource(R.drawable.imagenverde);
                relContainer.setBackgroundColor(Color.GREEN);
                url += "green";
                break;
            case 4:
                imgV.setImageResource(R.drawable.negro);
                relContainer.setBackgroundColor(Color.BLACK);
                url += "black";
                break;
            default:
        }

        buttonFloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =
                        new Intent("android.intent.action.VIEW", Uri.parse(url));
                startActivity(i);

            }
        });

        radioGr.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {

                    case R.id.radiouno:
                        imgV.setAlpha(0.4f);
                        break;

                    case R.id.radiodos:
                        imgV.setAlpha(1.0f);
                        break;


                }

            }
        });
        rduno.setChecked(true);
    }

}
