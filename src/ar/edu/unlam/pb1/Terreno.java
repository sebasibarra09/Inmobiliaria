package ar.edu.unlam.pb1;

public class Terreno extends Propiedad {


	public Terreno(String codigo, String calle, Integer numero, String ciudad, Double precio) {
		super(codigo, calle, numero, ciudad, precio);
	
	}

	@Override
	public String toString() {
		return "Terreno [codigo=" + codigo + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad
				+ ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", tipo=" + tipo + "]";
	}

}
