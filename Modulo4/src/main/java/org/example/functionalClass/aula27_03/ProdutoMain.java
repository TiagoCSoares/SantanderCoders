package org.example.functionalClass.aula27_03;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMain {

    public static void main(String[] args) {

        /*Dada uma lista de objetos Produto,
        filtre apenas os produtos com
        preço superior a 100 e mapeie esses
        produtos para seus nomes.
         */
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("PC", 300));
        produtos.add(new Produto("TV", 200));
        produtos.add(new Produto("Sapato", 50));
        produtos.add(new Produto("Garrafa", 20));

        List<String> nomes = produtos.stream()
                .filter(produto -> produto.getPreco() > 100)
                //.map(produto -> produto.getNome())
                .map(Produto::getNome)
                .toList();

        nomes.forEach(System.out::println);




    }

}
