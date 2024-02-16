public abstract class ExecutorDeDiscoComBandeja extends ExecutorDeDisco{

    protected Disco[] bandeja;

    protected ExecutorDeDiscoComBandeja(Integer voltagem, Integer voltagemInterna, Disco[] bandeja) {
        super(voltagem, voltagemInterna);
        this.bandeja = bandeja;
    }

}
