package br.com.flap.recyclerview.activity.model;

public class Filme {

    private String tituloFilme;
    private String genero;
    private String ano;

    public Filme(String tituloFilme, String genero, String ano) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }
}
