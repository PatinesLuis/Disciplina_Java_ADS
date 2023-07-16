package empresa;

import java.util.Objects;

public class Notebook extends Computador{
		double polegadasTela;
	
	@Override
	double calculaValor() {
		double total = 250*gbMemoria + 500*numProcesadores + 100 * polegadasTela;
		return total;
	}

	public Notebook(int gbMemoria, int numProcesadores, double polegadasTela) {
		super(gbMemoria, numProcesadores);
		this.polegadasTela = polegadasTela;
	}

	@Override
	public String toString() {
		return "Notebook [polegadasTela=" + polegadasTela + ", gbMemoria=" + gbMemoria + ", numProcesadores="
				+ numProcesadores + ", Valor" + calculaValor() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(polegadasTela);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notebook other = (Notebook) obj;
		return Double.doubleToLongBits(polegadasTela) == Double.doubleToLongBits(other.polegadasTela);
	}
	
	

}
