package com.example.maca_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    TextView nuevoUsuario, bienvenidoLabel, continuarLabel;
    ImageView LoginImageView;
    TextInputLayout usuarioTextfield, contrasenaTextField;
    MaterialButton inicioSesion;
    TextInputEditText emailEditText, passwordEditText;
    private FirebaseAuth mAtuh;


    private Button Login;
    private Button nuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Login = findViewById(R.id.btnLogin);
        nuevo= findViewById(R.id.nuevoUsuario);

        LoginImageView= findViewById(R.id.LoginImageView);
        bienvenidoLabel = findViewById(R.id.bienvenidoLabel);
        continuarLabel = findViewById(R.id.continuarLabel);
        usuarioTextfield = findViewById(R.id.usuarioTextfield);
        contrasenaTextField = findViewById(R.id.contrasenaTextfield);
        inicioSesion = findViewById(R.id.iniciaSesion);
        nuevoUsuario = findViewById(R.id.nuevoUsuario);

        //emailEditText = findViewById(R.id.emailEditText);

        //passwordEditText = findViewById(R.id.passwordEditText);

        mAtuh = FirebaseAuth.getInstance();


        nuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            }
        });

        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
            }
        });


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

        inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();

            }
        });

    }
    public void validate(){
        String email=emailEditText.getText().toString().trim();
        String password=passwordEditText.getText().toString().trim();


        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailEditText.setError("Correo Invalido");
            return;
        }else{
            emailEditText.setError(null);
        }

        if (password.isEmpty() || password.length()<8){
            passwordEditText.setError("Se necesitan mas de 8 caracteres");
            return;
        } else if (!Pattern.compile("[0-9]").matcher(password).find()){
            passwordEditText.setError("Al menos un numero");
            return;
        }else{
            passwordEditText.setError(null);
        }
        iniciarSesion(email,password);

    }

    public void iniciarSesion(String email, String password){
        mAtuh.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Intent intent = new Intent(MainActivity.this, Login.class);
                            startActivity(intent);
                            finish();
                        }else{
                            Toast.makeText(MainActivity.this, "Credendiales equivocadas, Trata de nuevo", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}