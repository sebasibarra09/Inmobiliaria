package ar.edu.unlam.pb1;

public class Permuta extends Operacion {

	private Cliente dueno1;
	private Propiedad prop1;
	private Cliente dueno2;
	private Propiedad prop2;

	public Permuta(Cliente dueno1 ,Propiedad prop1 , Cliente dueno2, Propiedad prop2) {
		this.dueno1 = dueno1;
		this.prop1 = prop1;
		this.dueno2 = dueno2;
		this.prop2 = prop2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dueno1 == null) ? 0 : dueno1.hashCode());
		result = prime * result + ((dueno2 == null) ? 0 : dueno2.hashCode());
		result = prime * result + ((prop1 == null) ? 0 : prop1.hashCode());
		result = prime * result + ((prop2 == null) ? 0 : prop2.hashCode());
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
		Permuta other = (Permuta) obj;
		if (dueno1 == null) {
			if (other.dueno1 != null)
				return false;
		} else if (!dueno1.equals(other.dueno1))
			return false;
		if (dueno2 == null) {
			if (other.dueno2 != null)
				return false;
		} else if (!dueno2.equals(other.dueno2))
			return false;
		if (prop1 == null) {
			if (other.prop1 != null)
				return false;
		} else if (!prop1.equals(other.prop1))
			return false;
		if (prop2 == null) {
			if (other.prop2 != null)
				return false;
		} else if (!prop2.equals(other.prop2))
			return false;
		return true;
	}
	
}
