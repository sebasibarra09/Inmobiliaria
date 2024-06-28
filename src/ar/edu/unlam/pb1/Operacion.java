package ar.edu.unlam.pb1;

public abstract class Operacion {
	
	protected Cliente cliente;
	protected Propiedad prop;

	public Operacion(Cliente cliente, Propiedad prop) {
		this.cliente = cliente;
		this.prop = prop;
	}
	
	public abstract void realizarOperacion();



	public Propiedad getProp() {
		return prop;
	}

	public void setProp(Propiedad prop) {
		this.prop = prop;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
