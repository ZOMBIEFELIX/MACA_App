package com.example.maca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

    TextView nuevoUsuario, bienvenidoLabel, continuarLabel;
    ImageView signUpImageView;
    TextInputLayout usuarioSignUpTextField, contrasenaTextField;
    MaterialButton inicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpImageView = findViewById(R.id.logo2);
        bienvenidoLabel = findViewById(R.id.bienvenidoLabel);
        continuarLabel = findViewById(R.id.continuarLabel);
        usuarioSignUpTextField = findViewById(R.id.usuarioSignUpTextField);
        contrasenaTextField = findViewById(R.id.contrasenaTextfield);
        inicioSesion = findViewById(R.id.inicioSesion);
        nuevoUsuario = findViewById(R.id.nuevoUsuario);

       nuevoUsuario.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),MainActivity.class));
           }
       });

    }

    @Override
    public void onBackPressed(){
        transitionBack();
    }

    public void transitionBack(){
        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
    }
}