package com.example.tpsit_primoProgetto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String mesric = i.getStringExtra( "messaggio");
        i.getExtras();
        Toast t = Toast.makeText(getApplicationContext(), mesric, Toast.LENGTH_SHORT);
        t.show();
    }
}