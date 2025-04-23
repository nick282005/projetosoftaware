package principal;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro Civic = new Carro("Honda", "Civic", 2024, 200, true);
		System.out.println(Civic.toString());
		
		Moto xj = new Moto("Yamaha", "XJ6", 2025, 125, 600);
		System.out.println(xj.toString());

	}

}
