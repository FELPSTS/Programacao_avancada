package atividadejavabanco;
package .Conta;

public class Banco {
    private static int quantidadeTotalContas = 0;

    public static void main(String[] args) {
        // Criando uma conta corrente
        ContaCorrente cc = new ContaCorrente("001", "12345-6", 1000.0, "João", 500.0);

        // Criando uma conta poupança
        ContaPoupanca cp = new ContaPoupanca("001", "54321-0", 500.0, "Maria", 0.05);

        // Movimentação bancária
        System.out.println("Saldo da conta corrente: " + cc.consultarSaldo());
        cc.depositar(500.0);
        System.out.println("Saldo após depósito na conta corrente: " + cc.consultarSaldo());
        cc.sacar(200.0);
        System.out.println("Saldo após saque na conta corrente: " + cc.consultarSaldo());

        System.out.println("Saldo da conta poupança: " + cp.consultarSaldo());
        cp.depositar(200.0);
        System.out.println("Saldo após depósito na conta poupança: " + cp.consultarSaldo());
    }

    // Classe Conta
    public static class Conta {
        private String numeroAgencia;
        private String numeroConta;
        private String tipoConta;
        private double saldo;
        private String nomeTitular;

        public Conta(String numeroAgencia, String numeroConta, String tipoConta, double saldo, String nomeTitular) {
            this.numeroAgencia = numeroAgencia;
            this.numeroConta = numeroConta;
            this.tipoConta = tipoConta;
            this.saldo = saldo;
            this.nomeTitular = nomeTitular;
            quantidadeTotalContas++;
        }

        public void depositar(double valor) {
            this.saldo += valor;
        }

        public boolean sacar(double valor) {
            if (this.saldo - valor >= 0) {
                this.saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente.");
                return false;
            }
        }

        public boolean transferir(Conta destino, double valor) {
            if (this.sacar(valor)) {
                destino.depositar(valor);
                return true;
            } else {
                return false;
            }
        }

        public double consultarSaldo() {
            return this.saldo;
        }

        public static int getQuantidadeTotalContas() {
            return quantidadeTotalContas;
        }
    }

    // Classe ContaCorrente (herda de Conta)
    public static class ContaCorrente extends Conta {
        private double limiteChequeEspecial;

        public ContaCorrente(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double limiteChequeEspecial) {
            super(numeroAgencia, numeroConta, "Corrente", saldo, nomeTitular);
            this.limiteChequeEspecial = limiteChequeEspecial;
        }
    }

    // Classe ContaPoupanca (herda de Conta)
    public static class ContaPoupanca extends Conta {
        private double taxaRendimento;

        public ContaPoupanca(String numeroAgencia, String numeroConta, double saldo, String nomeTitular, double taxaRendimento) {
            super(numeroAgencia, numeroConta, "Poupança", saldo, nomeTitular);
            this.taxaRendimento = taxaRendimento;
        }
    }
}
