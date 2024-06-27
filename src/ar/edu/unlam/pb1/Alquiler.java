package ar.edu.unlam.pb1;

public class Alquiler extends Operacion {

	private Cliente comprador;
	private Propiedad prop;

	public Alquiler(Cliente inquilino, Propiedad prop) {
		this.comprador = inquilino;
		this.prop = prop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comprador == null) ? 0 : comprador.hashCode());
		result = prime * result + ((prop == null) ? 0 : prop.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		if (comprador == null) {
			if (other.comprador != null)
				return false;
		} else if (!comprador.equals(other.comprador))
			return false;
		if (prop == null) {
			if (other.prop != null)
				return false;
		} else if (!prop.equals(other.prop))
			return false;
		return true;
	}
}
