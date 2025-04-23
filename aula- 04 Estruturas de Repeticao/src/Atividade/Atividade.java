package Atividade;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
	// Jogo de adivinhacao
		
	Scanner sc = new Scanner (System.in);
	//1 Adivinhe o Número 
	/*int maquina = (int) (Math.random() *10);
	int usuario;
	
	
	do {
		System.out.print("Informe um número: ");
		usuario = sc.nextInt();
		
		if (usuario > maquina) {
			System.out.println ("Valor Maquina: " + maquina);
			System.out.println ("Deu Bom");
			
			break;
		}
		else if (usuario < maquina) {
			System.out.println ("Tente Novamente: ");
		}
		
	} while(usuario != maquina);
	
	System.out.println("Parabéns, você venceu");
	
	//2 Conversor de Moedas
		//Conversor
		//		1 - Dolar (R$1 = US$0.20)
		//		2 - Euro (R$1 = € 0.18)
		//		3 - Libra (R$1 = £ 0.15)
	
		System.out.print("Valor a converter: ");
		double Converter = sc.nextDouble();
	
		System.out.println("Conversor");
		System.out.println("1 - Dolar (R$1 = US$0.20)");
		System.out.println("2 - Euro (R$1 = € 0.18)");
		System.out.println("3 - Libra (R$1 = £ 0.15)");
		int conversor = sc.nextInt();
		
		switch (conversor) {
		
			case 1:
				double Dolar = Converter * 0.20;
				System.out.println("O valor fica em: " + Dolar);
				break;
				
			case 2:
				double Euro = Converter * 0.18;
				System.out.println("O Valor fica em: " + Euro);
				break;
				
			case 3:
				double Libra = Converter * 0.15;
				System.out.println("O valor fica em: " + Libra);
				break;
		} 
	
	//3
		//Cálculo de Taxa de Empréstimo
			//		1 - 6 Meses: +5% de Juros
			//		2 - 12 Meses: +10% de Juros
			//		3 - 24 Meses: +20% de Juros
		
			System.out.println("Calculador de Juros");
			
			System.out.print("Valor do emprestimo: ");
			double Converter = sc.nextDouble();
		
			System.out.println("Calcular");
			System.out.println("1 - 6 Meses: +5% de Juros");
			System.out.println("2 - 12 Meses: +10% de Juros");
			System.out.println("3 - 24 Meses: +20% de Juros");
			int calcular = sc.nextInt();
			
			switch (calcular) {
			
				case 1:
					double Meses = Converter * 1.05;
					System.out.println("O valor fica em: " + Meses);
					break;
					
				case 2:
					 Meses = Converter * 1.10;
					System.out.println("O Valor fica em: " + Meses);
					break;
					
				case 3:
					 Meses = Converter * 1.20;
					System.out.println("O valor fica em: " + Meses);
					break;
			}*/
	
	//4
		//Média de Números com DO-WHILE
	/*	int soma = 0, contador = 0, numero;
		
		
	        do {
	            System.out.print("Digite um número (0 para sair): ");
	            numero = sc.nextInt();
	            
	            if (numero != 0) {
	                soma += numero;
	                contador++;
	            }
	        } while (numero != 0);
	        
	        
	        if (contador > 0) {
	            double media = (double) soma / contador;
	            System.out.println("A média dos números digitados é: " + media);
	        } else {
	            System.out.println("Nenhum número foi digitado.");
	        } */
	
	//5
		//Número Par ou Ímpar com WHILE
	/*	int somaPares = 0, somaImpares = 0, numero;
	    
	    System.out.println("Digite números (0 para sair):");
	    numero = sc.nextInt();
	    
	    while (numero != 0) {
	        if (numero % 2 == 0) {
	            somaPares += numero;
	            System.out.println(numero + " é par.");
	        } else {
	            somaImpares += numero;
	            System.out.println(numero + " é ímpar.");
	        }
	        numero = sc.nextInt();
	    }
	    
	    
	    System.out.println("Soma dos números pares: " + somaPares);
	    System.out.println("Soma dos números ímpares: " + somaImpares);*/

//6
		//Fatorial de um Número
		System.out.print("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
    
	    if (numero < 0) {
	        System.out.println("Número inválido! Digite um inteiro positivo.");
	    } else {
	        long fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        System.out.println("O fatorial de " + numero + " é: " + fatorial);
		    

		

	
	
	sc.close();
	
	  }

	}
}