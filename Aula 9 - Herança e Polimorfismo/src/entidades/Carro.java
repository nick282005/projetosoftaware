package entidades;

public class Carro extends Veiculos{
	//Encpsulmento
	//Atributos
	private boolean arCondicionado;
	
	//Construtor
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean arCondcionado) {
		super(marca, modelo, ano, valorDiario);
		this.arCondicionado = arCondicionado;
	
		
	}
  
	//toString
	@Override
	public String toString() {
		return "Marca:" + getMarca() +
				"\nModelo:" + getModelo()+
				"\nAno:"+ getAno()+
				"\nvalor diaria:" + getValorDiario()+
				"\nCilindradas:" + arCondicionado;
		
				
	}
	
	
}
