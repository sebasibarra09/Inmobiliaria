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
	private ArrayList<Operacion> operaciones;
	
	
	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.propiedades= new HashSet<>();
		this.clientes= new HashSet<>();
		this.operaciones= new ArrayList<>();
	}
	
	public Boolean add(Propiedad nueva) throws UmbralMinimoNoAlcanzadoException {
		if (nueva.getPrecio() < 10000) {
			throw new UmbralMinimoNoAlcanzadoException();
	}
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
	
	public Propiedad buscar(String buscada) {
		for (Propiedad prop : propiedades) {
			if (prop.getCodigo().equals(buscada)) {
				return prop;
			}
		}
		return null;
	}

	
	
	public ArrayList<Propiedad> buscarCasasPorRangoDeprecio(Double precioMinimo, Double precioMaximo) throws SinResultadosException{
		ArrayList<Propiedad> resultado = new ArrayList<Propiedad>();
		for (Propiedad actual : propiedades) {
			if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo && actual instanceof Casa) {
				resultado.add(actual);
			}
		}
		resultado.sort(Comparator.comparing(propiedad -> propiedad.getPrecio()));
		
		if (resultado.isEmpty()) {
			throw new SinResultadosException();
		}
		return resultado;
	}
	
	public ArrayList<Propiedad> buscarDepartamentosPorRangoDeprecio(Double precioMinimo, Double precioMaximo) throws SinResultadosException{
		ArrayList<Propiedad> resultado = new ArrayList<Propiedad>();
		for (Propiedad actual : propiedades) {
			if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo && actual instanceof Departamento) {
				resultado.add(actual);
			}
		}
		resultado.sort(Comparator.comparing(propiedad -> propiedad.getPrecio()));
		
		if (resultado.isEmpty()) {
			throw new SinResultadosException();
		}
		return resultado;
	}

	
	/*
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorPrecio() {
		List<Propiedad> propiedadesOrdenadas = new ArrayList<>(propiedades);
		propiedadesOrdenadas.sort(Comparator.comparing(propiedad -> propiedad.getPrecio()));
		  return propiedadesOrdenadas;
		
	}
	
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorUbicacion() {
		List<Propiedad> propiedadesOrdenadasPorUbicacion = new ArrayList<>(propiedades);
	   propiedadesOrdenadasPorUbicacion.sort(Comparator.comparing(propiedad -> propiedad.getCiudad()));
	   return propiedadesOrdenadasPorUbicacion;
    }
	*/
	
	public Boolean venderPropiedad(Propiedad vendida, Cliente comprador) {
		if (vendida.getEstaDisponible()) {
			Propiedad resultado = buscar(vendida);
			resultado.setDueno(comprador);
			resultado.setTipo(TIPO_DE_OPERACION.VENTA);
			resultado.setEstaDisponible(false);
			operaciones.add(new Venta(comprador, vendida));
			return true;
		}
		return false;
	}
		
	
	public Boolean alquilarPropiedad(Propiedad alquilada, Cliente inquilino) {
		if (alquilada.getEstaDisponible()) {
			Propiedad resultado = buscar(alquilada);
			resultado.setInquilino(inquilino);
			resultado.setTipo(TIPO_DE_OPERACION.ALQUILER);
			resultado.setEstaDisponible(false);
			operaciones.add(new Alquiler(inquilino, alquilada));
			return true;
		}
		return false;
	}
	
	public Boolean permutarPropiedad(Propiedad casita, Cliente clien, Propiedad casita2, Cliente clien2) throws LaPropiedadNoTieneDuenoException {
		if (casita.getDueno() == null || casita2.getDueno() == null) {
			throw new LaPropiedadNoTieneDuenoException();
		}
		if (casita.getDueno().equals(clien) && casita2.getDueno().equals(clien2)) {
			Propiedad permutada = buscar(casita.getCodigo());
			permutada.setDueno(clien2);
			permutada.setTipo(TIPO_DE_OPERACION.PERMUTA);
			permutada = buscar(casita2.getCodigo());
			permutada.setTipo(TIPO_DE_OPERACION.PERMUTA);
			permutada.setDueno(clien);
			operaciones.add(new Permuta(clien, casita, clien2, casita2));
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

	

	public List<Propiedad> buscarCasasPorUbicacion(String ciudadRecibida) throws SinResultadosException {
		List<Propiedad> propiedadesOrdenadasPorUbicacion = new ArrayList<>();
		for (Propiedad propiedad : propiedades) {
			if (propiedad.getCiudad().equals(ciudadRecibida) && propiedad instanceof Casa) {
				propiedadesOrdenadasPorUbicacion.add(propiedad);
			}
		}
		propiedadesOrdenadasPorUbicacion.sort(Comparator.comparing(propiedad -> propiedad.getCiudad()));
		System.out.println(propiedadesOrdenadasPorUbicacion.size());
		
		if (propiedadesOrdenadasPorUbicacion.isEmpty()) {
			throw new SinResultadosException();
		}
	   return propiedadesOrdenadasPorUbicacion;
    }
	
	public List<Propiedad> buscarDepartamentosPorUbicacion(String ciudadRecibida) throws SinResultadosException {
		List<Propiedad> propiedadesOrdenadasPorUbicacion = new ArrayList<>();
		for (Propiedad propiedad : propiedades) {
			if (propiedad.getCiudad().equals(ciudadRecibida) && propiedad instanceof Departamento) {
				propiedadesOrdenadasPorUbicacion.add(propiedad);
			}
		}
	   propiedadesOrdenadasPorUbicacion.sort(Comparator.comparing(propiedad -> propiedad.getCiudad()));
	   if (propiedadesOrdenadasPorUbicacion.isEmpty()) {
			throw new SinResultadosException();
		}
	   return propiedadesOrdenadasPorUbicacion;
    }
	
	public List<Operacion> buscarPropiedadesVendidas() {
		ArrayList<Operacion> propiedadesVendidas = new ArrayList<>();
		for (Operacion ope : operaciones) {
			if (ope instanceof Venta) {
				propiedadesVendidas.add(ope);
			}
		}
		return propiedadesVendidas;
	}
	
	public List<Operacion> buscarPropiedadesAlquiladas() {
		ArrayList<Operacion> propiedadesVendidas = new ArrayList<>();
		for (Operacion ope : operaciones) {
			if (ope instanceof Alquiler) {
				propiedadesVendidas.add(ope);
			}
		}
		return propiedadesVendidas;
	}
	
	public List<Operacion> buscarPropiedadesPermutadas() {
		ArrayList<Operacion> propiedadesVendidas = new ArrayList<>();
		for (Operacion ope : operaciones) {
			if (ope instanceof Permuta) {
				propiedadesVendidas.add(ope);
			}
		}
		return propiedadesVendidas;
	}

	
	
}
