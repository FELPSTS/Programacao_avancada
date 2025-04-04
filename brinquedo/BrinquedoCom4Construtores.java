public class BrinquedoCom4Construtores {

    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    public BrinquedoCom4Construtores() {
        this.nome = "Brinquedo Padrão";
        this.codigo = 0;
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
}