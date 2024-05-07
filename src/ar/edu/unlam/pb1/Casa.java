package ar.edu.unlam.pb1;

public class Casa extends Propiedad implements Comparable<Casa> {

	
	public Casa(String codigo, String calle, Integer numero, String ciudad, Double precio) {
		super(codigo, calle, numero, ciudad, precio);
	}

	@Override
	public int compareTo(Casa otraCasa) {
		return Double.compare(this.precio, otraCasa.precio);
	}
	
	
}
