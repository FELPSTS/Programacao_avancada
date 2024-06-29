public class BolaFutebol extends Bola {
    private int qtdGomos;

    public BolaFutebol(
    		String nome, 
    		double tamanho,
    		int qtdGomos
    		) {
    	
        super(
        		nome,
        		tamanho
        		);
        this.qtdGomos = qtdGomos;
    }

    public int getQtdGomos() {
        return qtdGomos;
    }

    public void setQtdGomos(int qtdGomos) {
        this.qtdGomos = qtdGomos;
    }
}
