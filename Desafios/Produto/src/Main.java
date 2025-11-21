public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("cadeira gamer");
        produto1.setPreco(200);

        System.out.println("Preço: " + produto1.getPreco());
        produto1.aplicaDesconto(0.1);

        System.out.println("Produto:" + produto1.getNome());
        System.out.println("Preço com desconto: " + produto1.getPreco());


    }
}
