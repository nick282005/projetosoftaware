package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// Tipos Primitivos - int, double char
		// Objetos - String, Integer, Double 
		
		List <String> listaNomes = new ArrayList <>();
     
		//Adicionando itens na ultima posição no array
		
		listaNomes.add("Pedro");
		listaNomes.add("Nicks linda");
		listaNomes.add("Gigica linda");
		listaNomes.add("Jao bobo");
		
		//Adicionando itens em uma posição desejada no array
		listaNomes.add(2, "Jao bobão");
        
		//Verificando o tamanho do array 
		System.out.println(listaNomes.size());
		
		//Exibindo um valor especificado da lista
		System.out.println("Posição 1: " + listaNomes.get(1));
		
		//Removendo itens de acordo com a posição
		listaNomes.remove ("jao bobão");
		
		
		
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}
