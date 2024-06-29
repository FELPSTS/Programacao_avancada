public class Teste {
    public static void main(String[] args) {
        Produto_Abesh produto1 = new Bola_Abseh("Bola de futebol", 10.99);
        System.out.println("Nome do produto: " + produto1.nome);
        System.out.println("Preço do produto: " + produto1.preco);
        produto1.alterar(12.99);
        System.out.println("Novo preço do produto: " + produto1.preco);
        produto1.excluir();
        System.out.println("Produto excluído: " + produto1.nome);
        produto1.atualizar();

        Bola_Abseh bola = new Bola_Abseh("Bola de vôlei", 15.99);
        System.out.println("\nNome da bola: " + bola.nome);
        System.out.println("Preço da bola: " + bola.preco);
        bola.atualizar(18.99);
        System.out.println("Novo preço da bola: " + bola.preco);
        bola.excluir();
        System.out.println("Bola excluída: " + bola.nome);
        bola.atualizar();
        
        Brinquedo_Abseh brinquedo = new Brinquedo_Abseh("Carrinho", 29.99);
        System.out.println("\nNome do brinquedo: " + brinquedo.nome);
        System.out.println("Preço do brinquedo: " + brinquedo.preco);
        brinquedo.atualizar(34.99);
        System.out.println("Novo preço do brinquedo: " + brinquedo.preco);
        brinquedo.excluir();
        System.out.println("Brinquedo excluído: " + brinquedo.nome);
        brinquedo.atualizar();
    }
}
