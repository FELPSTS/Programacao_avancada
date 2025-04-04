public class UsaBrinquedoEncapsulada { 
public static void main (String[] args) { 
	
	Brinquedo brinquedo1 = new Brinquedo(); 
	brinquedo1.setNome("julio");
	brinquedo1.setDescricao("brinquedo");
	brinquedo1.setCodigo(101); 
	brinquedo1.setPreco(8.7);
	System.out.println(brinquedo1.getCodigo()); 
	System.out.println(brinquedo1.getDescricao()); 
	System.out.println(brinquedo1.getNome()); 
	System.out.println(brinquedo1.getPreco()); 
	} 
}