public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("SUV");
        carro.definirPrecos(20000, 300000, 50000);
        carro.exibiInfo();

        carro.calculaMaiorPreco();
        carro.calculaMenorPreco();

    }
}
