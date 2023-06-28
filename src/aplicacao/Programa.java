package aplicacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {

		System.out.println("\nSet\n"
				+ "\tÉ a representação de um conjunto.\n"
				+ "\tNão admite REPETIÇÕES.\n"
				+ "\tElementos não possuem posições."
				+ "\tSet é um interface.\n"
				+ "\tImplementações: HashSet, TreeSet, LinkedHashSet.\n"
				+ "\tHashSet: rádido e não ordenado.\n"
				+ "\tLinkedHashSet: intermediário e elementos na ordem natural.\n"
				+ "\tTreeSet: lento e ornenado pelo ComprateTo do Objeto (via de regra ordem alfabética).\n");

		// HashSet é o mais rápido, mas não garante a ordem
		System.out.println("Hashset List: rápido e sem ordem");
		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Sofá");
		set.add("Mesa");
		set.add("Cachorro");
		set.remove("Sofá");
		set.add("Almofada");
		set.add("Jogo de cadeiras");

		// remove quem tem mais que 7 caracteres
		set.removeIf(x -> x.length() >= 7);
		// remove todo mundo que começa com C
		set.removeIf(x -> x.charAt(0) == 'C');

		System.out.println(set.contains("Notebook")); // false removido
		System.out.println(set.contains("Cadeira")); // false removido

		for (String apelido : set) {
			System.out.println(apelido);
		}
		// TreeSet é o mais lento, mas garante a ordem
		System.out.println();
		System.out.println("Treehset List:ordem alfabética");
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Notebook");
		set2.add("Tablet");
		set2.add("Sofá");
		set2.add("Mesa");
		set2.add("Cachorro");

		for (String apelido : set2) {
			System.out.println(apelido);
		}

		// LinkedHashSett é o mais lento(intermediário, mas garante a ordem tb
		System.out.println();
		System.out.println("LinkedHashSet List:ordem que foram adicionados (ordem natural)");
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Notebook");
		set3.add("Tablet");
		set3.add("Sofá");
		set3.add("Mesa");
		set3.add("Cachorro");
		set3.add("Almofada");

		for (String apelido : set3) {
			System.out.println(apelido);
		}
		

	}

}
