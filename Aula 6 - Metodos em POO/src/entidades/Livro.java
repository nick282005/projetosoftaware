package entidades;

public class Livro {
	
	//Atributos
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUnit;
	public double valorTotal;
	
	//Metodos
	public String exibeInfo() {
		
		return "Livro: " + livro +
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nValor Unitario: " + valorUnit +
				"\nValor Total: " + valorTotal;
		
	}
    
	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
		
	}
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
}
	public double valorTotal() {
		double valorTotal = quantidade * valorUnit;
		return valorTotal;
	}
}