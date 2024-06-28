package ar.edu.unlam.pb1;

public class Alquiler extends Operacion {

	public Alquiler(Cliente cliente, Propiedad prop) {
		super(cliente, prop);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void realizarOperacion() {
		this.prop.setInquilino(cliente);
		this.prop.setTipo(TIPO_DE_OPERACION.ALQUILER);
		this.prop.setEstaDisponible(false);
		
	}
}
