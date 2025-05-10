package vetoresearraylist;

import java.util.ArrayList;
import java.util.List;

public class Desafio2 {

	public static void main(String[] args) {
		
		List<Integer> Numeros = new ArrayList<>();
		
		Numeros.add(10);
		Numeros.add(20);
		Numeros.add(30);
		Numeros.add(40);
		
		//Calcular a soma
		int Soma = 0;
		
		for(int num : Numeros) {
			Soma += num;
		}
		
		//Calcular media
		double Media =  0;
		
		if (!Numeros.isEmpty()) {
			Media = (double) Soma / Numeros.size();
		}
		
		
		System.out.println("Lista de números: " + Numeros +
				"\nSoma: " + Soma +
				"\nMédia: " + Media);
	}
}