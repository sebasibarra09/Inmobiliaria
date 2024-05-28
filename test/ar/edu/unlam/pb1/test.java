package ar.edu.unlam.pb1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		assertTrue(prop.getPropiedades().contains(casita));

	}
	
	@Test
	void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 20.0);
		Casa casita3 = new Casa("13", "Titanic", 1214, "La Matanza", 20.0);
		Casa casita4 = new Casa("13", "Titanic", 1215, "La Matanza", 20.0);
		Casa casita5 = new Casa("13", "Titanic", 1216, "La Matanza", 20.0);
		
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		prop.add(casita2);
		prop.add(casita3);
		prop.add(casita4);
		prop.add(casita5);
		assertTrue(prop.getPropiedades().contains(casita));
		assertTrue(prop.getPropiedades().contains(casita2));
		assertTrue(prop.getPropiedades().contains(casita3));
		assertTrue(prop.getPropiedades().contains(casita4));
		assertTrue(prop.getPropiedades().contains(casita5));
	}

	@Test
	void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion () {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("1", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		assertFalse(prop.add(casita2));
	}
	
	@Test
	void queSePuedaVenderUnaCasaEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.venderPropiedad(casita, clien);
		assertEquals(casita.getDueno(), clien);
		assertEquals(casita.getEstaDisponible(), false);
		assertEquals(casita.getTipo(), TIPO_DE_OPERACION.VENTA);
	}
	
	@Test
	void queNoSePuedaVenderUnaCasaEnLaInmobiliariaPorqueYaSeVendio() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.venderPropiedad(casita, clien);
		assertFalse(prop.venderPropiedad(casita, clien));
	}
	
	@Test
	void queSePuedaAlquilarUnaCasaEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.alquilaPropiedad(casita, clien);
		assertEquals(casita.getInquilino(), clien);
		assertEquals(casita.getEstaDisponible(), false);
		assertEquals(casita.getTipo(), TIPO_DE_OPERACION.ALQUILER);
	}

	@Test
	void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		assertTrue(prop.getPropiedades().contains(departamentito));
	}
	
	@Test
	void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		assertTrue(prop.getPropiedades().contains(departamentito));
		assertTrue(prop.getPropiedades().contains(departamentito2));
	}
	
	@Test
	void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion () {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		assertFalse(prop.add(departamentito2));
	
	}	

	@Test
	void queSePuedaObtenerElValorPromedioDeLasCasas() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		prop.add(casita2);
		assertEquals(prop.obtenerValorPromedioDeLasCasas(), 20.0);
	}
	
	@Test
	void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
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
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		List<Propiedad> resultado =prop.obtenerListadoDePropiedadesOrdenadosPorPrecio();
		assertEquals(departamentito , resultado.get(0));
		assertEquals(departamentito3 , resultado.get(1));
		assertEquals(departamentito4 , resultado.get(2));
		assertEquals(departamentito2 , resultado.get(3));
	}
	
	@Test
	void queSePuedaObtenerElListadoDePropiedadesOrdenadosUbicacion() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza2", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza5", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza4", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza3", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		List<Propiedad> resultado = prop.obtenerListadoDePropiedadesOrdenadosPorUbicacion();
		assertEquals(departamentito , resultado.get(0));
		assertEquals(departamentito4 , resultado.get(1));
		assertEquals(departamentito3 , resultado.get(2));
		assertEquals(departamentito2 , resultado.get(3));

	}
	
	@Test
	void queLaBusquedaPorRangoDePrecioDeMeArrojeUnArrayNoNuloSiAplicanResultados() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		assertNotNull(prop.buscarCasasPorRangoDeprecio(25.0, 85.0));
	}
	
	@Test
	void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		assertTrue(prop.buscarCasasPorRangoDeprecio(1001.0, 1085.0).isEmpty());
	}
	
	@Test
	void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(departamentito);
		prop.add(casita);
		prop.add(departamentito3);
		prop.add(departamentito4);
		prop.venderPropiedad(departamentito, clien);
		prop.venderPropiedad(casita, clien);
		prop.venderPropiedad(departamentito3, clien);
		prop.venderPropiedad(departamentito4, clien);
		prop.venderPropiedad(departamentito4, clien);
		System.out.println(prop.buscarPropiedadesPorVenta().toString());
		assertEquals(prop.buscarPropiedadesPorVenta().size(), 4 );
	}
	
	@Test
	void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 60.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 80.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 1000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		System.out.println(prop.buscarPropiedadesPorVenta().toString());
		assertTrue(prop.buscarPropiedadesPorVenta().isEmpty());
	}
	
	
}
