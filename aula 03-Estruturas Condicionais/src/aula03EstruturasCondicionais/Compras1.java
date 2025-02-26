package aula03EstruturasCondicionais;

import java.util.Scanner;

public class Compras1 {

	public static void main(String[] args) {
		// Switch Case
		// Maquina dde Cartão
		
		//Metodo de pagamento
		//     1 - Dinheiro/Pix - 10% de desconto
		//     2-  Débito - 5% de desconto
	    //     3-  Crédito - Valor Total
		
		// Valor da Compra
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Valor da Compra: ");
		double ValorCompra = sc.nextDouble();
		
		System.out.println("Metodos Pagamento");
		System.out.println("1- Dinheiro/Pix");
		System.out.println("2- Débito");
		System.out.println("3- Crédito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
		
		  case 1:
			  double ValorFinal = ValorCompra* 0.9;
			System.out.println("Sua compra ficou R$" + ValorFinal);
			break;
			
		  case 2:
			   ValorFinal = ValorCompra *0.5;
			   System.out.println("Sua compra ficou R$" + ValorFinal);
				break;
		  case 3:
			  System.out.println("Metodo Parcelamento: ");
			  System.out.println("1 - A vista");
			  System.out.println("2 - 2x, 5% de Juros");
			  System.out.println("3 - 3x, 10% de Juro");
			  int metodoParcelamento = sc.nextInt();
			  
			  switch (metodoParcelamento) {
			  case 1:
				  System.out.println("Sua compra ficou R$" + ValorCompra);
				  break;
			  case 2:
				  ValorFinal = ValorCompra * 1.05;
				  System.out.println("Sua compra ficou R$" + ValorFinal);
				  break;
			  case 3:
				  ValorFinal = ValorCompra * 1.10;
				  System.out.println("Sua compra ficou R$" + ValorFinal);
				  break;
			default:
				System.out.println("Opção Inválida ");
				break;
			  }
			  break;
			  
			default:
				System.out.println("Opção Inválida ");
				break;
		}
		
		sc.close();


	}
	

}
