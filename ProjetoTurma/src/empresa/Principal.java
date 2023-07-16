package empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a = new Aluno(100, "Luis", "0535666666");
		Aluno b = new Aluno(101, "Sabrina", "545345435464");
		
		a.info();
		b.info();
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(new Aluno(102, "lucas pira","534543534"));
	}

}
