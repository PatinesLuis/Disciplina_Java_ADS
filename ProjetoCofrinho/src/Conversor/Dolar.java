package Conversor;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Moeda Dolar: " + valor);
	}
	

	@Override
	public String toString() {
		return "Moeda DOLAR: " + valor;
	}

	@Override
	double converter() {
		double converter = 4.92;
		
		valor *= converter;
		
		return valor;
	}
	
	

}
