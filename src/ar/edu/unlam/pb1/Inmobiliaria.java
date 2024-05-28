package ar.edu.unlam.pb1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.BooleanSupplier;

public class Inmobiliaria {
	
	private String nombre;
	private String direccion;
	private String eMail;
	private String telefono;
	private HashSet<Propiedad> propiedades;
	private HashSet<Cliente> clientes;
	
	
	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.propiedades= new HashSet<>();
		this.clientes= new HashSet<>();
	}
	
	public Boolean add(Propiedad nueva) {
		nueva.setTipo(TIPO_DE_OPERACION.ADQUIRIDO);
		return propiedades.add(nueva);
	}
	

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}

	public HashSet<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(HashSet<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	public Boolean addCliente(Cliente nuevo) {
		return clientes.add(nuevo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Propiedad buscar(Propiedad buscada) {
		for (Propiedad prop : propiedades) {
			if (prop.equals(buscada)) {
				return prop;
			}
		}
		return null;
	}

	public List<Propiedad> buscarPropiedadesPorVenta() {
		ArrayList<Propiedad> propiedadesVendidas = new ArrayList<>();
		for (Propiedad propiedad : propiedades) {
			if (propiedad.getTipo().equals(TIPO_DE_OPERACION.VENTA)) {
				propiedadesVendidas.add(propiedad);
			}
		}
		return propiedadesVendidas;
	}
	
	public ArrayList<Propiedad> buscarCasasPorRangoDeprecio(Double precioMinimo, Double precioMaximo){
		ArrayList<Propiedad> resultado = new ArrayList<Propiedad>();
		for (Propiedad actual : propiedades) {
			if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo) {
				resultado.add(actual);
			}
		}
		return resultado;
	}
	
	
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorPrecio() {
		ArrayList<Propiedad> propiedadesOrdenadas = new ArrayList<>();
		propiedadesOrdenadas.addAll(propiedades);
		for (int j = 0; j < propiedades.size()-1; j++) {
			for (int i = 0; i < propiedades.size()-1; i++) {
				if (propiedadesOrdenadas.get(i+1)!= null && propiedadesOrdenadas.get(i)!=null) {
					if (propiedadesOrdenadas.get(i+1).getPrecio() < propiedadesOrdenadas.get(i).getPrecio()) {
						Propiedad listado = propiedadesOrdenadas.get(i);
						propiedadesOrdenadas.set(i, propiedadesOrdenadas.get(i+1));
						propiedadesOrdenadas.set(i+1, listado);
					}
				}
				
			}
			
		}
		
		return propiedadesOrdenadas;
		
	}
	
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorUbicacion() {
		List<Propiedad> propiedadesOrdenadasPorUbicacion = new ArrayList<>(propiedades);
	   propiedadesOrdenadasPorUbicacion.sort(Comparator.comparing(propiedad -> propiedad.getCiudad()));
	   return propiedadesOrdenadasPorUbicacion;
    }
	
	
	public Boolean venderPropiedad(Propiedad vendida, Cliente comprador) {
		if (vendida.getEstaDisponible()) {
			Propiedad resultado = buscar(vendida);
			resultado.setDueno(comprador);
			resultado.setTipo(TIPO_DE_OPERACION.VENTA);
			resultado.setEstaDisponible(false);
			return true;
		}
		return false;
	}
		
	
	public Boolean alquilaPropiedad(Propiedad alquilada, Cliente clien) {
		if (alquilada.getEstaDisponible()) {
			Propiedad resultado = buscar(alquilada);
			resultado.setInquilino(clien);
			resultado.setTipo(TIPO_DE_OPERACION.ALQUILER);
			resultado.setEstaDisponible(false);
			return true;
		}
		return false;
	}

	public Double obtenerValorPromedioDeLasCasas() {
		Double suma = 0.0;
		Integer cont = 0;
		for (Propiedad actual : propiedades) {
			if (actual instanceof Casa) {
				cont++;
				suma += actual.getPrecio();
			}
			
		}
		return suma/cont;
	}

	public Double obtenerValorPromedioDeLosDepartamentos() {
		Double suma = 0.0;
		Integer cont = 0;
		for (Propiedad actual : propiedades) {
			if (actual instanceof Departamento) {
				cont++;
				suma += actual.getPrecio();
			}
			
		}
		return suma/cont;
	}
	





	
	
	
	

}
