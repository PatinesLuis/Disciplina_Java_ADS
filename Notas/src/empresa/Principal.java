package empresa;

public class Principal {

	public static void main(String[] args) {
		Nota luis = new Nota();
		luis.setNota1(9);
		luis.setNota2(10);
		luis.setFalta(3);
		luis.resultado();

		System.out.println("--------");
		
		luis.setNota1(2);	
		luis.setFalta(8);
		luis.resultado();
		
		System.out.println("----Outro Aluno----");
		
		Nota pedro = new Nota(4.6,9.9,3);
		pedro.resultado();
	}

}
