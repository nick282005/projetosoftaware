package entidades;

import servico.Aluga;

public class Carro extends Veiculos implements Aluga {

	//Encapsulamento
	//Atributos
	private boolean arCondicionado;
	
	//Construtor
		public Carro(String Marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(Marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
	}
		@Override
		public String toString() {
			return "Marca: " + getMarca() +
					"\nModelo: " + getModelo() +
					"\nAno: " + getAno() + 
					"\nValor Diaria: " + getValorDiario() +
					"\nAr Condicionado: " + arCondicionado;
		}
		@Override
		public double calcularAluguel(int dias) {
			double valorAluguel;
			
			if(arCondicionado) {
				valorAluguel = getValorDiario() * dias * 1.5;
			}
			else {
				valorAluguel = getValorDiario() * dias;
			}
			return valorAluguel;
		}
}
