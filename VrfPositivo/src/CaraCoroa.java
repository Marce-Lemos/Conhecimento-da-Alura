import java.util.Random;
import java.util.Scanner;

public class CaraCoroa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ramd = new Random().nextInt(2) + 1;
        String resultado;
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite 1: para Cara ");
            System.out.println("Digite 2: para Coroa");
            System.out.println("Digite 3: para Sair ");
            System.out.println("--------------------------------------------------");

            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    if (ramd == 1 && escolha == 1) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("Resultado: Cara");
                        System.out.println("Parabéns você ganhou!");
                    } else {
                        System.out.println("--------------------------------------------------");
                        System.out.println("Resultado: Coroa");
                        System.out.println("Você perdeu ");
                    }
                    ramd = new Random().nextInt(2) + 1;
                    break;

                case 2:
                    if (ramd == 2 && escolha == 2) {
                        System.out.println("Resultado: Coroa");
                        System.out.println("parabéns você ganhou!");
                    } else if (ramd == 1) {
                        System.out.println("Resultado: Cara");
                        System.out.println("Você perdeu ");
                    }
                    ramd = new Random().nextInt(2) + 1;
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida , tente novamente!");
            }

        }
    }
}