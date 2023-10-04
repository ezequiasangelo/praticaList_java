package praticaheranca;

public class Secretaria extends FuncionarioBanco {
    private String ramal;

    public Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ramal: " + ramal;
    }
}
