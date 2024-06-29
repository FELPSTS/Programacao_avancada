public class Brinquedo extends Produto {
    private int faixaEtaria;

    public Brinquedo(
    		String nome,
    		int faixaEtaria) {
    	
        super(
        		nome
        		);
        this.faixaEtaria = faixaEtaria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
