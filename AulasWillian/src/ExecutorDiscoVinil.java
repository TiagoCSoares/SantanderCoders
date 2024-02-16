public class ExecutorDiscoVinil extends ExecutorDeDisco{

    private DiscoVinil vinilDentroDoExecutor;

    protected ExecutorDiscoVinil(Integer voltagem, Integer voltagemInterna) {
        super(voltagem, voltagemInterna);
    }

    @Override
    public void inserirDisco(Disco disco) {
        this.vinilDentroDoExecutor = (DiscoVinil) disco;
    }

    @Override
    public Disco removerDisco() {
        var discoRemovido = vinilDentroDoExecutor;
        this.vinilDentroDoExecutor = null;
        return discoRemovido;
    }

    @Override
    public void reproduzir() {
        if (vinilDentroDoExecutor != null) {
            super.reproduzir(vinilDentroDoExecutor.fornecerDados());
        }
    }

}
