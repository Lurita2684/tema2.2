package com.laura.colores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRed, btnBlack, btnBlue, btnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlack = findViewById(R.id.btnBlack);


        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Soy Boton Rojo" +" "+ v.getId(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 1);
                startActivity(i);

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Soy Boton Azul" +" "+ v.getId(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 2);
                startActivity(i);

            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Soy Boton Verdde" +" "+ v.getId(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 3) ;
                startActivity(i);

            }
        });



        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Soy Boton Negro" +" "+ v.getId(), Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), ColorActivity.class);
                i.putExtra("color", 4);
                startActivity(i);

            }
        });
    }
}
