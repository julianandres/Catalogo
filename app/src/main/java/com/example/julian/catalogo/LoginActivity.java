package com.example.julian.catalogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnIniciar;
    Button btnRegistro;
    EditText login;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIniciar = (Button) findViewById(R.id.btnLogin);
        btnRegistro= (Button) findViewById(R.id.btnRegister);
        login= (EditText) findViewById(R.id.txtUser);
        password= (EditText) findViewById(R.id.txtPass);
        btnIniciar.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (R.id.btnLogin==v.getId()){

        }
        if(R.id.btnRegister==v.getId()){

        }
    }
}
