package Exemplo;

public class principal {

	private static final Carro Civic = null;

	public static void main(String[] args) {

		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.motor = 2.0;
		civic.placa = "EIC-2490";
		civic.cor = "Preta";
		civic.ano = 2024;
		civic.velocidade = 0;
		civic.acelera(10);
		civic.acelera(20);
        civic.exibirInfo();
		
		Carro corolla = new Carro();
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.motor = 1.4;
		corolla.placa = "EIT-2490";
		corolla.cor = "Branco";
		corolla.ano = 2023;
		corolla.velocidade = 0;
		corolla.freio(20);
		corolla.exibirInfo();
		
		Carro fusca = new Carro();
		fusca.fabricante = "Volkswagen";
		fusca.modelo = "Corolla";
		fusca.motor = 1.0;
		fusca.placa = "GNE-2819";
		fusca.cor = "Rosa";
		fusca.ano = 2005;
		fusca.velocidade = 1;
		fusca.exibirInfo();
	}

}
