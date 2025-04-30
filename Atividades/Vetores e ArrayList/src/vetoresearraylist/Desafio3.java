package vetoresearraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio3 {

	public static void main(String[] args) {
		
		List<Integer> Numeros = new ArrayList<>();
		
		Numeros.add(10);
		Numeros.add(20);
		Numeros.add(5);
		Numeros.add(6);
		Numeros.add(9);
		Numeros.add(6);
		Numeros.add(5);
		Numeros.add(20);
		Numeros.add(6);
		
		List<Integer> Pares = new ArrayList<Integer>();
		
		for (int num : Numeros) {
		
		if (num % 2 == 0) {
			Pares.add(num);
			}
	}
		Set<Integer> unicos = new HashSet<>();
		Set<Integer> Duplicados = new HashSet<>();
		
		for (int num : Numeros) {
			if (!unicos.add(num)) {
				Duplicados.add(num);
			}
		}
		
		System.out.println("Lista de números: " + Numeros +
				"\nNúmeros Pares: " + Pares +
				"\nNúmeros Duplicados: " + Duplicados);
	}
}