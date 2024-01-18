package org.example;

import java.util.Scanner;

enum MesAno {
    JANEIRO(31), FEVEREIRO(28), MARCO(31), ABRIL(30), MAIO(31), JUNHO(30),
    JULHO(31), AGOSTO(31), SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

    private final int dias;

    MesAno(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMes = scanner.next();

        MesAno mes = MesAno.valueOf(nomeMes);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        int diasNoMes = diasNoMes(mes, ano);

        System.out.println("O mês de " + nomeMes + " no ano " + ano + " tem " + diasNoMes + " dias.");
    }

    static int diasNoMes(MesAno mes, int ano){
        return (mes == MesAno.FEVEREIRO && ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : mes.getDias();
    }
}