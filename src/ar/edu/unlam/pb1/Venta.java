package ar.edu.unlam.pb1;

public class Venta extends Operacion {

	public Venta(Cliente cliente, Propiedad prop) {
		super(cliente, prop);
	}

	@Override
	public void realizarOperacion() {
		this.prop.setDueno(cliente);
		this.prop.setTipo(TIPO_DE_OPERACION.VENTA);
		this.prop.setEstaDisponible(false);
	}



	


}


