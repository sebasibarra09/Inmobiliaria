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
		assertEquals(casita, prop.getCasas()[0]);

	}
	
	@Test
	void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1213, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		prop.addCasa(casita2);
		assertEquals(casita, prop.getCasas()[0]);
		assertEquals(casita2, prop.getCasas()[1]);
	}

	@Test
	void queNoSePuedanDarDeAltaDosCasasConUnaMismaDireccion () {
		Casa casita = new Casa("15", "Titanic", 1212, "La Matanza", 20.0);
		Casa casita2 = new Casa("13", "Titanic", 1212, "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addCasa(casita);
		assertFalse(prop.addCasa(casita2));
	}
	
	@Test
	void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		assertEquals(departamentito, prop.getDepartamentos()[0]);
	}
	
	@Test
	void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "D", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		prop.addDepartamento(departamentito2);
		assertEquals(departamentito, prop.getDepartamentos()[0]);
		assertEquals(departamentito2, prop.getDepartamentos()[1]);
	}
	
	@Test
	void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion () {
		Departamento departamentito = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Departamento departamentito2 = new Departamento("15", "Titanic", 1212,"4", "C", "La Matanza", 20.0);
		Inmobiliaria prop = new Inmobiliaria("Prop", "Arieta", "prop@gmail.com", "1155447913");
		prop.addDepartamento(departamentito);
		assertFalse(prop.addDepartamento(departamentito2));
	
	}	
}
