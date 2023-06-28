package aplicacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {

		System.out.println("\nSet\n"
				+ "\t� a representa��o de um conjunto.\n"
				+ "\tN�o admite REPETI��ES.\n"
				+ "\tElementos n�o possuem posi��es."
				+ "\tSet � um interface.\n"
				+ "\tImplementa��es: HashSet, TreeSet, LinkedHashSet.\n"
				+ "\tHashSet: r�dido e n�o ordenado.\n"
				+ "\tLinkedHashSet: intermedi�rio e elementos na ordem natural.\n"
				+ "\tTreeSet: lento e ornenado pelo ComprateTo do Objeto (via de regra ordem alfab�tica).\n");

		// HashSet � o mais r�pido, mas n�o garante a ordem
		System.out.println("Hashset List: r�pido e sem ordem");
		Set<String> set = new HashSet<>();
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Sof�");
		set.add("Mesa");
		set.add("Cachorro");
		set.remove("Sof�");
		set.add("Almofada");
		set.add("Jogo de cadeiras");

		// remove quem tem mais que 7 caracteres
		set.removeIf(x -> x.length() >= 7);
		// remove todo mundo que come�a com C
		set.removeIf(x -> x.charAt(0) == 'C');

		System.out.println(set.contains("Notebook")); // false removido
		System.out.println(set.contains("Cadeira")); // false removido

		for (String apelido : set) {
			System.out.println(apelido);
		}
		// TreeSet � o mais lento, mas garante a ordem
		System.out.println();
		System.out.println("Treehset List:ordem alfab�tica");
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Notebook");
		set2.add("Tablet");
		set2.add("Sof�");
		set2.add("Mesa");
		set2.add("Cachorro");

		for (String apelido : set2) {
			System.out.println(apelido);
		}

		// LinkedHashSett � o mais lento(intermedi�rio, mas garante a ordem tb
		System.out.println();
		System.out.println("LinkedHashSet List:ordem que foram adicionados (ordem natural)");
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Notebook");
		set3.add("Tablet");
		set3.add("Sof�");
		set3.add("Mesa");
		set3.add("Cachorro");
		set3.add("Almofada");

		for (String apelido : set3) {
			System.out.println(apelido);
		}
		

	}

}
