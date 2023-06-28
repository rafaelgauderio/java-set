package aplicacao;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class ProgramaIgualdadeSet {

	public static void main(String[] args) {
		
		System.out.println("Testar igualdade dem conjutos (SET)\n"
				+ "\tSe hashCode e equals estiverevem implementados,\n"
				+ "\tusa hashCode para testar e equals para confirmar a igualdade.\n"
				+ "\tSe hashCode e equals n�o estiverem implementados,\n"
				+ "\tusa refer�ncias (ponteiros) para testar a igualdade dos objetos.\n");
		
		Set<Product> products = new HashSet<Product>();
		
		products.add(new Product("Detergente", 1500.0));
		products.add(new Product("Sabonete",200.50));
		products.add(new Product("Hidratante",45.90));
		
		Product p1 = new Product("Detergente",1500.0);
		Product p2 = new Product("Desinfetante", 1500.0);
		
		// comparando a refer�ncia das est�ncias vai dizer que os objetos n�o s�o iguais
		// ap�s implementar hashCode e equals vai dar verdadeiro se name e price foram iguais
		System.out.println(products.contains(p1)); // true
		System.out.println(products.contains(p2)); // false

	}

}
