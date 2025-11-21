import java.util.Scanner;

public class QualMaior {
    public static void main(String[] args) {
        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int num2 = 0;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scan.nextInt();

        if (num > num2) {
            System.out.println(num + " é maior que " + num2);
        } else if (num == num2) {
            System.out.println(num + " é igual a " + num2);
        } else {
            System.out.println(num2+ " é maior que " + num);
        }

    }
}
