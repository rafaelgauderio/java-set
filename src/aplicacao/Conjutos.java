package aplicacao;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Conjutos {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10, 12));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		System.out.println("conjunto a igual " + a);
		System.out.println("conjunto b igual " + b);
		System.out.println();

		// union = adiciona os elementos diferentes entre os conjuntos
		System.out.println("União entre a e b");
		Set<Integer> c = new TreeSet<>(a); // c vai ser uma copia do conjunto a
		c.addAll(b);
		System.out.println(c);

		// intersection = apenas os elementos em comum entre os conjuntos
		System.out.println("Intersecção entre a e b");
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// difference = remove os elementos em comum nos conjuntos = sobra apenas os
		// diferentes
		System.out.println("Diferença entre a e b");
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
