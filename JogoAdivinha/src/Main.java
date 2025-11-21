import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ram = new Random().nextInt();
        int num = 0;

        int tentativas = 0;
        while (tentativas < 5) {
            System.out.println("Digite um número de 0 a 10: ");
            num = scan.nextInt();
            tentativas++;

            if (num == ram) {
                System.out.println("Parabéns você acertou!");
                break;
            } else {
                if (tentativas < 5){
                    System.out.println("Número errado, tente novamente!");
                } else System.out.println(" ");
            }

            if (tentativas == 5 && num != ram) {
                System.out.println("Você não conseguiu advinhar o número!");
            }

        }




    }
}