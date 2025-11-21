package br.com.audio.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalReproducao;
    private int totalcurtidas;
    private int classificacao;

    public void curtir(){

    }

    public void reproduzir(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalcurtidas() {
        return totalcurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
