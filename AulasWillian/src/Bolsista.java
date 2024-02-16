import java.math.BigDecimal;

public class Bolsista extends Aluno {

    private BigDecimal bolsa;

    public BigDecimal getBolsa() {
        return bolsa;
    }

    public void setBolsa(BigDecimal bolsa) {
        this.bolsa = bolsa;
    }

    public void realizarPesquisa() {
        System.out.println("Pesquisando no google");
    }
}
