public class main {
    public static void main(String[] args) {
        ContaBancaria2 conta = new ContaBancaria2();
        conta.depositar(1200);
        conta.sacar(100);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(500);
        contaCorrente.cobraTarifaMensal(20);


        contaCorrente.sacar(200);



    }
}
