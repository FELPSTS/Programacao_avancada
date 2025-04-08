package construtor;

public class BrinquedoCom4Construtores {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;

    public BrinquedoCom4Construtores() {
        this.codigo = 0;
        this.nome = "Brinquedo Padrão";
        this.descricao = "";
        this.preco = 0.0;
    }

    public BrinquedoCom4Construtores(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = "";
        this.preco = 0.0;
    }

    public BrinquedoCom4Construtores(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = 0.0;
    }

    public BrinquedoCom4Construtores(int codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}