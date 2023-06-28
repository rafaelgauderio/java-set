package aplicacao;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class ProgramIgualdadeTreeSet {

	public static void main(String[] args) {
	Set<Product> products = new TreeSet<Product>();
		
		products.add(new Product("Detergente", 1500.0));
		products.add(new Product("Sabonete",200.50));
		products.add(new Product("Hidratante",45.90));		
		products.add(new Product("Detergente",1500.0));
		products.add(new Product("Desinfetante", 1500.0));
		products.add(new Product("Amaciante", 420.30));
		
		// vai disparar exceção se tentar imprimir sem implementar a class Comparable na class Product
		// vai imprimir em ordem alfabética pois está para comparar por name
		for(Product nickname : products) {
			System.out.println(nickname);
		}
		
		
	}

}
