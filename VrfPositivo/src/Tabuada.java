import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber sua tabuada: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int m = num * i;
            System.out.println(num + "x" + i + " = " + m);
        }

    }
}
