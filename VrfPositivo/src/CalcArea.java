import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("--------------------------------");
            System.out.println("Digite 1 para área do quadrado");
            System.out.println("Digite 2 para área do triângulo");
            System.out.println("Digite 3 para sair.");
            System.out.println("--------------------------------");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um lado do quadrado:");
                    double lado = scan.nextDouble();
                    double areaq = lado * lado;

                    System.out.println("Área do quadrado vale: " + areaq);
                    break;
                case 2:
                    System.out.println("Digite a base do triângulo: ");
                    double base = scan.nextDouble();

                    System.out.println("Digite a altura do triângulo: ");
                    double altura = scan.nextDouble();
                    double areat = (base * altura)/2;

                    System.out.println("Área do triângulo vale: " + areat);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçãp inválida, tente novamente!");
            }
        }

    }
}
