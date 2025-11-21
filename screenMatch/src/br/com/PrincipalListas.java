package br.com;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {

        Filme filme1 = new Filme("TopGun", 1978);
        filme1.setIncluidoNoplano(true);
        filme1.setDuracaoEmMinutos(180);
        filme1.avalia(9);

        Filme filme2 = new Filme("Pulp Fiction", 1994);
        filme2.setDuracaoEmMinutos(150);
        filme2.avalia(10);

        Serie mentalista = new Serie("The Mentalist",2004);
        mentalista.avalia(8.9);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(mentalista);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getclassificacao() > 4) {
                System.out.println("Classificação: " + filme.getclassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println(lista);



    }
}
