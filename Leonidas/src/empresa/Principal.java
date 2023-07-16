package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int resposta = teclado.nextInt();
		int valorCorreto = 1000;
		
		while(resposta != valorCorreto) {
			
			if(resposta > valorCorreto) {
				System.out.println("Um pouco menos...");
			}else {
				System.out.println("Um pouco mais...");
			}
			System.out.println("Digite outro palpite");
			resposta = teclado.nextInt();
		}
		
		System.out.println("Espartanos, somos 300 contra 10 mil PERSAS!!!!!");
		
		

	}

}
