package calculadora;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		java.util.Date data1 = new Date();
		java.util.Date data2 = new Date();
		
		assertSame( data1, data2); //mismo puntero
		assertEquals(data1, data2);// llama al equals de los objetos
		
//		assertTrue
//		assertFalse
//		assertNotEquals(unexpected, actual);
		
	}

}
