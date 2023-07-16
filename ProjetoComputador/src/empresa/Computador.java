package empresa;

import java.util.Objects;

public abstract class Computador {
	int gbMemoria;
	int numProcesadores;
	
	public Computador(int gbMemoria, int numProcesadores) {
		super();
		this.gbMemoria = gbMemoria;
		this.numProcesadores = numProcesadores;
	}

	abstract double calculaValor();

	@Override
	public int hashCode() {
		return Objects.hash(gbMemoria, numProcesadores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		return gbMemoria == other.gbMemoria && numProcesadores == other.numProcesadores;
	}
	
	
}
