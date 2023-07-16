package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(111,"Luis",2000,500);
		
		c1.infos();
		
		if(!c1.sacar(400)) {
			System.out.println("problema ao sacar!");
		}
		if(c1.depositar(10)) {
			System.out.println("Problema ao depositar");
		}
		
		System.out.println(" ");
		c1.infos();
		

	}

}
