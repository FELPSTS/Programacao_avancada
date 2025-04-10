public class Brinquedo { 
    private int codigo; 
    private String nome; 
    private String descricao; 
    private double preco; 

    public int getCodigo() { 
        return codigo; 
    } 

    public void setCodigo(int codigo) { 
        this.codigo = codigo; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$ " + preco);
    }
}