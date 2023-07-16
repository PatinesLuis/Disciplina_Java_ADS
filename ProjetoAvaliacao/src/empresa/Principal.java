package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno ("Luis","Programador", new Avaliacao(9,10,3));
		Aluno a2 = new Aluno ("Pedro","Desingner", new Avaliacao(2,8,4));	
		
		a1.info();
		a2.info();
		
	}
	
}
