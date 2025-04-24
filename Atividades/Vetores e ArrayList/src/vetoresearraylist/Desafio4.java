package vetoresearraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <String> Palavras = new ArrayList<>();
		
		Palavras.add("Banana");
		Palavras.add("Maçã");
		Palavras.add("Abacate");
		Palavras.add("Manga");

		
		System.out.println("Palavras originais: " + Palavras);
		
		System.out.print("Insira a letra para remover a palavra com a letra: ");
		String Letra = sc.nextLine().toLowerCase();
		
		Iterator<String> iterator = Palavras.iterator();
		while (iterator.hasNext()) {
			String Palavra = iterator.next();
			if (Palavra.toLowerCase().contains(Letra)) {
				iterator.remove();
			}
		}
		
		System.out.println("Palavras apos remoção das que contêm: \"" + Letra + "\": " + Palavras );
		
		sc.close();
	}
}
