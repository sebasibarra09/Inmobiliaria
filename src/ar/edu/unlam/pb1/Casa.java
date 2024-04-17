package ar.edu.unlam.pb1;

public class Casa implements Comparable<Casa> {

	private String codigo;
	private String calle;
	private Integer numero;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private TIPO_DE_OPERACION tipo;
	
	
	public Casa(String calle, Integer numero, String ciudad, Double precio, Boolean estaDisponible,
			TIPO_DE_OPERACION tipo) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.tipo = tipo;
	}
	
	public Casa(String codigo, String calle, Integer numero, String ciudad, Double precio) {
		this.codigo = codigo;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible= true;
	}
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getEstaDisponible() {
		return estaDisponible;
	}
	public void setEstaDisponible(Boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}
	public TIPO_DE_OPERACION getTipo() {
		return tipo;
	}
	public void setTipo(TIPO_DE_OPERACION tipo) {
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Casa [codigo=" + codigo + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", precio="
				+ precio + ", estaDisponible=" + estaDisponible + ", tipo=" + tipo + "]";
	}

	@Override
	public int compareTo(Casa otraCasa) {
		return Double.compare(this.precio, otraCasa.precio);
	}
	
	
}
