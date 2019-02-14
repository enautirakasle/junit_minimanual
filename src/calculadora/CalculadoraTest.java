package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	
	@Before
	public void before(){
		System.out.println("Before");
		calc = new Calculadora();
	}
	
	@After
	public void after(){
		System.out.println("After");
		calc.clear();
	}
	
	@Test
	public void testSum(){
		System.out.println("testSum");
		
//		int actual = calc.add(3,2);
//		int expected = 5;
//		assertEquals(expected, actual);
		assertEquals(5, calc.add(3,2));
	}
	
	@Test
	public void testAnsSum(){
		System.out.println("testAnsSum");
		calc.add(3,2);
		int actual = calc.ans();
		int expected = 5;
		assertEquals(expected, actual);
	}

}
