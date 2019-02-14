package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before
	public void before(){
		System.out.println("before()");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass()");
	}
	
	@After
	public void after(){
		System.out.println("after()");
		calc.clear();
	}
	
	@Test
	public void testSum(){
		System.out.println("testSum()");
		
//		int actual = calc.add(3,2);
//		int expected = 5;
//		assertEquals(expected, actual);
		assertEquals(5, calc.add(3,2));
	}
	
	@Test
	public void testAnsSum(){
		System.out.println("testAnsSum()");
		calc.add(3,2);
		int actual = calc.ans();
		int expected = 5;
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testDiv(){
		System.out.println("testDiv()");
		calc.div(5, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero(){
		System.out.println("testDivPorCero()");
		calc.div(5, 0);
	}
	
	@Test(timeout = 3000)
	public void testOperacionOptima(){
		System.out.println("testOperacionOptima()");
		calc.operacionOptima();
	}

}
