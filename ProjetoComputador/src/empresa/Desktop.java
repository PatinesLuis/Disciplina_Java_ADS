package empresa;

import java.util.Objects;

public class Desktop extends Computador {
	
	double acessorios;
	public Desktop(int gbMemoria, int numProcesadores, double acessorios) {
		super(gbMemoria, numProcesadores);
		this.acessorios = acessorios;
	}
	@Override
	double calculaValor() {
		double total = 200*gbMemoria + 400*numProcesadores + acessorios;
		return total;
	}
	@Override
	public String toString() {
		return "Desktop [acessorios=" + acessorios + ", gbMemoria=" + gbMemoria + ", numProcesadores=" + numProcesadores
				+ ", calculaValor()=" + calculaValor() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(acessorios);
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
		Desktop other = (Desktop) obj;
		return Double.doubleToLongBits(acessorios) == Double.doubleToLongBits(other.acessorios);
	}
	
	

}
