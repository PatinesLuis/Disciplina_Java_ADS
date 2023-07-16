package Conversor;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}
	
	
	
	public void info() {
		System.out.println("Moeda Real: " + valor);
	}
	
	public double converter() {
		double converter = 1;
		
		converter *= valor;
		
		return converter;
	}



	@Override
	public String toString() {
		return "Moeda REAL: " + valor;
	}
	
	
	
}
