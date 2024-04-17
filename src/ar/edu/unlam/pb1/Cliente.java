package ar.edu.unlam.pb1;

public class Cliente {

	private Integer dni;
	private String nombre;
	private String apellido;
	private String mail;
	private String celular;

	public Cliente (Integer dni, String nombre, String apellido, String mail, String celular) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.mail=mail;
		this.celular=celular;
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", celular="
				+ celular + "]";
	}
}
