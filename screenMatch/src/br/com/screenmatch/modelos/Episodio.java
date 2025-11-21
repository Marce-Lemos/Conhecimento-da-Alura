package br.com.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int totalVisualizacao;

    @Override
    public int getclassificacao() {
        if (totalVisualizacao >= 100){
            return 4;
        } else {
            return 2;
        }
    }
}
