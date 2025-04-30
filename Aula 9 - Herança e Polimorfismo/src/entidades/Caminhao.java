package entidades;

import servico.Aluga;

public class Caminhao extends Veiculos implements Aluga{
	
		//Encapsulamento
		//Atributos
		private boolean arCondicionado;

	public Caminhao(String marca, String modelo, int ano, double valorDiario, boolean arCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
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