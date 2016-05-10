package com.example.milena.vendecasa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }


    public void login(View l){
    EditText usuario = (EditText)findViewById(R.id.usuario);
    EditText contra = (EditText)findViewById(R.id.contraseña);

    String usu = usuario.getText().toString();
    String cont = contra.getText().toString();

    if (usu.equals("yo") && cont.equals("2024")){
        Intent picIntent = new Intent(this,PantallaccSelecc.class);
        startActivity(picIntent);
    }
        finish();

    }

}
