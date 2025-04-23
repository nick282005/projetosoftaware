package entidades;

 main
import servico.Aluga;

public class Moto extends Veiculos implements Aluga {
	
	//Encapsulamento
	//Atributos
=======
public class Moto extends Veiculos {
	//Enapsulamento
	//Atributos
	
 main
	private double Cilindradas;
	
	//Construtores
	public Moto(String marca, String modelo, int ano, double valorDiario, double Cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.Cilindradas = Cilindradas;
 main
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAno() + 
				"\nValor Diaria: " + getValorDiario() +
				"\nCilindradas: " + Cilindradas;
	}

	@Override
	public double calcularAluguel(int dias) {
		double valorAluguel = getValorDiario() * dias;
		return valorAluguel;
	}

}
=======
		
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
 main
