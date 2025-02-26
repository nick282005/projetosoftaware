package aula03EstruturasCondicionais;

import java.util.Scanner;

public class SistemaNotas {

	public static void main(String[] args) {
    // Calcule a media de um aluno e diga se ele foi:
	// - Aprovado - 7 a 10
	// - Recuperação - 5 a 6.9
		
	//       mediaFinal = (media+ notaExame) / 2
	//       - Aprovado -  7 a 10
    //       - Reprovado -  0 a 6.9
		     
    // - Reprovado - 0 a 4.9
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a primeira nota: ");
		Double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		Double nota2 = sc.nextDouble();
		
		
		double media = (nota1 + nota2) /2;
		
		System.out.println("A sua media foi de:" + media);
		
		
		if (media >=7 ) {
			System.out.println("Aprovado");
		}
		
		else if (media >=5) {
			System.out.println("Recuperação");
			
			System.out.print("Digite a nota do exame: ");
			Double notaExame =  sc.nextDouble();
		
	        		
			Double mediaFinal = (media+ notaExame) / 2 ;
		    System.out.println("Media Final: " + mediaFinal);
			
			if (mediaFinal >= 7) {
				System.out.println("Aprovado");
			}
			
			else  {
				System.out.println ("Reprovado");
			}
		}
		
		else {
			System.out.println("Reprovado");
		}
		sc.close();
		
		
		
		
		
	}

}
