package repeticoes;

import java.util.Scanner;

public class loopWhite {

	public static void main(String[] args) {
		// Login e senha
		
		Scanner sc = new Scanner(System.in);
		String LoginSalvo = "admin";
		String SenhaSalva = "admin";
		String login = "";
		String senha = "";
		int tentativas = 1;
		int maxTentativas = 5;
		
		while (true) {
			
			System.out.print("Digite seu login: ");
			login = sc.nextLine();
			
			System.out.print("Digite sua Senha: ");
			senha = sc.nextLine();
			
			if (login.equals(LoginSalvo) && senha.equals(SenhaSalva)) {
				System.out.println("Acesso Liberado");
				
				break; 
			}
			else if (tentativas >= maxTentativas) {
				System.out.println("Númeri máximo de tentativas excedido, Acesso Negado");
				break;
			}
			else {
				tentativas++;
				System.out.println("Acesso Negado, Tente Novamente");
			}
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
