package ar.edu.unlam.pb1;

public class Campo extends Propiedad {
	


	public Campo(String codigo, String calle, Integer numero, String ciudad, Double precio) {
		super(codigo, calle, numero, ciudad, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Campo [codigo=" + codigo + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad
				+ ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", tipo=" + tipo + "]";
	}
}
