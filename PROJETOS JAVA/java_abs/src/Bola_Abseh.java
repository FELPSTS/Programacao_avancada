public class Bola_Abseh extends Produto_Abesh {
    public Bola_Abseh(String nome, double preco) {
        super(nome, preco);
    }
    
    @Override
    public void excluir() {
        super.excluir();
    }
    
    public void atualizar(double novoPreco) {
        this.preco = novoPreco; 
    }

    @Override
    public void atualizar() {
       
    }
}
