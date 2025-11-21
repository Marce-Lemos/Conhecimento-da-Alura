public class ConversorMoeda implements ConversaoFinanceira {
    private double ValorEmDolar;

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        this.ValorEmDolar = valorEmDolar;

        return (valorEmDolar * 5.45);
    }
}
