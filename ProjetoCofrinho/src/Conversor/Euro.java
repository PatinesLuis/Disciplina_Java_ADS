package Conversor;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Moeda euro: " + valor);
	}
	
	public double converter() {
		double converter = 5.36;
		
		converter *= valor;
		
		return converter;
	}

	@Override
	public String toString() {
		return "Moeda EURO" + valor;
	}
	
	

}
