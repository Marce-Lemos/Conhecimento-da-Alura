import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marcelo", 27);
        Pessoa pessoa2 = new Pessoa("Maisa", 59);
        Pessoa pessoa3 = new Pessoa("Marcia", 63);


        ArrayList<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(pessoa);
        listPessoas.add(pessoa2);
        listPessoas.add(pessoa3);

        System.out.println("Tamanho do array: "+listPessoas.size());
        System.out.println("Primeiro elemento: " +listPessoas.get(0));
        System.out.println("Lista de Pessoas: ");
        for (Pessoa Pessoa : listPessoas) {
            System.out.println(pessoa);
        }
    }
}