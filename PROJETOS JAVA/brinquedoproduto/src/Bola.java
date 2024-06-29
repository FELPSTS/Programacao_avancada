public class Bola extends Produto {
    private double tamanho;

    public Bola(
    		String nome,
    		double tamanho) {
        super(
        		nome
        		);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
