package entidades;

public class Moto extends Veiculos {
	//Enapsulamento
	//Atributos
	
	private double Cilindradas;
	
	//Construtores
	public Moto(String marca, String modelo, int ano, double valorDiario, double Cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.Cilindradas = Cilindradas;
		
		// TODO Auto-generated constructor stub
	}
  
	//toString
		@Override
		public String toString() {
			return "Marca:" + getMarca() +
					"\nModelo:" + getModelo()+
					"\nAno:"+ getAno()+
					"\nvalor diaria:" + getValorDiario()+
					"\nCilindradas:" + Cilindradas;
			
	
		}
}