package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int idade = 10;
		double peso = 76.5;
		String nome;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite sua idade e após seu nome");
		idade = teclado.nextInt();
		nome = teclado.next();
//		sysout atalho
		System.out.println("Sua idade é " + idade);
		System.out.println("meu peso é " + peso);
		System.out.println("seu nome é " + nome);
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		}
		else if(idade >60){
			System.out.println("idoso");
		}else {
			System.out.println("adulto");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("valor: " +i);
		}
		
//		array lista
		
		int megaSena[] = {11,22,34,1,54,5,32};
		int numeros[] = new int [200]; //vazio
		
		numeros[60] =50;
		megaSena[0] = 10;
		
	}

}
