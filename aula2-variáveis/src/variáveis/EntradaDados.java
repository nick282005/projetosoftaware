package variáveis;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.println("você digitou: " + nome);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("você digitou: " + idade);
		
		System.out.println("Digite sua Altura: ");
		double altura = sc.nextDouble();
		System.out.println("você digitou: " + altura);
		sc.close();
	}

}
