package praticaheranca;

	import java.util.ArrayList;
	import java.util.List;

	public class GerenciadorFuncionarios {
	    private List<FuncionarioBanco> listaFuncionarios;

	    public GerenciadorFuncionarios() {
	        listaFuncionarios = new ArrayList<>();
	    }

	    public void createFuncionario(FuncionarioBanco funcionario) {
	        listaFuncionarios.add(funcionario);
	    }

	    public void readFuncionarios() {
	        System.out.println("Lista de Funcionários:");
	        for (FuncionarioBanco funcionario : listaFuncionarios) {
	            System.out.println(funcionario);
	        }
	    }

	    public void updateFuncionario(int indice, FuncionarioBanco novoFuncionario) {
	        if (indice >= 0 && indice < listaFuncionarios.size()) {
	            listaFuncionarios.set(indice, novoFuncionario);
	            System.out.println("Funcionário alterado com sucesso!");
	        } else {
	            System.out.println("Índice inválido. Não foi possível realizar a alteração.");
	        }
	    }

	    public void deleteFuncionario(int indice) {
	        if (indice >= 0 && indice < listaFuncionarios.size()) {
	            listaFuncionarios.remove(indice);
	            System.out.println("Funcionário removido com sucesso!");
	        } else {
	            System.out.println("Índice inválido. Não foi possível realizar a exclusão.");
	        }
	    }
	}


