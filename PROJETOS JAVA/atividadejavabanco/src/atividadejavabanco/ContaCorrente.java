package atividadejavabanco;

public class ContaCorrente extends ContaBanco {
    public ContaCorrente(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double limiteChequeEspecial) {
        super(numeroAgencia, numeroConta, "Corrente", saldo, nomeTitular);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public boolean sacar(double valor) {
        double valorSaque = valor;
        
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
