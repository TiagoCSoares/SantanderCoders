public abstract class ExecutorDeDisco {

    private final Integer voltagem;
    private final Integer voltagemInterna;
    private Integer volume;

    protected ExecutorDeDisco(
            Integer voltagem,
            Integer voltagemInterna
    ) {
        this.voltagem = voltagem;
        this.voltagemInterna = voltagemInterna;
        this.volume = 0;
    }

    public abstract void inserirDisco(Disco disco);

    public abstract Disco removerDisco();

    public abstract void reproduzir();

    protected void reproduzir(String dados) {
        System.out.println("Reproduzindo: " + dados);
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }

    public void ligar() {
        System.out.println("Ligando o executor");
    }

    public void desligar() {
        System.out.println("Desligando o executor");
    }

}
