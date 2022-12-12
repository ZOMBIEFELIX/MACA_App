package com.example.maca_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private TextView Bienvenido;
    private TextView Seleccione;
    private RadioButton llevar;
    private RadioButton entregar;
    private TextView Menu;
    private ImageView Sopa;
    private CheckBox checkbox_Sopa;
    private ImageView chicharrones;
    private CheckBox precio_chicharrones;
    private ImageView nachos;
    private CheckBox precionachos;
    private ImageView Tostitos;
    private CheckBox preciotostitos;
    private ImageView Doritos;
    private CheckBox preciodoritos;
    private ImageView cheetos;
    private CheckBox preciocheetos;
    private ImageView macamix;
    private CheckBox preciomacamix;
    private ImageView esquite;
    private CheckBox precioesquite;
    private ImageView agua;
    private CheckBox precioagua;
    private ImageView parizona;
    private CheckBox precioparizona;
    private ImageView refresco;
    private CheckBox preciobebida;
    private ImageView coca;
    private CheckBox preciocola;
    private Button suma;
    private Button cancela;
    private TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bienvenido=findViewById(R.id.Bienvenido);
        Seleccione=findViewById(R.id.Seleccione);
        llevar=findViewById(R.id.para_llevar);
        entregar=findViewById(R.id.entrega_domicilio);

        Menu=findViewById(R.id.MENU);
        Sopa=findViewById(R.id.sopa);
        checkbox_Sopa=findViewById(R.id.checkbox_sopa);

        chicharrones=findViewById(R.id.chicharron);
        precio_chicharrones=findViewById(R.id.checkchicha);

        nachos=findViewById(R.id.nachos);
        precionachos=findViewById(R.id.precionachos);

        Tostitos=findViewById(R.id.tostitos);
        preciotostitos=findViewById(R.id.preciotostitos);

        Doritos=findViewById(R.id.doritos);
        preciodoritos=findViewById(R.id.preociodoritos);

        cheetos=findViewById(R.id.cheetos);
        preciocheetos=findViewById(R.id.preciocheetos);

        macamix=findViewById(R.id.mix);
        preciomacamix=findViewById(R.id.preciomix);

        esquite=findViewById(R.id.esquite);
        precioesquite=findViewById(R.id.precioesquite);

        agua=findViewById(R.id.agua);
        precioagua=findViewById(R.id.precioagua);

        parizona=findViewById(R.id.arizona);
        precioparizona=findViewById(R.id.precioarizona);

        refresco=findViewById(R.id.refrescos);
        preciobebida=findViewById(R.id.preciorefresco);

        coca=findViewById(R.id.coca);
        preciocola=findViewById(R.id.preciococa);

        suma=findViewById(R.id.operacion);
        cancela=findViewById(R.id.cancelar);
        mostrar=findViewById(R.id.resultado);
        }
        public void setSuma (View V)
        {
            Double totalf=0.0;
            if(entregar.isChecked())
                totalf=totalf+10;

            if(checkbox_Sopa.isChecked())
                totalf=totalf+60;

            if(precio_chicharrones.isChecked())
                totalf=totalf+45;

            if(precionachos.isChecked())
                totalf=totalf+50;

            if(preciotostitos.isChecked())
                totalf=totalf+45;

            if(preciodoritos.isChecked())
                totalf=totalf+45;

            if(preciocheetos.isChecked())
                totalf=totalf+45;

            if(preciomacamix.isChecked())
                totalf=totalf+82;

            if(precioesquite.isChecked())
                totalf=totalf+50;

            if(precioagua.isChecked())
                totalf=totalf+10;

            if(precioparizona.isChecked())
                totalf=totalf+23;

            if(preciobebida.isChecked())
                totalf=totalf+20;

            if(preciocola.isChecked())
                totalf=totalf+19;

                mostrar.setText("Total: "+totalf);
            }


        public void setCancela(View V)
        {
            entregar.setChecked(false);
            checkbox_Sopa.setChecked(false);
            precio_chicharrones.setChecked(false);
            precionachos.setChecked(false);
            preciotostitos.setChecked(false);
            preciodoritos.setChecked(false);
            preciocheetos.setChecked(false);
            preciomacamix.setChecked(false);
            precioesquite.setChecked(false);
            precioagua.setChecked(false);
            precioparizona.setChecked(false);
            preciobebida.setChecked(false);
            preciocola.setChecked(false);

            mostrar.setText("Total=0");

        }

    }