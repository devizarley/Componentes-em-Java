package br.com.flap.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.flap.recyclerview.R;
import br.com.flap.recyclerview.activity.model.Filme;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {
        listaFilmes = lista;
    }

    @NonNull
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new myViewHolder(itemLista);
    }

    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Filme filme = listaFilmes.get( position );
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    public int getItemCount() {
        return listaFilmes.size();
    }

    public class myViewHolder extends  RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            ano = itemView.findViewById(R.id.ano);
            genero = itemView.findViewById(R.id.genero);
        }
    }

}
