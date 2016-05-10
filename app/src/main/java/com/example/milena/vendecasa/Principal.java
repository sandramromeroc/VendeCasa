package com.example.milena.vendecasa;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {



    public void crear(View View){
        Intent i = new Intent(this, com.example.milena.vendecasa.CrearCuenta.class);
        startActivity(i);

    }

    public void crear2(View View){
        Intent i = new Intent(this, com.example.milena.vendecasa.Login.class);
        startActivity(i);
        finish();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



    }
}
