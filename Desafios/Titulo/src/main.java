import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {

        Titulo novo = new Titulo("Harry Potter");
        Titulo novo1 = new Titulo("Madagascar");
        Titulo novo2 = new Titulo("Covarde");

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(novo);
        list.add(novo1);
        list.add(novo2);

        Collections.sort(list);
        System.out.println(list);


    }
}

