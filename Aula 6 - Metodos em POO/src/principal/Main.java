package principal;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro culpaDasEstrelas = new Livro();
		Scanner sc= new Scanner (System.in);
		
		culpaDasEstrelas.livro = "A Culpa é das Estrelas";
		culpaDasEstrelas.autor = "John Green";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUnit = 80;
		culpaDasEstrelas.emprestaLivro(5);
		culpaDasEstrelas.devolveLivro(5);
		
		System.out.println("Informe a quantiade de livros eprestados");
		int quantidade = sc.nextInt();
		culpaDasEstrelas.emprestaLivro(quantidade);
		
		System.out.println("Informe a quantiade de livros devolvidos");
		quantidade = sc.nextInt();
		culpaDasEstrelas.devolveLivro(quantidade);
		
		
		System.out.println(culpaDasEstrelas.exibeInfo());
		
		
		/* Livro BibliotecaDaMeiaNoite = new Livro ();
		
		BibliotecaDaMeiaNoite.livro = "Biblioteca da Meia Noite";
		BibliotecaDaMeiaNoite.autor = "Matt Haig";
		BibliotecaDaMeiaNoite.quantidade = 250;
		BibliotecaDaMeiaNoite.valorUnit = 45;
		
		System.out.println(BibliotecaDaMeiaNoite.exibeInfo()); */
		sc.close();
	}

}
