package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
 main
		Carro civic = new Carro("Honda", "Civic", 2024, 250, true);
		System.out.println(civic.toString());
		System.out.println("O valor do aluguel desse carro foi de R$ " + civic.calcularAluguel(5));
		System.out.println();
		
		Moto xj = new Moto("Yamaha", "XJ6", 2025, 125, 600);
		System.out.println(xj.toString());
		System.out.println("O valor do aluguel dessa moto foi de R$ " + xj.calcularAluguel(5));
	}

=======
		Carro Civic = new Carro("Honda", "Civic", 2024, 200, true);
		System.out.println(Civic.toString());
		
		Moto xj = new Moto("Yamaha", "XJ6", 2025, 125, 600);
		System.out.println(xj.toString());

	}
>>>>>> main

}
