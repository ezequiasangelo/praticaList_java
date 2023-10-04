package praticaheranca;

public class TesteGerenciadorFuncionarios {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

        Gerente gerente = new Gerente("Ezequais", 6000.0, "ezequias123", "senha123");
        Telefonista telefonista = new Telefonista("Jair", 2000.0, "Estação 1");
        Secretaria secretaria = new Secretaria("Nilson", 3500.0, "Ramal 101");

        // Inserção de funcionários
        gerenciador.createFuncionario(gerente);
        gerenciador.createFuncionario(telefonista);
        gerenciador.createFuncionario(secretaria);

        // Consulta de funcionários
        gerenciador.readFuncionarios();

        // Alteração de um funcionário
        FuncionarioBanco novoGerente = new Gerente("Mafra", 1340.0, "juliana", "12632");
        gerenciador.updateFuncionario(0, novoGerente);

        // Exclusão de um funcionário
        gerenciador.deleteFuncionario(2);

        // Consulta de funcionários após as operações
        gerenciador.readFuncionarios();
    }
}
