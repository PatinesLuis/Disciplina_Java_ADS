package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de nomes: ");
		int qtd = teclado.nextInt();
		
		for(int i=0;i<qtd;i++) {
			String nome = teclado.next();
			listaNomes.add(nome);
		}
		
		for(int i=listaNomes.size()-1; i>=0;i--) {
			System.out.println(listaNomes.get(i));
		}
		
		Collections.reverse(listaNomes);
		System.out.println("Funcao reversa" + listaNomes);
		
	}

}
