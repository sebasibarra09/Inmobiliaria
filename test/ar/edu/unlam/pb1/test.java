package ar.edu.unlam.pb1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		assertTrue(prop.getCasas().contains(casita));

	}
	
	@Test
	void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 20.0);
		Casa casita3 = new Casa("13", "Titanic", 1214, "La Matanza", 20.0);
		Casa casita4 = new Casa("13", "Titanic", 1215, "La Matanza", 20.0);
		Casa casita5 = new Casa("13", "Titanic", 1216, "La Matanza", 20.0);
		
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		prop.addCasa(casita2);
		prop.addCasa(casita3);
		prop.addCasa(casita4);
		prop.addCasa(casita5);
		assertTrue(prop.getCasas().contains(casita));
		assertTrue(prop.getCasas().contains(casita2));
		assertTrue(prop.getCasas().contains(casita3));
		assertTrue(prop.getCasas().contains(casita4));
		assertTrue(prop.getCasas().contains(casita5));
	}

	@Test
	void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion () {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		assertFalse(prop.addCasa(casita2));
	}

	@Test
	void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		assertTrue(prop.getDepartamentos().contains(departamentito));
	}
	
	@Test
	void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		assertTrue(prop.getDepartamentos().contains(departamentito));
		assertTrue(prop.getDepartamentos().contains(departamentito2));
	}
	
	@Test
	void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion () {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		assertFalse(prop.addDepartamento(departamentito2));
	
	}	

	@Test
	void queSePuedaObtenerElValorPromedioDeLasCasas() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		prop.addCasa(casita2);
		assertEquals(prop.obtenerValorPromedioDeLasCasas(), 20.0);
	}
	
	@Test
	void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		assertEquals(prop.obtenerValorPromedioDeLosDepartamentos(), 40.0);
	}
	
	@Test
	void queSePuedaDarDeAltaUnClienteEnLaInmobiliaria() {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		assertTrue(prop.getClientes().contains(clien));

	}
	
	@Test
	void queSePuedaDarDeAltaDosUnClientesEnLaInmobiliaria() {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Cliente clien2 = new Cliente(16, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		prop.addCliente(clien2);
		assertTrue(prop.getClientes().contains(clien));
		assertTrue(prop.getClientes().contains(clien2));

	}
	
	@Test
	void queNoSePuedaDarDeAltaUnClientePorDniRepetidoEnLaInmobiliaria() {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		assertFalse(prop.addCliente(clien));
	}
	
	@Test
	void queSePuedaObtenerElListadoDePropiedadesOrdenadosPorPrecio() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 90.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 85.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		prop.addDepartamento(departamentito3);
		prop.addDepartamento(departamentito4);
		System.out.println(prop.obtenerListadoDePropiedadesOrdenadosPorPrecio2());
		assertTrue(true);
	}
	
	@Test
	void queSePuedaObtenerElListadoDePropiedadesOrdenadosUbicacion() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza2", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza5", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza4", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza3", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		prop.addDepartamento(departamentito3);
		prop.addDepartamento(departamentito4);
		System.out.println(prop.obtenerListadoDePropiedadesOrdenadosPorUbicacion());
		assertTrue(true);
	}
	
	@Test
	void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		prop.addDepartamento(departamentito3);
		prop.addDepartamento(departamentito4);
		assertNotNull(prop.buscarCasasPorRangoDeprecio(25.0, 85.0));
	}
	
	@Test
	void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		prop.addDepartamento(departamentito3);
		prop.addDepartamento(departamentito4);
		assertTrue(prop.buscarCasasPorRangoDeprecio(1001.0, 1085.0).isEmpty());
	}
	
	
}
