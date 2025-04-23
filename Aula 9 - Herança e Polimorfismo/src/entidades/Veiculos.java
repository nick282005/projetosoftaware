package entidades;

public class Veiculos {
 main
	
	//Atributos
=======
//Atributos
 main
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiario;
	
 main
	
=======
 main
	//Construtores
	public Veiculos(String marca, String modelo, int ano, double valorDiario) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiario = valorDiario;
	}
 main

	//Getters e Setters
=======
	
	//Gatters e Setters

>>>>>> main
	public String getMarca() {
		return marca;
	}

 main

=======
>>>>>> main
	public void setMarca(String marca) {
		this.marca = marca;
	}

 main

=======
>>>>>> main
	public String getModelo() {
		return modelo;
	}

 main

=======
>>>>>> main
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

 main

=======
>>>>>> main
	public int getAno() {
		return ano;
	}

 main

=======
>>>>>> main
	public void setAno(int ano) {
		this.ano = ano;
	}

 main

=======
 main
	public double getValorDiario() {
		return valorDiario;
	}

 main

	public void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
		
		//toString
		@Override
		public String toString() {
			return "Marca: " + marca +
					"\nModelo: " + modelo +
					"\nAno: " + ano +
					"\nvalorDiario: " + valorDiario;
		
	}
	
	

=======
	public void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	
	//toString
	@Override
	public String toString() {
		return "Marca:"  + marca + 
				"/nModelo: " + modelo +
				"nAno: " + ano +
				"/nvalorDiario: " + valorDiario;
				
	}
	
	
	
	
 main
}
