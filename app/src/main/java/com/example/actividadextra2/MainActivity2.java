package com.example.actividadextra2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alante = findViewById(R.id.button1);
        alante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next= new Intent(MainActivity2.this, MainActivity3.class );
                startActivity(next);

            }
        });


        Button atras = findViewById(R.id.button2);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras= new Intent(MainActivity2.this, MainActivity.class );
                startActivity(atras);
            }
        });
    }
}