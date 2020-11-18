package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Time_Activity extends AppCompatActivity {

    private TextView txtTitulo, txtDescricao, txtCategoria;
    private ImageView imagemTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_layout);

        txtTitulo = findViewById(R.id.txtIdTitulo);
        txtDescricao = findViewById(R.id.txtIdDescricao);
        txtCategoria = findViewById(R.id.txtIdCategoria);
        imagemTime =  findViewById(R.id.idImgTimeN);

        Intent intent =  getIntent();

        String titulo = intent.getExtras().getString("Titulo");
        String descricao = intent.getExtras().getString("Descricao");
        String categoria = intent.getExtras().getString("Categoria");
        int miniatura = intent.getExtras().getInt("Miniatura");

        txtTitulo.setText(titulo);
        txtDescricao.setText(descricao);
        txtCategoria.setText(categoria);
        imagemTime.setImageResource(miniatura);
    }
}
