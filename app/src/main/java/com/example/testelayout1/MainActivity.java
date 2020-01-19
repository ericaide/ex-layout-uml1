package com.example.testelayout1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNome;
    private EditText inputEmail;
    private Button botaoEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNome = findViewById(R.id.texto_nome);
        inputEmail = findViewById(R.id.texto_email);
        botaoEnviar = findViewById(R.id.botao_enviar);


        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = inputNome.getText().toString();
                String email = inputEmail.getText().toString();
                validarCampos(nome, email);
            }
        });


    }

    private void validarCampos(String nome, String email){
        if(nome.isEmpty() && email.isEmpty()){
            Toast.makeText(this, "Preencha o campo Nome e Email", Toast.LENGTH_LONG).show();
        } else{
            if(nome.isEmpty()){
                Toast.makeText(this,"Preencha o campo Nome", Toast.LENGTH_SHORT).show();
            } else {
                if(email.isEmpty()){
                    Toast.makeText(this,"Preencha o campo Email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this,"Dados OK", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
