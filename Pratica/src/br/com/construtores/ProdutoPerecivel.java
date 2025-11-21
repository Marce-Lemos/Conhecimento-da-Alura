package br.com.construtores;

public class ProdutoPerecivel extends Produto{

    String dataDevalidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDevalidade) {
        super(nome, preco, quantidade);
        this.dataDevalidade = dataDevalidade;
    }

    @Override
    public void exibeProduto() {
        super.exibeProduto();
        System.out.println("Data de validade: " + dataDevalidade);
    }
}
