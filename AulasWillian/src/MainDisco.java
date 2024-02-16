public class MainDisco {

    public static void main(String[] args) {
        Disco discoChicleteiro = new Disco(
                "Chicleteiro",
                "Bell Marques",
                "Samba/Axé",
                2022,
                22
        );

        Disco discoCarripicho = new Disco(
                "Festa do boi",
                "Carrapicho",
                "Forró",
                1995,
                15
        );

        Disco discoGaucho = new Disco(
                "A marca do sul",
                "Os serranos",
                "Gauchesca",
                1995,
                12
        );

//        ExecutorDeDisco executor = new ExecutorDeDisco(110, 30);
//        executor.ligar();
//        executor.inserirDisco(discoChicleteiro, 0);
//        executor.inserirDisco(discoCarripicho, 1);
//        executor.inserirDisco(discoGaucho, 2);
//        executor.selecionarDisco(2);
//        executar(executor);

        DiscoVinil vinil = new DiscoVinil(
                "Mamonas edition",
                "Mamonas assassinas",
                "Rock/Pop",
                1994,
                12
        );
        ExecutorDiscoVinil executorDiscoVinil = new ExecutorDiscoVinil(110, 30);
        executorDiscoVinil.inserirDisco(vinil);
        executar(executorDiscoVinil);
    }

    public static void executar(ExecutorDeDisco executor) {
        executor.reproduzir();
    }

}
