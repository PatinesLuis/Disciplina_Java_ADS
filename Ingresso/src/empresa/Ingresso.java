package empresa;

public class Ingresso {
	
	String nomeEvento;
	double valor;
	
	
	
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}



	public void info (){
		System.out.println("NOME EVENTO: " + nomeEvento);	
		System.out.println("Valor Ingresso: " + valor);	
	}
}
