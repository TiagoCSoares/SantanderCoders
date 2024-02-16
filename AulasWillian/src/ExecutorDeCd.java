
public class ExecutorDeCd extends ExecutorDeDiscoComBandeja{

    protected ExecutorDeCd(Integer voltagem, Integer voltagemInterna) {
        super(voltagem, voltagemInterna, new Disco[3]);
    }

    @Override
    public void inserirDisco(Disco disco) {
        bandeja[0] = disco;
    }

    @Override
    public Disco removerDisco() {
        return bandeja[0] = null;
    }

    @Override
    public void reproduzir() {
        var dados = bandeja[0].fornecerDados();
        reproduzir(dados);
    }

}
