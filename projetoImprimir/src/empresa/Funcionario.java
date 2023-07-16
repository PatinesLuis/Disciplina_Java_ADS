package empresa;

public class Funcionario implements Imprimivel{
	String nome, cpf;

	@Override
	public void imprimir() {
		System.out.println("Funcionario");
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + cpf);
		System.out.println("------------");
	}

	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
}
