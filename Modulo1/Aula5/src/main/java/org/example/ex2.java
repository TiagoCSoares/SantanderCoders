package org.example;


import java.util.Scanner;

/*Exercício 2: Enum com Switch-Case e Scanner

Crie um enum chamado CategoriaProduto representando
categorias de produtos (ELETRONICO, VESTUARIO, ALIMENTO).

Utilize um Scanner para obter a categoria do
    usuário e imprima uma mensagem correspondente.
*/
public class ex2 {

    enum CategoriaProduto{
        ELETRONICO,
        VESTUARIO,
        ALIMENTO
    }


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a categoria do produto?");
        String tipoCategoria = scanner.next();
        CategoriaProduto categoria = CategoriaProduto.valueOf(tipoCategoria);


    }
}
