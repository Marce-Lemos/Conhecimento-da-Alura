import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(8);
        inteiros.add(4);
        inteiros.add(2);
        inteiros.add(9);
        inteiros.add(7);

        Collections.sort(inteiros);
        System.out.println(inteiros);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);

        for (Integer lista : integerList) {
            System.out.println(lista.toString());
        }

        List<String> lista2 = new LinkedList<>();
        lista2.add("Casa");
        lista2.add("madeira");
        lista2.add("Ameixa");
        lista2.add("xale");

        System.out.println(lista2.toString());
        Collections.sort(lista2);
        System.out.println(lista2.toString());






    }
}