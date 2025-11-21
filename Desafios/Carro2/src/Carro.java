public class Carro {
    private String modelo;
    private double precoano1;
    private double precoano2;
    private double precoano3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoano1, double precoano2, double precoano3){
        this.precoano1 = precoano1;
        this.precoano2 = precoano2;
        this.precoano3 = precoano3;
    }

    public void exibiInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço ano 1: " + precoano1);
        System.out.println("Preço ano 2: " + precoano2);
        System.out.println("Preço ano 3: " + precoano3);
        System.out.println("Preco maior: " + calculaMenorPreco());
        System.out.println("Preco menor: " + calculaMaiorPreco());

    }

    public double calculaMenorPreco(){
        double menorPreco = precoano1;

        if (precoano2 < menorPreco) {
            menorPreco = precoano2;
        }

        if (precoano3 < menorPreco){
            menorPreco = precoano3;
        }
        return menorPreco;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoano1;

        if (precoano2 > maiorPreco) {
            maiorPreco = precoano2;
        }

        if (precoano3 > maiorPreco){
            maiorPreco = precoano3;
        }
        return maiorPreco;
    }


}
