package ar.edu.unlam.pb1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Inmobiliaria {
	
	private String nombre;
	private String direccion;
	private String eMail;
	private String telefono;
	private HashSet<Propiedad> propiedades;
	private HashSet<Casa> casas;
	private HashSet<Departamento> departamentos;
	private HashSet<PH> phs;
	private HashSet<Terreno> terrenos;
	private HashSet<Campo> campos;
	private HashSet<Cliente> clientes;
	Scanner lectura = new Scanner (System.in);
	
	
	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.casas= new HashSet<>();
		this.departamentos= new HashSet<>();
		this.terrenos= new HashSet<>();
		this.campos= new HashSet<>();
		this.clientes= new HashSet<>();
		this.propiedades= new HashSet<>();
	}
	
	public Boolean addCasa(Casa nueva) {
		propiedades.add(nueva);
		return casas.add(nueva);
	}
	
	public void editarCasaPorCodigo(String codigoABuscar) {
        for (Casa casita : casas) {
            if (casita.getCodigo().equals(codigoABuscar)) {
            	System.out.println("Que valor desea modificar?");
            	System.out.println(casita.toString()); 
            	System.out.println("1. Calle");
            	System.out.println("2. Numero");
            	System.out.println("3. Ciudad");
            	System.out.println("4. Precio");
            	Integer opcion = lectura.nextInt();
            	switch (opcion) {
				case 1:
					System.out.println("Ingrese el nuevo valor");
					casita.setCalle(lectura.next());
					break;

				case 2:
					System.out.println("Ingrese el nuevo valor");
					casita.setNumero(lectura.nextInt());
					break;
				case 3:
					System.out.println("Ingrese el nuevo valor");
					casita.setCiudad(lectura.next());
					break;
				case 4:
					System.out.println("Ingrese el nuevo valor");
					casita.setPrecio(lectura.nextDouble());
					break;
				default:
					break;
            	}
            	System.out.println(casita.toString());
                return;
            } else {
            	System.out.println("No se encontro ese codigo");
            	return;
            }
            
        }
        return ; 
    }
	
	public Boolean addDepartamento(Departamento nueva) {
		propiedades.add(nueva);
		System.out.println(nueva);
		return departamentos.add(nueva);
	}
	
	public void editarDepatamentoPorCodigo(String codigoBuscado) {
		for (Departamento dpto : departamentos) {
            if (dpto.getCodigo().equals(codigoBuscado)) {
            	System.out.println("Que valor desea modificar?");
            	System.out.println(dpto.toString()); 
            	System.out.println("1. Calle");
            	System.out.println("2. Numero");
            	System.out.println("3. Piso");
            	System.out.println("4. Departamento");
            	System.out.println("5. Ciudad");
            	System.out.println("6. Precio");
            	Integer opcion = lectura.nextInt();
            	switch (opcion) {
				case 1:
					System.out.println("Ingrese el nuevo valor");
					dpto.setCalle(lectura.next());
					break;

				case 2:
					System.out.println("Ingrese el nuevo valor");
					dpto.setNumero(lectura.nextInt());
					break;
				case 3:
					System.out.println("Ingrese el nuevo valor");
					dpto.setPiso(lectura.next());
					break;
				case 4:
					System.out.println("Ingrese el nuevo valor");
					dpto.setDepartamento(lectura.next());
					break;
				case 5:
					System.out.println("Ingrese el nuevo valor");
					dpto.setCiudad(lectura.next());
					break;
				case 6:
					System.out.println("Ingrese el nuevo valor");
					dpto.setPrecio(lectura.nextDouble());
					break;
				default:
					break;
            	}
            	System.out.println(dpto.toString());
                return;
            }
            else {
            	System.out.println("No se encontro ese codigo");
            	return;
            }
        }
        return ; 
    }
		
	public Boolean addPH(PH nueva) {
		propiedades.add(nueva);
		return phs.add(nueva);
	}
	
	public void editarPHPorCodigo(String codigoBuscado) {
		for (PH phcito : phs) {
            if (phcito.getCodigo().equals(codigoBuscado)) {
            	System.out.println("Que valor desea modificar?");
            	System.out.println(phcito.toString()); 
            	System.out.println("1. Calle");
            	System.out.println("2. Numero");
            	System.out.println("3. Ciudad");
            	System.out.println("4. Precio");
            	Integer opcion = lectura.nextInt();
            	switch (opcion) {
				case 1:
					System.out.println("Ingrese el nuevo valor");
					phcito.setCalle(lectura.next());
					break;

				case 2:
					System.out.println("Ingrese el nuevo valor");
					phcito.setNumero(lectura.nextInt());
					break;
				case 3:
					System.out.println("Ingrese el nuevo valor");
					phcito.setCiudad(lectura.next());
					break;
				case 4:
					System.out.println("Ingrese el nuevo valor");
					phcito.setPrecio(lectura.nextDouble());
					break;
				default:
					break;
            	}
            	System.out.println(phcito.toString());
                return;
            } else {
            	System.out.println("No se encontro ese codigo");
            	return;
            }
        }
        return ; 
    }
	
	public Boolean addTerreno(Terreno nueva) {
		propiedades.add(nueva);
		return terrenos.add(nueva);
	}
	
	public void editarTerrenoPorCodigo(String codigoBuscado) {
		for (Terreno terrenito : terrenos) {
            if (terrenito.getCodigo().equals(codigoBuscado)) {
            	System.out.println("Que valor desea modificar?");
            	System.out.println(terrenito.toString()); 
            	System.out.println("1. Calle");
            	System.out.println("2. Numero");
            	System.out.println("3. Ciudad");
            	System.out.println("4. Precio");
            	Integer opcion = lectura.nextInt();
            	switch (opcion) {
				case 1:
					System.out.println("Ingrese el nuevo valor");
					terrenito.setCalle(lectura.next());
					break;

				case 2:
					System.out.println("Ingrese el nuevo valor");
					terrenito.setNumero(lectura.nextInt());
					break;
				case 3:
					System.out.println("Ingrese el nuevo valor");
					terrenito.setCiudad(lectura.next());
					break;
				case 4:
					System.out.println("Ingrese el nuevo valor");
					terrenito.setPrecio(lectura.nextDouble());
					break;
				default:
					break;
            	}
            	System.out.println(terrenito.toString());
                return;
            } else {
            	System.out.println("No se encontro ese codigo");
            	return;
            }
        }
        return ; 
    }
	public Boolean addCampo(Campo nueva) {
		campos.add(nueva);
		return campos.add(nueva);
	}
	
	public void editarCampoPorCodigo(String codigoBuscado) {
		for (Campo camp : campos) {
            if (camp.getCodigo().equals(codigoBuscado)) {
            	System.out.println("Que valor desea modificar?");
            	System.out.println(camp.toString()); 
            	System.out.println("1. Calle");
            	System.out.println("2. Numero");
            	System.out.println("3. Ciudad");
            	System.out.println("4. Precio");
            	Integer opcion = lectura.nextInt();
            	switch (opcion) {
				case 1:
					System.out.println("Ingrese el nuevo valor");
					camp.setCalle(lectura.next());
					break;

				case 2:
					System.out.println("Ingrese el nuevo valor");
					camp.setNumero(lectura.nextInt());
					break;
				case 3:
					System.out.println("Ingrese el nuevo valor");
					camp.setCiudad(lectura.next());
					break;
				case 4:
					System.out.println("Ingrese el nuevo valor");
					camp.setPrecio(lectura.nextDouble());
					break;
				default:
					break;
            	}
            	System.out.println(camp.toString());
                return;
            } else {
            	System.out.println("No se encontro ese codigo");
            	return;
            }
        }
        return ; 
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

/*
	public void ordenarPorPrecio() {
		Casa auxOrdenamiento[] ;
		auxOrdenamiento = new Casa[CANTIDAD_MAXIMA_DE_PROPIEDADES*5];

		
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			auxOrdenamiento[i]=casas[i];
			auxOrdenamiento[i+99].setCodigo(departamentos[i].getCodigo());
			auxOrdenamiento[i+99].setCalle(departamentos[i].getCalle());
			auxOrdenamiento[i+99].setNumero(departamentos[i].getNumero());
			auxOrdenamiento[i+99].setCiudad(departamentos[i].getCiudad());
			auxOrdenamiento[i+99].setPrecio(departamentos[i].getPrecio());
			auxOrdenamiento[i+199].setCodigo(phs[i].getCodigo());
			auxOrdenamiento[i+199].setCalle(phs[i].getCalle());
			auxOrdenamiento[i+199].setNumero(phs[i].getNumero());
			auxOrdenamiento[i+199].setCiudad(phs[i].getCiudad());
			auxOrdenamiento[i+199].setPrecio(phs[i].getPrecio());
			auxOrdenamiento[i+299].setCodigo(terrenos[i].getCodigo());
			auxOrdenamiento[i+299].setCalle(terrenos[i].getCalle());
			auxOrdenamiento[i+299].setNumero(terrenos[i].getNumero());
			auxOrdenamiento[i+299].setCiudad(terrenos[i].getCiudad());
			auxOrdenamiento[i+299].setPrecio(terrenos[i].getPrecio());
			auxOrdenamiento[i+399].setCodigo(campos[i].getCodigo());
			auxOrdenamiento[i+399].setCalle(campos[i].getCalle());
			auxOrdenamiento[i+399].setNumero(campos[i].getNumero());
			auxOrdenamiento[i+399].setCiudad(campos[i].getCiudad());
			auxOrdenamiento[i+399].setPrecio(campos[i].getPrecio());
			
			 Arrays.sort(auxOrdenamiento);
			 
			 auxOrdenamiento.toString();
		}
		
		
		
	}
*/
	public ArrayList<Casa> buscarCasasPorRangoDeprecio(Double precioMinimo, Double precioMaximo){
		ArrayList<Casa> resultado = new ArrayList<Casa>();
		for (Casa actual : casas) {
			if (actual.getPrecio() >= precioMinimo && actual.getPrecio() <= precioMaximo) {
				resultado.add(actual);
			}
		}
		return resultado;
	}
	

	
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorPrecio() {
        TreeSet<Propiedad> propiedadesOrdenadas = new TreeSet<>(Comparator.comparingDouble(Propiedad::getPrecio));
        propiedadesOrdenadas.addAll(propiedades);
        return new ArrayList<>(propiedadesOrdenadas);
    }
	
	public List<Propiedad> obtenerListadoDePropiedadesOrdenadosPorUbicacion() {
		List<Propiedad> propiedadesOrdenadasPorUbicacion = new ArrayList<>(propiedades);
	   propiedadesOrdenadasPorUbicacion.sort(Comparator.comparing(propiedad -> propiedad.getCiudad()));
	   return propiedadesOrdenadasPorUbicacion;
    }
	
	
	public void venderCasa(Casa casita) {
		for (Casa actual : casas) {
			if (actual == casita) {
				actual.setTipo(TIPO_DE_OPERACION.VENTA);
			}
		}
		
	}

	public Double obtenerValorPromedioDeLasCasas() {
		Double suma = 0.0;
		for (Casa actual : casas) {
			suma += actual.getPrecio();
		}
		return suma/casas.size();
	}

	public Double obtenerValorPromedioDeLosDepartamentos() {
		Double suma = 0.0;
		for (Departamento actual : departamentos) {
			suma += actual.getPrecio();
		}
		return suma/departamentos.size();
	}

	
	public HashSet<Casa> getCasas() {
		return casas;
	}

	public void setCasas(HashSet<Casa> casas) {
		this.casas = casas;
	}

	public HashSet<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(HashSet<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}



	
	
	
	

}
