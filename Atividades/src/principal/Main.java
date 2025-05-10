package principal;

import java.util.Scanner;

import metodospoo.Roupa;

public class Main {

	public static void main(String[] args) {
		
		Roupa Nova = new Roupa();
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Insira a marca da roupa:");
		Nova.Marca = sc.next();
		System.out.print("Insira o Tipo da roupa:");
		Nova.Tipo = sc.next();
		System.out.print("Insira o Tamanho da roupa:");
		Nova.Tamanho = sc.next();
		System.out.print("Insira a Quantidade de roupas:");
		Nova.Quantidade = sc.nextInt();
		System.out.print("Insira o valor das roupas:");
		Nova.Valor = sc.nextDouble();
		
		System.out.println("Informa a quantidade de roupas que serão adicionadas: ");
		int Quantidade = sc.nextInt();
		Nova.incrementar(Quantidade);
		
		System.out.println("Informa a quantidade de roupas que serão retirar: ");
		 Quantidade = sc.nextInt();
		Nova.decrementar(Quantidade);
		
		System.out.println(Nova.exibeInfo());
		sc.close();
	

	}

}
