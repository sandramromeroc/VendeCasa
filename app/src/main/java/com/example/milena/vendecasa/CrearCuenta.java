package com.example.milena.vendecasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CrearCuenta extends AppCompatActivity {


    public void crear(View View) {

        Intent i = new Intent(this, com.example.milena.vendecasa.Login.class);
        startActivity(i);

        finish();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);



    }
}
