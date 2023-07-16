package empresa;

public class Curso {
	
	String nome;
	double mensalidade;
	
	void info(){
		System.out.println("-- INFORMAÇÕES DO CURSO --");
		System.out.println("nome Curso" + nome);
		System.out.println("Mensalidade curso" + mensalidade);
	}

	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
}
