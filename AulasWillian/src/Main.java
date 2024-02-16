import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int valorUm = 20;
        int valorDois = 20;
        if (valorUm == valorDois) {
            System.out.println("Os valores são iguais");
        }

        BigDecimal valoresMonetarios;

        String textoUm = new String("texto");
        String textoDois = new String("texto");
        //Comparacao de objetos é sempre pelo equals
        if (textoUm.equals(textoDois)) {
            System.out.println("Os textos são iguais");
        } else {
            System.out.println("Os textos não são iguais");
        }

        HyndaiHB20 b20 = new HyndaiHB20();
        b20.carroceria = "sedan";
        b20.cor = "branca";
        b20.motor = "1.0";
        b20.anoFabricacao = 2023;
        b20.quantidadeMarcha = 6;
        // Quando é objeto a passagem é por referência
        mudarCor(b20, "preta");
        System.out.println(b20.VERSION);

        HyndaiHB20 b20DaMassa = new HyndaiHB20();
        b20DaMassa.carroceria = "hatch";
        b20DaMassa.cor = "branca";
        b20DaMassa.motor = "1.0";
        b20DaMassa.anoFabricacao = 2018;
        b20DaMassa.quantidadeMarcha = 5;
        System.out.println(b20DaMassa.VERSION);

        //Quando é primitivo a passagem é de valor
        valorUm = 1;
        valorDois = 2;
        calcular(valorUm, valorDois);
        System.out.println("Pediu para parar, parou");

        HyndaiHB20[] arrayDeB20 = new HyndaiHB20[20];
        ArrayList listaDeB20 = new ArrayList();
        listaDeB20.add(b20);
        listaDeB20.clear();

        HashMap mapaDeB20 = new HashMap();
        mapaDeB20.put("meu-b20", b20);
        mapaDeB20.clear();

        lista();
        mudarCor(b20, "Nem existe");
        System.out.println("Pediu para parar, parou");
    }

    public static void lista() {
        ArrayList listaDeB20 = new ArrayList();
        for (int index = 0; index < 10000; index++) {
            listaDeB20.add(new HyndaiHB20());
        }
    }

    public static void mudarCor(HyndaiHB20 b20, String cor) {
        b20.cor = cor;
    }

    public static void calcular(int valorUm, int valorDois) {
        // Tipos primitivos no Java não são objetos
        valorUm = valorUm + valorDois;
    }

}
