package br.com.flap.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

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
        //cria o adapter
        Adapter adapter = new Adapter(postagens);

        //cria o layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //Layout em forma de grid
        //RecyclerView.LayoutManager layoutManagerGrid = new LinearLayoutManager(this, 1);

        //Seta uma orientação como Horizontal ou vertical mas só funciona utilizando "LinearLayoutManager".
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        //layoutManager.setOrientation(RecyclerView.VERTICAL);


        //Seta o layout
        recyclerPostagem.setLayoutManager(layoutManager);
        //seta o adapter
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