package com.example.ads052dacio;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CriarAlunoActivity extends AppCompatActivity {
    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_alunos);
    }

    public void cadastrarAlunoBtn(View view){
        System.out.println("Olá, você clicou no botão cadastrar!");
    }

}
