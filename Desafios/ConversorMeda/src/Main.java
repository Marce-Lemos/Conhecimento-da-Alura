
public class Main {
    public static void main(String[] args) {
        ConversorMoeda conv = new ConversorMoeda();
        System.out.printf("Esse valor em Dólar equivale a: %.2f", conv.converterDolarParaReal(50));
    }
}