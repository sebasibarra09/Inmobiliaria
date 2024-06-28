package ar.edu.unlam.pb1;

public class Permuta extends Operacion {

	private Cliente cliente2;
	private Propiedad prop2;
	
	public Permuta(Cliente cliente, Propiedad prop, Cliente cliente2, Propiedad prop2) {
		super(cliente, prop);
		this.cliente2 = cliente2;
		this.prop2 = prop2;
		
	}

	@Override
	public void realizarOperacion() {
		this.prop.setDueno(cliente2);
		this.prop.setTipo(TIPO_DE_OPERACION.PERMUTA);
		this.prop2.setDueno(cliente);
		this.prop2.setTipo(TIPO_DE_OPERACION.PERMUTA);
		
	}

	public Cliente getCliente2() {
		return cliente2;
	}

	public void setCliente2(Cliente cliente2) {
		this.cliente2 = cliente2;
	}

	public Propiedad getProp2() {
		return prop2;
	}




	public void setProp2(Propiedad prop2) {
		this.prop2 = prop2;
	}
	
}
