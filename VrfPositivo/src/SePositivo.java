import java.util.Scanner;

public class SePositivo {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um Número para saber se é positivo:");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Esse número é positivo!");
        } else {
            System.out.println("Esse número é negativo!");
        }


    }
}