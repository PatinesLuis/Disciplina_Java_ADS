package empresa;

public class Aluno {

String nome, curso;
Avaliacao notas;
	
	public Aluno (String nome, String curso, Avaliacao avaliacao) {
		this.nome = nome;
		this.curso = curso;
		this.notas = avaliacao;
	}
	
	
	void info() {
		System.out.println("Nome aluno: " + nome);
		System.out.println("Nome curso: " + curso);
		System.out.println("media A: " + notas.mediaAritmetica());
		System.out.println("media p: " + notas.mediaPonderada());
		System.out.println("---------------------");
	}
}
