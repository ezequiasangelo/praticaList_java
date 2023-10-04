package praticaheranca;

public class Telefonista extends FuncionarioBanco {
    private String estacaoDeTrabalho;

    public Telefonista(String nome, double salario, String estacaoDeTrabalho) {
        super(nome, salario);
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    public String getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(String estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estação de Trabalho: " + estacaoDeTrabalho;
    }
}
