public class MeuObjeto {
    String nome;
    int idade;
    String telefone;
    public void aniversario() {
        idade = idade + 1;
    }
    int idadeEmMeses() {
        return (idade * 12);
    }
    void alteraIdade(int nova_idade) {
        idade = nova_idade;
    }
}