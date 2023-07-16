package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario Funcionarios[] = {
				new Assalariado("Luis",3500), new Horista("luisgi",100,40.5f),
				new Comissionado("Pedro",5000,0.5f)
		};
		
		Funcionario f;
		
		float total = 0;
		for(int i=0; i<Funcionarios.length;i++) {
			f= Funcionarios[i];
			System.out.println(f.nome+ " salario: " + f.pagamento());
			total += f.pagamento();
			
		}
		
		System.out.println("Total: " +total);
	}

}
