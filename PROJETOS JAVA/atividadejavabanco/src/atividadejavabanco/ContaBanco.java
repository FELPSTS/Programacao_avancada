package atividadejavabanco;

public abstract class ContaBanco {
    private String numeroAgencia;
    private String numeroConta;
    private String tipoConta;
    protected double saldo; 
    private String nomeTitular;
    protected static int quantidadeContas = 0;

    public ContaBanco(String numeroAgencia, String numeroConta, String tipoConta, double saldo, String nomeTitular) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
        quantidadeContas++; 
    }

    public abstract void depositar(double valor);

    public abstract boolean sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public static int getQuantidadeContas() {
        return quantidadeContas;
    }
}
