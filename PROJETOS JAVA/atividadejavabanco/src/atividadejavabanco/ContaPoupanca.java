package atividadejavabanco;

public class ContaPoupanca extends ContaBanco {

    public ContaPoupanca(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double limiteChequeEspecial) {
        super(numeroAgencia, numeroConta, "Poupanca", saldo, nomeTitular);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
