package Exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		//1
		System.out.println("Digite a temperatura em Celsius: ");
		double Celsius = sc.nextDouble();
		System.out.println("você digitou: " + Celsius);
		
		double Fahrenheit = (Celsius * 9/5) + 32;
		
		double Kelvin = Celsius + 273.15;
		
		System.out.println("Celsius em Fahrenheit: " + Fahrenheit );
		System.out.println("Celsius em Kelvin: " + Kelvin);
		
		//2
			System.out.print("Digite o Capital Inicial: ");
			double C = sc.nextDouble();
			System.out.print("Digite o Taxa de Juros (Em Decimal): ");
			double I = sc.nextDouble();
			System.out.print("Digite o Tempo em Anos: ");
			double T = sc.nextDouble();
			
			double M = C * (1 + I)*T;
			
			System.out.println("Celsius Montante Final: " + M );
			
		//3
			System.out.print("Digite o Nota 1: ");
			double N1 = sc.nextDouble();
			System.out.print("Digite o Nota 2: ");
			double N2 = sc.nextDouble();
			System.out.print("Digite o Nota 3: ");
			double N3 = sc.nextDouble();
			
			double Media = (N1 + N2 + N3)/3;
			System.out.println("Média Final: " + Media );
			
		//4
			System.out.print("Digite o Capital Inicial: ");
			double C2 = sc.nextDouble();
			System.out.print("Digite o Taxa de Juros (Em Decimal): ");
			double I2 = sc.nextDouble();
			System.out.print("Digite o Tempo em Meses: ");
			double T2 = sc.nextDouble();
			
			double J = C2 * I2 * T2;
			System.out.println("Valor em Juros: " + J );
			
		//5
			double A = Math.sin(Math.PI/2);
			double P = 2 * Math.sin(Math.PI);
			System.out.println("Area: " + A );
			System.out.println("Perimetro: " + P );
		sc.close();
		
	}

}
