package com.example.maca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextView nuevoUsuario, bienvenidoLabel, continuarLabel;
    ImageView LoginImageView;
    TextInputLayout usuarioTextfield, contrasenaTextField;
    MaterialButton inicioSesion;

    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.btnLogin);

        LoginImageView= findViewById(R.id.LoginImageView);
        bienvenidoLabel = findViewById(R.id.bienvenidoLabel);
        continuarLabel = findViewById(R.id.continuarLabel);
        usuarioTextfield = findViewById(R.id.usuarioTextfield);
        contrasenaTextField = findViewById(R.id.contrasenaTextfield);
        inicioSesion = findViewById(R.id.iniciaSesion);
        nuevoUsuario = findViewById(R.id.nuevoUsuario);

        nuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

    }
}