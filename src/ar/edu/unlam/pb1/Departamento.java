package ar.edu.unlam.pb1;

public class Departamento extends Propiedad {
	
	private String piso;
	private String departamento;

	public Departamento(String codigo, String calle, Integer numero, String piso, String departamento,
			String ciudad, Double precio) {
		super(codigo, calle, numero, ciudad, precio);
		this.piso= piso;
		this.departamento=departamento;
		
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
