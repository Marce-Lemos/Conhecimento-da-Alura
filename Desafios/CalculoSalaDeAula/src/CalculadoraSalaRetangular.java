public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    @Override
    public double calcularArea(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

        return largura + altura;
    }

}
