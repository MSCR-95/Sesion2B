package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	private float ventasM, horasEx, nominaBru;
	private String tipoEm;

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
		tipoEm = "Vendedor";
		nominaBru = 2000; 
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Before each");
	}
	
	//Test Nomina Bruta 

	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected = 2000;
		
		
	}
	
	@Test
	void testCalculoNominaVendedor() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaOtro() {
		fail("Not yet implemented");
	}
	
	
	@Test
	void testCalculoNominaVentasMesNegativas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMenor1000() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMesMayor1500() {
		fail("Not yet implemented");
	}
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtrasNegativas() {
		fail("Not yet implemented");
	}
	
	//Test Nomina Neta
	
	@Test
	void testCalculoNominaNetaNegativa() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMenor2100() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMayor2500() {
		fail("Not yet implemented");
	}

}
