package empresa;

public class Principal {
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Mario", "3213123");
		Carro c = new Carro("Palio", "branco", 4);
		Quadrado q = new Quadrado(10);
		
		Imprimivel i = f;
		i.imprimir();
		i=c;
		i.imprimir();
		i=q;
		i.imprimir();
	}
}
