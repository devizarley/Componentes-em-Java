package br.com.flap.recyclerview.activity.model;

public class Filme {

    //identifica o que vai conter na view/"lista".
    private String tituloFilme;
    private String genero;
    private String ano;

    //"Classe" feita para "interligar" com a lista criada no "MainActivity" instanciando e utilizando como "paramentro".
    public Filme(String tituloFilme, String genero, String ano) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    //todas as variaveis criadas abaixo tem função de recuperar os dados que foram colocados na "MainActivity".
    //dados foram pegos no Adapter
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
