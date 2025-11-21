import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        int fatorial = 1;
        System.out.print( numero + "! - ");

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);

            if (i != 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.print(fatorial);
    }
}
