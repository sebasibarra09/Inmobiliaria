package ar.edu.unlam.pb1;

import java.util.Scanner;

public class InterfazInmobiliaria {
/*
	public static void main(String[] args) {
		
		Scanner lectura = new Scanner (System.in);
		int opcion =0;
		Inmobiliaria prop = new Inmobiliaria("propiedades", "Arieta", "agaga@gmail.com", "1160853490");
		int contadorDeCasas=0;
		int contadorDeDepartamentos=0;
		int contadorDePH=0;
		int contadorDeTerrenos=0;
		int contadorDeCampos=0;
		
		do {
		System.out.println("*-----------------------------*");
		System.out.println("Menu de opciones");
		System.out.println("1. Agregar nuevas propiedades");
		System.out.println("2. Modificar una propiedad existente");
		System.out.println("3. Agregar clientes");
		System.out.println("4. Obtener listado ordenado por precio");
		System.out.println("5. Obtener listado ordenado por ubicacion");
		System.out.println("6. Buscar propiedades por rango de precio");
		System.out.println("7. Buscar propiedades por rango de ubicacion");
		System.out.println("8. Realizar la venta de una propiedad");
		System.out.println("9. Realizar el alquiler de una propiedad");
		System.out.println("10. Salir");
	
		opcion = lectura.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Se selecciono la opcion " + opcion);
			System.out.println("Que tipo de propiedad desea añadir?");
			ListadoDeTerrenos();
			opcion = lectura.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Ingrese la calle");
				String calle = lectura.next();
				System.out.println("Ingrese el numero");
				Integer numero = lectura.nextInt();
				System.out.println("Ingrese la ciudad");
				String ciudad = lectura.next();
				System.out.println("Ingrese el precio");
				Double precio = lectura.nextDouble();
				
				contadorDeCasas++;
				
				Casa casaAux = new Casa("casa"+contadorDeCasas ,calle, numero, ciudad,precio);
				prop.addCasa(casaAux);
				break;
				
			case 2:
				System.out.println("Ingrese la calle");
				String calle2 = lectura.next();
				System.out.println("Ingrese el numero");
				Integer numero2 = lectura.nextInt();
				System.out.println("Ingrese el piso");
				String piso2 = lectura.next();
				System.out.println("Ingrese el departamento");
				String departamento2 = lectura.next();
				System.out.println("Ingrese la ciudad");
				String ciudad2 = lectura.next();
				System.out.println("Ingrese el precio");
				Double precio2 = lectura.nextDouble();
				
				contadorDeDepartamentos++;
				
				Departamento departamentoAux = new Departamento("departamento"+contadorDeDepartamentos,calle2, numero2,
						 piso2, departamento2, ciudad2,precio2);
				
				prop.addDepartamento(departamentoAux);
				break;
			case 3:
				System.out.println("Ingrese la calle");
				String calle3 = lectura.next();
				System.out.println("Ingrese el numero");
				Integer numero3 = lectura.nextInt();
				System.out.println("Ingrese la ciudad");
				String ciudad3 = lectura.next();
				System.out.println("Ingrese el precio");
				Double precio3 = lectura.nextDouble();
				
				contadorDePH++;
				
				PH phAux = new PH("ph"+contadorDeDepartamentos,calle3, numero3,
						ciudad3,precio3);
				
				prop.addPH(phAux);
				break;
			case 4:
				System.out.println("Ingrese la calle");
				String calle4 = lectura.next();
				System.out.println("Ingrese el numero");
				Integer numero4 = lectura.nextInt();
				System.out.println("Ingrese la ciudad");
				String ciudad4 = lectura.next();
				System.out.println("Ingrese el precio");
				Double precio4 = lectura.nextDouble();
				
				contadorDeTerrenos++;
				
				Terreno terrenoAux = new Terreno("terreno"+contadorDeDepartamentos,calle4, numero4,
						ciudad4,precio4);
				
				prop.addTerreno(terrenoAux);
				break;
			case 5:
				System.out.println("Ingrese la calle");
				String calle5 = lectura.next();
				System.out.println("Ingrese el numero");
				Integer numero5 = lectura.nextInt();
				System.out.println("Ingrese la ciudad");
				String ciudad5 = lectura.next();
				System.out.println("Ingrese el precio");
				Double precio5 = lectura.nextDouble();
				
				contadorDeCampos++;
				
				Campo campoAux = new Campo("campo"+contadorDeDepartamentos,calle5, numero5,
						ciudad5,precio5);
				
				prop.addCampo(campoAux);
				break;
				

			default:
				break;
			}
			break;
		case 2:
			System.out.println("Que tipo de propiedad desea modificar ?");
			ListadoDeTerrenos();
			opcion = lectura.nextInt();
			System.out.println("Ingrese el codigo de la propiedad");
			String codigoBuscado = lectura.next();
			switch (opcion) {
			case 1:
				prop.editarCasaPorCodigo(codigoBuscado);
				break;
			case 2:
				prop.editarDepatamentoPorCodigo(codigoBuscado);
				break;
			case 3:
				prop.editarPHPorCodigo(codigoBuscado);
				break;
			case 4:
				prop.editarTerrenoPorCodigo(codigoBuscado);
				break;
			case 5:
				prop.editarCampoPorCodigo(codigoBuscado);
				break;

			default:
				break;
			}
			
		
			break;
		case 3:
			System.out.println("Ingrese los datos del cliente:");
			System.out.println("Dni:");
			Integer dni = lectura.nextInt();
			System.out.println("Nombre:");
			String nombre1 = lectura.next();
			System.out.println("Apellido:");
			String apellido1 = lectura.next();
			System.out.println("Mail:");
			String mail1 = lectura.next();
			System.out.println("Celular:");
			String celular1 = lectura.next();
			Cliente client = new Cliente(dni, nombre1, apellido1, mail1, celular1);
			prop.addCliente(client);
			
			break;
		case 4:
			System.out.println("El listado ordenado por precio seria:");
			//prop.ordenarPorPrecio();
	
			break;
		case 5:
	
			break;
		case 6:
	
			break;
		case 7:
	
			break;
		case 8:
	
			break;
		case 9:
	
			break;

		default:
			break;
		}
			
		} while ( opcion !=10);
		
		
		
		

		
	
		
	}

	private static void ListadoDeTerrenos() {
		System.out.println("1. Casa");
		System.out.println("2. Departamento");
		System.out.println("3. PH");
		System.out.println("4. Terrenos");
		System.out.println("5. Campos");
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
	

}
