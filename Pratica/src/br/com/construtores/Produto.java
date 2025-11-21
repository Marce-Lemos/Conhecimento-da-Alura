package br.com.construtores;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibeProduto(){
        System.out.println("Produto: " + getNome());
        System.out.println("Preço: " + "R$ " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
    }

    @Override
    public String toString() {
        return "Produto: " + getNome() + "\n" + "Preço: " + "R$ " + getPreco() + "\n" +
               "Quantidade: " + getQuantidade();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
