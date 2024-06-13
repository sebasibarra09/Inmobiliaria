package ar.edu.unlam.pb1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


class test {

	/* Test a.*/
	@Test 
	void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		assertTrue(prop.getPropiedades().contains(casita));

	}
	
	/* Test b.*/
	@Test
	void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Propiedad casita2 = new Casa("14", "Titanic", 1213, "La Matanza", 200000.0);
		Propiedad casita3 = new Casa("16", "Titanic", 1214, "La Matanza", 200000.0);
		Propiedad casita4 = new Casa("17", "Titanic", 1215, "La Matanza", 200000.0);
		Propiedad casita5 = new Casa("18", "Titanic", 1216, "La Matanza", 200000.0);
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
	void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion () throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Propiedad casita2 = new Casa("1", "Titanic", 1212, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		assertFalse(prop.add(casita2));
	}

	/* Test c.*/
	@Test 
	void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
		Propiedad departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		assertTrue(prop.getPropiedades().contains(departamentito));
	}
	
	/* Test d.*/
	@Test 
	void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() throws UmbralMinimoNoAlcanzadoException {
		Propiedad departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 200000.0);
		Propiedad departamentito2 = new Departamento("14", "Titanic", 1212,"4", "D", "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		assertTrue(prop.getPropiedades().contains(departamentito));
		assertTrue(prop.getPropiedades().contains(departamentito2));
	}
	
	@Test
	void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion () throws UmbralMinimoNoAlcanzadoException {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 200000.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		assertFalse(prop.add(departamentito2));
	
	}	
	/* Test e.*/
	@Test 
	void queSePuedaObtenerElValorPromedioDeLasCasas() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Propiedad casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		prop.add(casita2);
		assertEquals(prop.obtenerValorPromedioDeLasCasas(), 200000.0);
	}
	
	/* Test f.*/
	@Test 
	void queSePuedaObtenerElValorPromedioDeLosDepartamentos() throws UmbralMinimoNoAlcanzadoException {
		Propiedad departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 600000.0);
		Propiedad departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		assertEquals(prop.obtenerValorPromedioDeLosDepartamentos(), 400000.0);
	}
	
	/* Test g.*/
	@Test 
	void queSePuedaAgregarUnClienteALaInmobiliaria() {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		assertTrue(prop.getClientes().contains(clien));

	}
	
	@Test
	void queSePuedaDarDeAltaDosClientesEnLaInmobiliaria() {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Cliente clien2 = new Cliente(16, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		prop.addCliente(clien2);
		assertTrue(prop.getClientes().contains(clien));
		assertTrue(prop.getClientes().contains(clien2));
	}
	
	/* Test h.*/
	@Test
	void queNoSePuedanAgregarDosClientesConUnMismoDni  () {
		Cliente clien = new Cliente(15, "Seba", "Ibarra", "13785135", "12121212");
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCliente(clien);
		assertFalse(prop.addCliente(clien));
	}
	
	/*Test i.*/
	@Test
	void queSePuedaRealizarLaVentaDeUnaPropiedad () throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Propiedad("15", "Titanic", 1212, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.venderPropiedad(casita, clien);
		assertEquals(casita.getDueno(), clien);
		assertEquals(casita.getEstaDisponible(), false);
		assertEquals(casita.getTipo(), TIPO_DE_OPERACION.VENTA);
	}
	
	@Test
	void queNoSePuedaVenderUnaCasaEnLaInmobiliariaPorqueYaSeVendio() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.venderPropiedad(casita, clien);
		assertFalse(prop.venderPropiedad(casita, clien));
	}
	
	/*Test j.*/
	@Test
	void queSePuedaRealizarElAlquilerDeUnaPropiedad() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.alquilarPropiedad(casita, clien);
		assertEquals(casita.getInquilino(), clien);
		assertEquals(casita.getEstaDisponible(), false);
		assertEquals(casita.getTipo(), TIPO_DE_OPERACION.ALQUILER);
	}
	
	/*Test k.*/
	@Test
	void queSePuedaRealizarLaPermutaDeDosPropiedades() throws LaPropiedadNoTieneDuenoException, UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Propiedad casita2 = new Departamento("14", "Titanic", 1212, "La Matanza", "A", "C", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		Cliente clien2 = new Cliente(121214, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.add(casita2);
		prop.venderPropiedad(casita, clien);
		prop.venderPropiedad(casita2, clien2);
		assertTrue(prop.permutarPropiedad(casita, clien, casita2, clien2));
		assertTrue(casita.getDueno().equals(clien2));
		assertTrue(casita2.getDueno().equals(clien));
		
	}
	@Test 
	public void queNoSePuedaRealizarLaPermutaDeDosPropiedadesPorqueAlgunoNoTienePropiedad() throws LaPropiedadNoTieneDuenoException, UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 200000.0);
		Propiedad casita2 = new Departamento("14", "Titanic", 1212, "La Matanza", "A", "C", 200000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		Cliente clien = new Cliente(121212, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		Cliente clien2 = new Cliente(121214, "Seba", "Ibarra", "seba12Qgmail.com", "1152528525");
		prop.add(casita);
		prop.add(casita2);
		prop.venderPropiedad(casita, clien);
		 assertThrows(LaPropiedadNoTieneDuenoException.class, () -> {
	            prop.permutarPropiedad(casita, clien, casita2, clien2);
	        });
	}
	
	/*Test l.*/
	@Test
	void queSePuedaRealizarLaBusquedaDeCasasPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 9000000.0);
		Propiedad casita2 = new Casa("12", "Titanic", 1212, "La Matanza", 1000000.0);
		Propiedad casita3 = new Casa("1", "Titanic", 1212, "La Matanza", 100000005.0);
		Propiedad casita4 = new Casa("10", "Titanic", 1212, "La Matanza", 5000000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		prop.add(casita2);
		prop.add(casita3);
		prop.add(casita4);
		List<Propiedad> resultado =prop.buscarCasasPorRangoDeprecio(200000.0, 10000000.0);
		assertEquals(casita2 , resultado.get(0));
		assertEquals(casita4 , resultado.get(1));
		assertEquals(casita , resultado.get(2));
	
	}
	
	/*Test m.*/
	@Test
	void queSePuedaRealizarLaBusquedaDeCasasPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Casa("15", "Titanic", 1212, "La Matanza", 9000000.0);
		Propiedad casita2 = new Casa("12", "Titanic", 1212, "La Matanza3", 1000000.0);
		Propiedad casita3 = new Casa("1", "Titanic", 1212, "La Matanza", 100000005.0);
		Propiedad casita4 = new Casa("10", "Titanic", 1212, "La Matanza", 5000000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(casita);
		prop.add(casita2);
		prop.add(casita3);
		prop.add(casita4);
		List<Propiedad> resultado =prop.buscarCasasPorUbicacion("La Matanza");
		assertEquals(casita , resultado.get(0));	
		assertEquals(casita3 , resultado.get(1));	
	}
	
	/*Test n.*/
	@Test
	void queSePuedaRealizarLaBusquedaDeDepartamentosPorRangoDePreciosYElResultadoEsteOrdenadoPorPrecio() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Propiedad departamentito = new Departamento("15", "Titanic", 1212, "La Matanza", "2", "A", 9000000.0);
		Propiedad departamentito2 = new Departamento("12", "Titanic", 1212, "La Matanza","2", "A", 100000010.0);
		Propiedad departamentito3 = new Departamento("1", "Titanic", 1212, "La Matanza","2", "A", 100000005.0);
		Propiedad departamentito4 = new Departamento("10", "Titanic", 1212, "La Matanza","2", "A", 5000000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		List<Propiedad> resultado =prop.buscarDepartamentosPorRangoDeprecio(200000.0, 10000000.0);
		assertEquals(departamentito4 , resultado.get(0));
		assertEquals(departamentito , resultado.get(1));
	}
	
	/*Test o.*/
	@Test
	void queSePuedaRealizarLaBusquedaDeDepartamentosPorUbicacionYElResultadoEsteOrdenadoPorUbicacion() throws UmbralMinimoNoAlcanzadoException {
		Propiedad departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza2", 600000.0);
		Propiedad departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 200000.0);
		Propiedad departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 800000.0);
		Propiedad departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza3", 10000000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		List<Propiedad> resultado = prop.buscarDepartamentosPorUbicacion("La Matanza");
		assertEquals(departamentito2 , resultado.get(0));	
		assertEquals(departamentito3 , resultado.get(1));	

	}
	
	/*Test p.*/
	@Test
	void queAlBuscarPorUnCriterioQueNoArrojeResultadosSeProduzcaLaExcepcionSinResultadosException() throws SinResultadosException, UmbralMinimoNoAlcanzadoException {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 600000.0);
		Departamento departamentito2 = new Departamento("12", "Titanic", 1212,"4", "D", "La Matanza", 100000.0);
		Departamento departamentito3 = new Departamento("1", "Titanic", 1212,"4", "D", "La Matanza", 800000.0);
		Departamento departamentito4 = new Departamento("10", "Titanic", 1212,"4", "D", "La Matanza", 10000000.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.add(departamentito);
		prop.add(departamentito2);
		prop.add(departamentito3);
		prop.add(departamentito4);
		assertThrows(SinResultadosException.class, () -> {
			prop.buscarDepartamentosPorRangoDeprecio(10000001.0, 10000085.0);
        });
	}
	
	/*Test p.*/
	@Test
	void queAlIntentarGuardarUnaPropiedadParaLaVentaCuyoImporteEstaPorDebajoDelUmbral10000SeArrojeLaExcepcionUmbralMinimoNoAlcanzadoException() throws UmbralMinimoNoAlcanzadoException {
		Propiedad casita = new Propiedad("15", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		 assertThrows(UmbralMinimoNoAlcanzadoException.class, () -> {
	            prop.add(casita);
	        });

	}
	
	
	
}
