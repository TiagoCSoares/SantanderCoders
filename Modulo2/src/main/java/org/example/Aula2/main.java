package org.example.Aula2;

public class main {
    public static void main(String[] args) {


        String conectores[] = new String[2];

        conectores[0] = "Usb";
        conectores[1] = "dvd";

        AparelhoDeSom aparelho = new AparelhoDeSom(
                5.0f,
                220,
                conectores
        );

        Disco disco1 = new Disco(
                "Ive i've",
                "IVE",
                "KPop",
                2023,
                10
        );

        Disco disco2 = new Disco(
                "All my demons",
                "Aurora",
                "Indie",
                2023,
                10
        );

        aparelho.ligar();
        aparelho.inserirDisco(disco1);
        aparelho.inserirDisco(disco2);
        aparelho.retirarDisco();
        aparelho.inserirDisco(disco2);
        String musica = aparelho.lerDados();
        System.out.println(musica);

    }

}
