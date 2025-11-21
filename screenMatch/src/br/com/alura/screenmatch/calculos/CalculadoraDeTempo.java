package br.com.alura.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int TempoTotal;

    public void inclui(Titulo titulo){
        TempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal(){
        return TempoTotal;
    }
}
