import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compra;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compra = new ArrayList<>();
    }

    public boolean lancaCompra (Compras compra){
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compra.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompra() {
        return compra;
    }
}
