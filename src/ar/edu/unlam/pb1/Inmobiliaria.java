package ar.edu.unlam.pb1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Inmobiliaria {
	
	private String nombre;
	private String direccion;
	private String eMail;
	private String telefono;
	private Casa casas[];
	private Departamento departamentos[];
	private PH phs[];
	private Terreno terrenos[];
	private Campo campos[];
	private final Integer CANTIDAD_MAXIMA_DE_PROPIEDADES = 100;
	private Cliente clientes[];
	private final Integer CANTIDAD_MAXIMA_DE_CLIENTES= 100;
	Scanner lectura = new Scanner (System.in);
	
	
	public Inmobiliaria(String nombre, String direccion, String eMail, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.eMail = eMail;
		this.telefono = telefono;
		this.casas= new Casa[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.departamentos= new Departamento[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.phs= new PH[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.terrenos= new Terreno[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.campos= new Campo[CANTIDAD_MAXIMA_DE_PROPIEDADES];
		this.clientes= new Cliente[CANTIDAD_MAXIMA_DE_CLIENTES];
	}
	
	public Boolean addCasa(Casa nueva) {
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			
			if (casas[i]== null) {
				casas[i] = nueva;
				System.out.println(nueva.toString());
				return true;
			} else {
				if (casas[i].getCalle().equals(nueva.getCalle()) && casas[i].getNumero().equals(nueva.getNumero()) 
						&& casas[i].getCiudad().equals(nueva.getCiudad())) {
					return false;
				}
				
			}
		}
		return false;
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
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			if (departamentos[i]== null) {
				departamentos[i] = nueva;
				System.out.println(nueva.toString());
				return true;
			} else {
				if (departamentos[i].getCalle().equals(nueva.getCalle()) && departamentos[i].getNumero().equals(nueva.getNumero()) 
						&& departamentos[i].getCiudad().equals(nueva.getCiudad()) 
						&& departamentos[i].getPiso().equals(nueva.getPiso())
						&& departamentos[i].getDepartamento().equals(nueva.getDepartamento())) {
					return false;
				}
			}
		}
		return false;
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
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			if (phs[i]== null) {
				phs[i] = nueva;
				System.out.println(nueva.toString());
				return true;
			}
		}
		return false;
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
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			if (terrenos[i]== null) {
				terrenos[i] = nueva;
				System.out.println(nueva.toString());
				return true;
			}
		}
		return false;
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
		for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
			if (campos[i]== null) {
				campos[i] = nueva;
				System.out.println(nueva.toString());
				return true;
			}
		}
		return false;
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
	    for (int i = 0; i < CANTIDAD_MAXIMA_DE_PROPIEDADES; i++) {
	        if (clientes[i] != null && clientes[i].getDni() == nuevo.getDni()) {
	            System.out.println("El cliente ya existe");
	            return false;
	        }
	        if (clientes[i] == null) {
	            clientes[i] = nuevo;
	            System.out.println(nuevo.toString());
	            return true;
	        }
	    }
	    System.out.println("Se alcanzó el límite de clientes");
	    return false;
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

	public Casa[] getCasas() {
		return casas;
	}

	public void setCasas(Casa[] casas) {
		this.casas = casas;
	}

	public Departamento[] getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}

	public PH[] getPhs() {
		return phs;
	}

	public void setPhs(PH[] phs) {
		this.phs = phs;
	}

	public Terreno[] getTerrenos() {
		return terrenos;
	}

	public void setTerrenos(Terreno[] terrenos) {
		this.terrenos = terrenos;
	}

	public Campo[] getCampos() {
		return campos;
	}

	public void setCampos(Campo[] campos) {
		this.campos = campos;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PROPIEDADES() {
		return CANTIDAD_MAXIMA_DE_PROPIEDADES;
	}

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

	
	
	
	

}
