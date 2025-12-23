package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tekstas = findViewById(R.id.Tekstas);
        Button mygtukas = findViewById(R.id.btnPirmas);
        Button mygtukasSpalva = findViewById(R.id.btnAntras);
        Button mygtukasFonas = findViewById(R.id.btnTrecias);

        mygtukas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekstas.setText("Pavyko!");
            }
        });

        mygtukasSpalva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekstas.setTextColor(android.graphics.Color.RED);
            }
        });

        mygtukasFonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekstas.setBackgroundColor(android.graphics.Color.YELLOW);
            }
        });
    }
}