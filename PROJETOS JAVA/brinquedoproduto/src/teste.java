public class teste {
    public static void main(String[] args) {

        Produto produto = new Produto("Produto infantil");
        System.out.println("Produto: " + produto.getNome());

        Brinquedo brinquedo = new Brinquedo("max steel", 5);
        System.out.println("Brinquedo: " + brinquedo.getNome() + ", Faixa Etária: " + brinquedo.getFaixaEtaria());

        Bola bola = new Bola("Bola de Futebol", 24.0);
        System.out.println("Bola: " + bola.getNome() + ", Tamanho: " + bola.getTamanho());

        BolaFutebol bolaDeFutebol = new BolaFutebol("FT-5", 22.5, 32);
        System.out.println("Bola de Futebol: " + bolaDeFutebol.getNome() + ", Tamanho: " + bolaDeFutebol.getTamanho() + ", Quantidade de Gomos: " + bolaDeFutebol.getQtdGomos());
    }
}
