package empresa;

public class Principal {

	public static void main(String[] args) {
		
		IngressoVip iv = new IngressoVip("Mega cena",200,100);
		
		iv.info();
		System.out.println(" ");
		Ingresso ic = new Ingresso("Rock in Rio", 320);
		ic.info();
	}

}
