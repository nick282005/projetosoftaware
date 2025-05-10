package metodospoo;

public class Roupa {
	
	//Atributos
	public String Marca;
	public String Tipo;
	public String Tamanho;
	public int Quantidade;
	public double Valor;
	public double valorTotal;
	
	//Metodos
	public String exibeInfo() {
	 return "Marca: " + Marca +
			 "\nTipo: " + Tipo +
			 "\nTamanho: " + Tamanho +
			 "\nQuantidade: " + Quantidade +
			 "\nValor: " + Valor +
			 "\nValor Total: " + valorTotal;
	}

	public void incrementar(int Quantidade) {
		this.Quantidade += Quantidade;
	}
	public void decrementar(int Quantidade) {
		this.Quantidade -= Quantidade;
	}
	public double valorTotal() {
		double valorTotal = Quantidade * Valor;
		return valorTotal;
	}
}