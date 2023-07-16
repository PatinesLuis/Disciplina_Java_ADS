package Conversor;
import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

	public ArrayList<Moeda> getListaMoeda() {
		return listaMoeda;
	}

	public void setListaMoeda(ArrayList<Moeda> listaMoeda) {
		this.listaMoeda = listaMoeda;
	}
	
	public void adicionar(Moeda m) {
		listaMoeda.add(m);
	}
	
	public void remover(Moeda m) {
		listaMoeda.remove(m);
	}
	
	public void ListasMoedas() {
		for (Moeda m: listaMoeda) {
			System.out.println(m);
		}
	}
	
	public double totalConvertido() {
		
		double total = 0;
		for(Moeda m: listaMoeda) { //loop que percorre todo valor armazenado no construtor Moeda e somado 
			
			total += m.converter();
			
		}
		return total;
		
	}
	
	
}
