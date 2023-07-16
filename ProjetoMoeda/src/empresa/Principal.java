package empresa;

public class Principal {

	public static void main(String[] args) {

		Cofrinho c = new Cofrinho();
		
		c.add(new Moeda(0.5,"Euro"));
		c.add(new Moeda(0.1,"Euro"));
		c.add(new Moeda(1,"Euro"));
		c.add(new Moeda(0.05,"Euro"));
		
		System.out.printf("O total no confrinho é: %.2f \n", c.calcularTotal());
		
		
	}
}
