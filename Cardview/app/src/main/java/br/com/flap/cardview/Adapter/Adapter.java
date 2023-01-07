package br.com.flap.cardview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import br.com.flap.cardview.Model.Postagem;
import br.com.flap.cardview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    //Cria e puxa as listas criadas no Main-Activity
    private List<Postagem> postagens;
    public Adapter(List<Postagem> p) {
        this.postagens = p;
    }

    @NonNull
    @Override
    //Cria o viewholder
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemlista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_postagem, parent, false);
        return new myViewHolder(itemlista);
    }
    //seta todas as informações
    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        Postagem postagem = postagens.get(position);

        holder.nome.setText(postagem.getNome());
        holder.descricao.setText(postagem.getDescricao());
        holder.imagem.setImageResource(postagem.getImagem());
    }
    //objeto pra retornar o numero de view
    @Override
    public int getItemCount() {
        return postagens.size();
    }
    //objeto para criar viewholder e setar no adapter junto com os conteudos encontrados no view
    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView timing;
        ImageView imagem;
        TextView descricao;
        Button curtir;
        Button comentar;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.nome);
            timing = itemView.findViewById(R.id.tempo);
            imagem = itemView.findViewById(R.id.foto);
            descricao = itemView.findViewById(R.id.descricao);
            curtir = itemView.findViewById(R.id.curtir);
            comentar = itemView.findViewById(R.id.comentario);
        }
    }

}
