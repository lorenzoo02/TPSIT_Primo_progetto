package com.example.tpsit_primoProgetto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button reset, test;
    TextView testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset = findViewById(R.id.reset);
        test = findViewById(R.id.test);
        testo = findViewById(R.id.testo);
    }

    public void reset(View v){
        testo.setText("");
    }

    public void test(View v){
        testo.setText("Messaggio di prova");
    }


}