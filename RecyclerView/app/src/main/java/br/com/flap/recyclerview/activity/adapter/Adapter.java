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

//"RecyclerView.Adapter<VH>" é a configuração para se puxar a função de Adapter que está localizada no "RecyclerView"
public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    //cria uma lista pois a lista criada no "MainActivity" é "private".
    private List<Filme> listaFilmes;

    //
    public Adapter(List<Filme> lista) {
        listaFilmes = lista;
    }

    //criador do layout do recycler e configura o layout.
    @NonNull
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //feito para setar o layout
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        //foi instanciado e é necessario para que retorne no viewHolder(toda a parte final).
        return new myViewHolder(itemLista);
    }

    //é onde toda a lista é recuperada no Adapter e depois jogada no "myViewHolder".
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        //
        Filme filme = listaFilmes.get( position );
        //pega os TextView setados no "myViewHolder" e seta toda a lista criada no "MainActivity" e recupera os dados no model "Filme".
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    //configura o tamanho da lista a ser apresentada.
    public int getItemCount() {
        return listaFilmes.size();
    }

    //classe criada para exibir os dados de cada elemento da lista.
    public class myViewHolder extends  RecyclerView.ViewHolder{

        //Seta todos os componentes que vão ser apresentados.
        TextView titulo;
        TextView ano;
        TextView genero;

        //objeto criado para setar os componentes criados acima.
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            ano = itemView.findViewById(R.id.ano);
            genero = itemView.findViewById(R.id.genero);
        }
    }

}
