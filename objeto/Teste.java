public class Teste {

    public static void main(String[] args) {
        MeuObjeto amigo = new MeuObjeto();
        amigo.nome = "Joan";
        amigo.idade = 33;
        amigo.telefone = "22223344";
        System.out.println("Idade antiga: " + amigo.idade);
        amigo.aniversario();
        System.out.println("Nova idade: " + amigo.idade);
        amigo.idade = amigo.idadeEmMeses();
        System.out.println("Idade em meses: " + amigo.idade);
        amigo.alteraIdade(30); 
        System.out.println("Idade atualizada: " + amigo.idade);
    }
}