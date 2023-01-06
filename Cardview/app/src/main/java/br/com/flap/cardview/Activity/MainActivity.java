package br.com.flap.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.flap.cardview.Adapter.Adapter;
import br.com.flap.cardview.Model.Postagem;
import br.com.flap.cardview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        this.prepararPostagens();

        Adapter adapter = new Adapter(postagens);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens (){
        Postagem p = new Postagem("Izarley Rodrigues", "Viagem legal", R.drawable.imagem1);
        this.postagens.add(p);
        p = new Postagem("Joao Oliveira", "Viagem ÓTIMA", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Pedro Dias", "TBT", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Pkiz Sousa", "Viagem super divertida", R.drawable.imagem4);
        this.postagens.add(p);
    }
}