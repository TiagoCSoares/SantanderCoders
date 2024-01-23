package org.example;

public class ex2 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner();

        int idade = 55;
        String categoria;

        categoria = (idade < 18)?"Juvenil" : (idade > 18 && idade <= 40)?"Adulto" : "Master";
        System.out.printf("Categoria: %s", categoria);
    }
}
