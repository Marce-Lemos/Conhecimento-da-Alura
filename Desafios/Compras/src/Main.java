import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do limite: ");
        double limite = scan.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao = 0;
        while (opcao != 1){
            System.out.println("Digite a descrição da compra: ");
            String descricao = scan.next();

            System.out.println("Digite o valor da compra: ");
            double valor = scan.nextDouble();

            Compras compra = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada! ");
                System.out.println("=============================");
                System.out.println("Digite 1 para Sair e 2 para continuar: ");
                opcao = scan.nextInt();
            } else {
                System.out.println("Saldo Insuficiente !");
                opcao = 1;
            }

        }

        System.out.println("=============================");
        System.out.println("Compras Realizadas: ");
        Collections.sort(cartao.getCompra());
        for (Compras c : cartao.getCompra()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("=============================");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }


}
