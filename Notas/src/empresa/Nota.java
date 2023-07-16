package empresa;

public class Nota {
	
	private double nota1, nota2;
	private int falta;
	
	public Nota() {
		
	}
	
	public Nota(double nota1, double nota2, int falta) {
		super();
		setNota1(nota1);
		setNota2(nota2);
		setFalta(falta);
	}
	
	void resultado() {
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("Media: " +media);
		if(falta >7) {
			System.out.println("Reprovado por falta");
		}
		
		else if(media <4) {
			System.out.println("REPROVADO por notas");
		}else if(media <7) {
			System.out.println("Exame final");
		}else {
			System.out.println("Aprovado!!!!!");
		}
	}
	

	public void setNota1(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota invalida");
			return;
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		if(nota<0 || nota>10) {
			System.out.println("Nota invalida");
			return;
		}
			nota2 = nota;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		if(falta <0 || falta>40) {
			return;
		}
		this.falta = falta;
	}
}
