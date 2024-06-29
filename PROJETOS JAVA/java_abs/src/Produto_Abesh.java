public abstract class Produto_Abesh {
    public String nome;
    public double preco;

    public Produto_Abesh(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void incluir(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void alterar(double novoPreco) {
        this.preco = novoPreco;
    }

    public void excluir() {
        this.nome = null;
        this.preco = 0;
    }

    public abstract void atualizar();

	public void atualizar(double novoPreco) {
		
	}
}
