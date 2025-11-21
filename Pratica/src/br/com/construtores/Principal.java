package br.com.construtores;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

       Produto produto1 = new Produto("caderno", 9.90,100);
       Produto produto2 = new Produto("lapis",1.5, 500);
       Produto produto3 = new Produto("caneta",2, 400);
       Produto produto4 = new Produto("borracha",1, 150);

       ArrayList<Produto> listaProdutos = new ArrayList<>();
       listaProdutos.add(produto1);
       listaProdutos.add(produto2);
       listaProdutos.add(produto3);
       listaProdutos.add(produto4);

        System.out.println(listaProdutos.size());
        System.out.println(listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos){
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("leite", 5.99, 500, "17/03/1998");
        produtoPerecivel.exibeProduto();
    }
}
