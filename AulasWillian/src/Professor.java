import java.math.BigDecimal;

//Professor herda todas as características e comportamentos de pessoa (extends é palavra para herança)
public class Professor extends Pessoa {

    private BigDecimal salario;

    public void darAula() {
        System.out.println("Aula de POO I");
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
