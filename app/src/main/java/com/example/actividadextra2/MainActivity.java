package com.example.actividadextra2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int pag =0;

        Button alante = findViewById(R.id.button1);
        alante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next= new Intent(MainActivity.this, MainActivity2.class );

                startActivity(next);
            }
        });


        Button atras = findViewById(R.id.button2);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras= new Intent(MainActivity.this, MainActivity4.class );
                startActivity(atras);

            }
        });
    }
}