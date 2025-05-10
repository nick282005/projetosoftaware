package tratamentoexcesoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
//		try {
//		System.out.println("Digite um numero: ");
//		int numero = sc.nextInt();
//		
//		
//		
//		System.out.println("O numero digitado for: " + numero);
//			
//		} catch (InputMismatchException e) {
//			System.out.println("Valor invalido, infore um numero: ");
//		}
		try {
			int[] arr = new int [5];
			System.out.println(arr[9]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O erro encontrado foi: " + e.getMessage());
		}
		
		
		try {
		int resultado = 10/0;
				System.out.println(resultado);
		}catch(ArithmeticException e) {
			System.out.println("O erro encontrado foi: " + e.getMessage());
		}
		try {
			
		String numero = "abc";
		int num = Integer.parseInt(numero);
		System.out.println(num);
		}catch (NumberFormatException e) {
			System.out.println("O erro encontrado foi: " + e.getMessage());
		}
		
		try {
			System.out.println("Informe um numero:");
			int n1 = sc.nextInt();
			System.out.println("Informe um numero:");
			int n2 = sc.nextInt();
			
			double resultado = n1/n2;
			System.out.println(resultado);
		}catch(ArithmeticException e) {
			System.out.println("Não é possivel dividir um número por zero");
		}catch(InputMismatchException e) {
			System.out.println("Informe um valor do tipo number");
			try {
				System.out.println("Informe um numero:");
				int n1 = sc.nextInt();
				System.out.println("Informe um numero:");
				int n2 = sc.nextInt();
				
				double resultado = n1/n2;
				System.out.println(resultado);
				}catch(Exception e1) {
		System.out.println("O Erro encontrado foi: " + e1.getMessage());
		}
		
		
		sc.close();
		}
	}
	}


