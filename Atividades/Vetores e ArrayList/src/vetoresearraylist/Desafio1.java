package vetoresearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		//Tipos Primitivos - int, double, char
		//Objetos - String, Integer, Double
			
		List <String> Nomes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		//Adicionando itens na ultima posição do array
		Nomes.add("Pedro");
		Nomes.add("Geovanna");
		Nomes.add("Luiz");
		Nomes.add("Kauan");
		Nomes.add("Ana");
        Nomes.add("Carlos");
        Nomes.add("Alice");
        Nomes.add("Bruno");
        Nomes.add("Amanda");
        Nomes.add("Beatriz");

		//Pergunta para o usuario a letra para ser filtrada
        System.out.println("Digite a inicial que deseja filtrar: ");
        String Inicial = sc.nextLine().toUpperCase();
        
        //Filtro
        List<String> nomesFiltrados = new ArrayList<>();
        for (String Nome : Nomes) {
        	if(Nome.toUpperCase().startsWith(Inicial)) {
        		nomesFiltrados.add(Nome);
        	}
        }

        
        System.out.println("\nNomes encontrados que começam com \"" + Inicial + "\": " + nomesFiltrados);
        System.out.println("Total de nomes: " + nomesFiltrados.size());
        
        sc.close();
	}

}
