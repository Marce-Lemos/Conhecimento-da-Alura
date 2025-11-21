package br.com.Principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme("TopGun", 1978);
        filme1.setIncluidoNoplano(true);
        filme1.setDuracaoEmMinutos(180);

        Filme filme2 = new Filme("Pulp Fiction", 1994);
        filme2.setDuracaoEmMinutos(150);

//        filme1.exibeFichaTecnica();
//        filme1.avalia(8.7);
//        filme1.avalia(9);
//        filme1.avalia(8.2);
//
//        System.out.println("Soma das avaliações: "+ filme1.getSomaDasAvaliacoes());
//        System.out.println("Total de avaliações: "+ filme1.getTotalDeAvaliacoes());
//        System.out.println("Média das avaliações: "+ filme1.pegaMedia());

        Serie mentalista = new Serie("The Mentalist",2004);
        mentalista.setTemporadas(9);
        mentalista.setIncluidoNoplano(true);
        mentalista.setAtiva(true);
        mentalista.setEpisodiosPorTemporada(24);
        mentalista.setMinutosPorEpisodio(45);
        //mentalista.exibeFichaTecnica();

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(mentalista);
        calc.inclui(filme1);
//        System.out.println("Tempo total em minutos: "+ calc.getTempoTotal());

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

//        System.out.println(filme1.toString());
//        System.out.println(mentalista.toString());

    }
}
