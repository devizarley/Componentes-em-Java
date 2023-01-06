package br.com.flap.cardview.Model;

public class Postagem {

    private String nome;
    private String descricao;
    private int imagem;

    public Postagem(String nome, String descricao, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void getDescricao(String foto) {
        this.descricao = foto;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
