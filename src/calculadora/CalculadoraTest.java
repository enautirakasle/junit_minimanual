package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma(){
		int resultado = Calculadora.suma(2,3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta(){
		int resultado = Calculadora.resta(4, 1);
		int esperado = 3;
		assertEquals(esperado, resultado);
	}

}
