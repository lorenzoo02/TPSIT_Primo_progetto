package com.example.tpsit_primoProgetto;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset, test, play;
    TextView testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset = findViewById(R.id.reset);
        test = findViewById(R.id.test);
        play = findViewById(R.id.play);
        testo = findViewById(R.id.testo);
    }

    public void reset(View v){
        testo.setText("");
    }

    public void test(View v){
        Toast t = Toast.makeText(getApplicationContext(),"Messaggio di prova",Toast.LENGTH_LONG);
        t.show();
    }

    public void secondaAct(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("messaggio", testo.getText());
        startActivity(i);
    }
}