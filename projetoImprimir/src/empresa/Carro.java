package empresa;

public class Carro implements Imprimivel{
	String marca, cor;
	int portas;
	
	public Carro(String marca, String cor, int portas) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
	}

	@Override
	public void imprimir() {
		System.out.println("carro");
		System.out.println("Marca: " +marca);
		System.out.println("cor: " +cor);
		System.out.println("Portas" + portas);
		System.out.println("------------");
		
		
	}
}
