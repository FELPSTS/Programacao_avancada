package atividadejavabanco;

public class TesteConta {
	
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("001", "12345-6", 1800.0, "Felipe", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("001", "54321-0", 999.0, "Zania", 0.05);
        
        System.out.println("Quantidade de contas criadas: " + ContaBanco.getQuantidadeContas());
        
        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
        contaCorrente.depositar(500.0);
        System.out.println("Saldo após depósito na conta corrente: " + contaCorrente.getSaldo());
        contaCorrente.sacar(200.0);
        System.out.println("Saldo após saque na conta corrente: " + contaCorrente.getSaldo());
        
        System.out.println("Saldo da conta poupança: " + contaPoupanca.getSaldo());
        contaPoupanca.depositar(200.0);
        System.out.println("Saldo após depósito na conta poupança: " + contaPoupanca.getSaldo());
        
        System.out.println("Quantidade de contas criadas: " + ContaBanco.getQuantidadeContas());
    }
}
