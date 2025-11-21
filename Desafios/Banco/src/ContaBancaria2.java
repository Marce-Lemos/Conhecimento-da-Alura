
public class ContaBancaria2 {
    protected double saldo;

    public void depositar(double valorRecebido){
        saldo += valorRecebido;
        System.out.println("Valor depositado: " + valorRecebido);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("-------------------------------");
    }

    public void sacar(double valorSacado){
        if (valorSacado <= saldo ){
            saldo -= valorSacado;
            System.out.println("Saque de " + valorSacado + " realizado");
            System.out.println("Saldo atual: " + saldo);
            System.out.println("-------------------------------");
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("-------------------------------");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
        System.out.println("-------------------------------");
    }
}
