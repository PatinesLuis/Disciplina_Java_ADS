package empresa;

public class Conta {
	int numero;
	String titular;
	double saldo, limite;
	
	
	public Conta(int numero, String titular, float saldo, float limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	void infos() {
		System.out.println("| Numero da conta: " + numero + " |");
		System.out.println("|Titular da conta: " + titular + " |");
		System.out.println("| Numero da saldo: " + saldo + " |");
		System.out.println("| saldo de limite: " + limite + " |");
	}
	
	 boolean sacar(double valor) {
		 if(valor > limite || valor > saldo) {
			 return false;
		 }
		saldo -=valor;
		return true;
	 }
	 
	 boolean depositar(double valor) {
		 if(valor <=0) {
			 return false;
		 }
		 saldo += valor;
		 return true;
	 }

}



