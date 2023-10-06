package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;

class EmpleadoTest {
	
	private float ventasM, horasEx, nominaBru;
	String tipo;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		ventasM = 1000;
		horasEx = 1;
		tipo = "Encargado";
		nominaBru = 2000; 
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Before each");
	}
	
	//Tests Nomina Bruta 

	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected = 2630;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaVendedor() {
		tipo="Vendedor";
		float expected = 2130;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaOtro() {
		tipo="Otro";
		float expected = 130;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaVentasMesNegativas() {
		ventasM = -500;
		float expected = 2530;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMenor1000() {
		ventasM = 500;
		float expected = 2530;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500() {
		ventasM = 1100;
		float expected = 2630;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMayor1500() {
		ventasM = 2000;
		float expected = 2730;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		float expected = 2630;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		horasEx = -1;
		float expected = 2570;
		float actual = Empleado.calculoNominaBruta(tipo, ventasM, horasEx);
		assertEquals(expected, actual);
	}
	
	//Test Nomina Neta
	
	@Test
	void testCalculoNominaNetaNegativa() {
		nominaBru = -100;
		float expected = -100;
		float actual = Empleado.calculoNominaNeta(nominaBru);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMenor2100() {
		float expected = 2000;
		float actual = Empleado.calculoNominaNeta(nominaBru);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		nominaBru = 2200;
		float expected = 1870;
		float actual = Empleado.calculoNominaNeta(nominaBru);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMayor2500() {
		nominaBru = 2600;
		float expected = 2132;
		float actual = Empleado.calculoNominaNeta(nominaBru);
		assertEquals(expected, actual);
	}

}
