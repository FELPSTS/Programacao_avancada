public class TesteBrinquedo {

    public static void main(String[] args) {
        Brinquedo brinquedo = new Brinquedo();
        System.out.println("Código do brinquedo: " + brinquedo.getCodigo());
        System.out.println("Nome do brinquedo: " + brinquedo.getNome());
        System.out.println("Descrição do brinquedo: " + brinquedo.getDescricao());
        System.out.println("Preço do brinquedo: $" + brinquedo.getPreco());
    }
}
