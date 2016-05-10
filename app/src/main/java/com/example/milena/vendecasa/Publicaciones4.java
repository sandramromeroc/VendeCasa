package com.example.milena.vendecasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Publicaciones4 extends AppCompatActivity {


    public void siguiente4(View View) {

        Intent i = new Intent(this, com.example.milena.vendecasa.Fin.class);
        startActivity(i);
        finish();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicaciones4);
    }
}
