package JogoDoWhile;

import java.util.Scanner;

public class JogoDoWhile {

	public static void main(String[] args) {
	// Jogo de adivinhacao
		
	Scanner sc = new Scanner (System.in);
	
	int maquina = (int) (Math.random() *10);
	int usuario;
	
	
	do {
		System.out.print("Informe um número: ");
		usuario = sc.nextInt();
		
		if (usuario > maquina) {
			System.out.println ("Valor Maquina: " + maquina);
			System.out.println ("Deu Bom");
			
			break;
		}
		else if (usuario < maquina) {
			System.out.println ("Tente Novamente: ");
		}
		
	} while(usuario != maquina);
	
	System.out.println("Parabéns, você venceu");
	
	
	sc.close();
	
	}

}
