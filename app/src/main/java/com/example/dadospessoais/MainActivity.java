package com.example.dadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextIdade;
    private EditText editTextTelefone;
    private EditText editTextEmail;
    private EditText editTextPeso;
    private EditText editTextAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        editTextAltura = (EditText) findViewById(R.id.editTextAltura;
    }

    public void onClickBotaoEnviar(View view){
        String nome = editTextNome.getText().toString();
        String idade = editTextIdade.getText().toString();
        String telefone = editTextTelefone.getText().toString();
        String email = editTextEmail.getText().toString();
        String peso = editTextPeso.getText().toString();
        String altura = editTextAltura.getText().toString();

        Intent intentEnviar = new Intent(getApplicationContext(), Informacao.class);
        Bundle parametros = new Bundle();


        parametros.putString("chave_nome", nome);
        parametros.putString("chave_idade", idade);
        parametros.putString("chave_telefone", telefone);
        parametros.putString("chave_email", email);
        parametros.putString("chave_peso", peso);
        parametros.putString("chave_altura", altura);

        intentEnviar.putExtras(parametros);

        startActivity(intentEnviar);
    }
}
