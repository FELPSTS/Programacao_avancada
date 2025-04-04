public class Gerente extends Funcionario {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
    @Override
    public double calculaBonificacao() {
        double bonus = 1000;
        return super.getSalario() + bonus;
    }
}
