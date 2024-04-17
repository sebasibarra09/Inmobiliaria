package ar.edu.unlam.pb1;

public class Departamento {
	
	private String codigo;
	private String calle;
	private Integer numero;
	private String ciudad;
	private Double precio;
	private Boolean estaDisponible;
	private TIPO_DE_OPERACION tipo;
	private String piso;
	private String departamento;

	
	public Departamento(String codigo, String calle, Integer numero, String piso,String departamento, 
			String ciudad, Double precio) {
		this.codigo = codigo;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.precio = precio;
		this.estaDisponible= true;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
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


	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad
				+ ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", tipo=" + tipo + "]";
	}


	public String getPiso() {
		return piso;
	}


	public void setPiso(String piso) {
		this.piso = piso;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
