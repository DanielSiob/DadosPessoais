package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Informacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao);

        Intent intentRecebe = getIntent();

        Bundle parametros = intentRecebe.getExtras();



        String nome = parametros.getString("chave_nome");
        String idade = parametros.getString("chave_idade");
        String telefone = parametros.getString("chave_telefone");
        String email = parametros.getString("chave_email");
        String peso = parametros.getString("chave_peso");
        String altura = parametros.getString("chave_altura");


        TextView textViewNome = (TextView)findViewById(R.id.textViewVerNome);
        TextView textViewIdade = (TextView)findViewById(R.id.textViewVerIdade);
        TextView textViewTelefone = (TextView)findViewById(R.id.textViewVerTelefone);
        TextView textViewEmail = (TextView)findViewById(R.id.textViewVerEmail);
        TextView textViewPeso = (TextView)findViewById(R.id.textViewVerPeso);
        TextView textViewAltura = (TextView)findViewById(R.id.textViewVerAltura);


        textViewNome.setText(nome);
        textViewIdade.setText(idade);
        textViewTelefone.setText(telefone);
        textViewEmail.setText(email);
        textViewPeso.setText(peso);
        textViewAltura.setText(altura);
    }
}
