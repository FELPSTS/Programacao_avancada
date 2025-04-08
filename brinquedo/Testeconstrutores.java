package construtor;

public class Testeconstrutores {

    public static void main(String[] args) {
        
        BrinquedoCom4Construtores brinquedo1 = new BrinquedoCom4Construtores(); 
        BrinquedoCom4Construtores brinquedo2 = new BrinquedoCom4Construtores(1001, "Carrinho"); 
        BrinquedoCom4Construtores brinquedo3 = new BrinquedoCom4Construtores(1002, "Boneca", "Boneca de pano");
        BrinquedoCom4Construtores brinquedo4 = new BrinquedoCom4Construtores(1003, "Quebra-cabeça", "Quebra-cabeça 100 peças", 15.99); 

        brinquedo1.setNome("Carrinho de corrida");
        brinquedo1.setDescricao("Carrinho de brinquedo de corrida");
        brinquedo1.setPreco(29.99);
        brinquedo1.setCodigo(101);

        System.out.println("\nDetalhes dos brinquedos:");
        System.out.println("Brinquedo 1: " + brinquedo1.getNome() + ", Descrição: " + brinquedo1.getDescricao() +
                ", Preço: $" + brinquedo1.getPreco() + ", Código: " + brinquedo1.getCodigo());
        System.out.println("Brinquedo 2: " + brinquedo2.getNome() + ", Descrição: " + brinquedo2.getDescricao() +
                ", Preço: $" + brinquedo2.getPreco() + ", Código: " + brinquedo2.getCodigo());
        System.out.println("Brinquedo 3: " + brinquedo3.getNome() + ", Descrição: " + brinquedo3.getDescricao() +
                ", Preço: $" + brinquedo3.getPreco() + ", Código: " + brinquedo3.getCodigo());
        System.out.println("Brinquedo 4: " + brinquedo4.getNome() + ", Descrição: " + brinquedo4.getDescricao() +
                ", Preço: $" + brinquedo4.getPreco() + ", Código: " + brinquedo4.getCodigo());
    }
}