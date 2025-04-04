public class Testeconstrutores {

    public static void main(String[] args) {
        Brinquedo brinquedo = new Brinquedo();
        BrinquedoCom4Construtores brinquedo1 = new BrinquedoCom4Construtores();
        BrinquedoCom4Construtores brinquedo2 = new BrinquedoCom4Construtores(1001, "Carrinho");
        BrinquedoCom4Construtores brinquedo3 = new BrinquedoCom4Construtores(1002, "Boneca", "Boneca de pano");
        BrinquedoCom4Construtores brinquedo4 = new BrinquedoCom4Construtores(1003, "Quebra-cabeça", "Quebra-cabeça 100 peças", 15.99);
        System.out.println("\nDetalhes dos brinquedos:");
        System.out.println("Brinquedo 1: " + brinquedo1.getNome() + ", Idade Mínima: " + brinquedo1.getIdadeMinima() + ", Preço: $" + brinquedo1.getPreco() + ", Fabricante: " + brinquedo1.getFabricante());
        System.out.println("Brinquedo 2: " + brinquedo2.getNome() + ", Idade Mínima: " + brinquedo2.getIdadeMinima() +", Preço: $" + brinquedo2.getPreco() + ", Fabricante: " + brinquedo2.getFabricante());
        System.out.println("Brinquedo 3: " + brinquedo3.getNome() + ", Idade Mínima: " + brinquedo3.getIdadeMinima() +", Preço: $" + brinquedo3.getPreco() + ", Fabricante: " + brinquedo3.getFabricante());
        System.out.println("Brinquedo 4: " + brinquedo4.getNome() + ", Idade Mínima: " + brinquedo4.getIdadeMinima() +", Preço: $" + brinquedo4.getPreco() + ", Fabricante: " + brinquedo4.getFabricante());
    }
}
