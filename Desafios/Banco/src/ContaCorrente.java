public class ContaCorrente extends ContaBancaria2{
    private double tarifaMensal;

    public void cobraTarifaMensal(double tarifa){
        this.tarifaMensal = tarifa;
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifa + " cobrada.");
        System.out.println("Saldo atual: " + saldo);
        System.out.println("-------------------------------");
    }
}
