public class Testefuncionario {
    public static void main(String[] args) {
 
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jão");
        funcionario.setCpf("999.999.999-99");
        funcionario.setSalario(3000.0);

        System.out.println("Funcionario:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Bonificacao: " + funcionario.calculaBonificacao());
        
        Gerente gerente = new Gerente();
        gerente.setNome("Mara");
        gerente.setCpf("989.999.999-99");
        gerente.setSalario(7000.0);
        gerente.setSenha("senha123");

        System.out.println("\nGerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Bonificação: " + gerente.calculaBonificacao());
        
        System.out.println("Autenticação com senha correta: " + gerente.autentica("senha123"));
        System.out.println("Autenticação com senha incorreta: " + gerente.autentica("senhaErrada"));
    }
}
