package com.example.artur.juegobusqueda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.Comenzar);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAlMapa();
            }
        });
    }

    private void irAlMapa(){
        Intent pantallaMapa = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(pantallaMapa);
    }
}
