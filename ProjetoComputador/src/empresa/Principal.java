package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			int opcao;
			
			estoque est = new estoque();
			
			System.out.println("MENU");
			System.out.println("1- Adicionar");
			System.out.println("2- Remover");
			System.out.println("3- Listas");
			System.out.println("0- encerar");
			
			opcao=teclado.nextInt();
			int tipoComp,gb,processadores;
			double polegadas, acessorios;
			Computador comp;
			
			while(opcao !=0) {
				
				switch(opcao) {
					
				case 1:	
					 tipoComp=0;
					
					while(tipoComp >2 || tipoComp<=0) {
						System.out.println("1- desktop");
						System.out.println("2- Notebook");
						
						tipoComp = teclado.nextInt();
					}
					
					System.out.println("Quantos GB?");
					 gb = teclado.nextInt();
					
					System.out.println("Quantos Processadores?");
					 processadores = teclado.nextInt();
					
					
					 comp = null;
					if(tipoComp ==1) {
						System.out.println("Valor dos acessorios?");
						 acessorios = teclado.nextDouble();
						
						comp = new Desktop(gb,processadores,acessorios);
						
					}
					
					if(tipoComp ==2) {
						System.out.println("Quantas polegadas possui a tela");
						 polegadas = teclado.nextDouble();
						
						comp = new Notebook(gb,processadores,polegadas);
					}
					
					est.adicionar(comp);
					break;
				
				case 2:
					
					 tipoComp=0;
					
					while(tipoComp >2 || tipoComp<=0) {
						System.out.println("1- desktop");
						System.out.println("2- Notebook");
						
						tipoComp = teclado.nextInt();
					}
					
					System.out.println("Quantos GB?");
					 gb = teclado.nextInt();
					
					System.out.println("Quantos Processadores?");
					 processadores = teclado.nextInt();
					
					
					 comp = null;
					if(tipoComp ==1) {
						System.out.println("Valor dos acessorios?");
						 acessorios = teclado.nextDouble();
						
						comp = new Desktop(gb,processadores,acessorios);
						
					}
					
					if(tipoComp ==2) {
						System.out.println("Quantas polegadas possui a tela");
						 polegadas = teclado.nextDouble();
						
						comp = new Notebook(gb,processadores,polegadas);
					}
					
					est.remover(comp);
					
					break;
					
				case 3:
						est.listar();
					break;
					
					default:
						System.out.println("Opção invalida");
				
				}
				System.out.println("MENU");
				System.out.println("1- Adicionar");
				System.out.println("2- Remover");
				System.out.println("3- Listas");
				System.out.println("0- encerar");
				
				opcao=teclado.nextInt();
				
			}
			
		}
}
