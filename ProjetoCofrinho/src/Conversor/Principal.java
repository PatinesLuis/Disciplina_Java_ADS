package Conversor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao, tipoMoeda; //opção para guiar-se no menu ao executar -- tipo de moeda escolhida no menu
		double valor;
		Moeda cMoeda = null;
		
		Cofrinho c = new Cofrinho();
		
		System.out.println("--Bem vindo ao COFRINHO--");
		System.out.println("1- Para adicionar Moedas");
		System.out.println("2- Para Remover Moedas");
		System.out.println("3- Para listar Moedas");
		System.out.println("4- Para calcular total convertido para Real");
		System.out.println("0 - encerre o programa!");
		System.out.println("");
		
		opcao = teclado.nextInt();
		
		while (opcao != 0) { //caso o usuario digite zero, o programa se encerra
			
			switch(opcao) { //escolher opções do menu
			case 1:
				tipoMoeda = 0;
				while(tipoMoeda >4 || tipoMoeda <=0) {
					System.out.println("1- Real:");
					System.out.println("2- Dolar");
					System.out.println("3- Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				if(tipoMoeda==1) {
					System.out.println("Digite o valor REAL:");
					valor = teclado.nextDouble();
					cMoeda = new Real(valor);
				}
				if(tipoMoeda==2) {
					System.out.println("Digite o valor DOLAR:");
					valor = teclado.nextDouble();
					cMoeda = new Dolar(valor);
				}
				if(tipoMoeda==3) {
					System.out.println("Digite o valor EURO:");
					valor = teclado.nextDouble();
					cMoeda = new Euro(valor);
				}
				
				c.adicionar(cMoeda);
				System.out.println("");
				System.out.println("Adicionado...");
				System.out.println("");
					
					
				break;
			
			case 2: // remover
				tipoMoeda = 0;
				
				System.out.println("--- LISTA DE MOEDAS QUE DESEJA REMOVER ---");
				c.ListasMoedas();
				System.out.println("-----");
				while(tipoMoeda >4 || tipoMoeda <=0) {
					System.out.println("Qual moeda deseja remover?");
					System.out.println("1- Real:");
					System.out.println("2- Dolar");
					System.out.println("3- Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				if(tipoMoeda==1) {
					System.out.println("Digite o valor REAL que seja remover:");
					valor = teclado.nextDouble();
					cMoeda = new Real(valor);
				}
				if(tipoMoeda==2) {
					System.out.println("Digite o valor DOLAR que seja remover:");
					valor = teclado.nextDouble();
					cMoeda = new Dolar(valor);
				}
				if(tipoMoeda==3) {
					System.out.println("Digite o valor EURO que seja remover:");
					valor = teclado.nextDouble();
					cMoeda = new Euro(valor);
				}
				
				c.remover(cMoeda);
				System.out.println("");
				System.out.println("removido...");
				System.out.println("");
				break;
				
			case 3: //listar
				c.ListasMoedas();
				System.out.println("");
				System.out.println("voltando...");
				System.out.println("");
				break;
				
			case 4: //remover
				
				System.out.println("O total convertido foi: " + c.totalConvertido());
				System.out.println("");
				
				break;
			
		}
	
			System.out.println("--Bem vindo ao COFRINHO--");
			System.out.println("1- Para adicionar Moedas");
			System.out.println("2- Para Remover Moedas");
			System.out.println("3- Para listar Moedas");
			System.out.println("4- Para calcular total convertido para Real");
			System.out.println("0 - encerre o programa!");
			System.out.println("");
			
			opcao = teclado.nextInt();
		
	}
	}
}
