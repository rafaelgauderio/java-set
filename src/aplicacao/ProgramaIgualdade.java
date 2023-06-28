package aplicacao;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class ProgramaIgualdade {

	public static void main(String[] args) {
		
		System.out.println("Testar igualdade dem conjutos (SET)\n"
				+ "\tSe hashCode e equals estiverevem implementados,\n"
				+ "\tusa hashCode para testar e equals para confirmar a igualdade.\n"
				+ "\tSe hashCode e equals não estiverem implementados,\n"
				+ "\tusa referências (ponteiros) para testar a igualdade dos objetos.\n");
		
		Set<Product> products = new HashSet<Product>();
		
		products.add(new Product("Detergente", 1500.0));
		products.add(new Product("Sabonete",200.50));
		products.add(new Product("Hidratante",45.90));
		
		Product p1 = new Product("Detergente",1500.0);
		
		// comparando a referência das estâncias vai dizer que os objetos não são iguais
		System.out.println(products.contains(p1)); // false
		
		

	}

}
