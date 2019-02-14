package calculadora;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

	@Parameters
	public static Iterable<Object[]> getData(){
//		List <Object[]> objs = new ArrayList<>();
//		objs.add(new Object[]{2, 2, 4});
//		objs.add(new Object[]{10, 14, 24});
//		objs.add(new Object[]{3, -2, 1});
//		objs.add(new Object[]{4, 4, 8});
//		return objs;
		
		return Arrays.asList(new Object[][]{
			{2, 2, 4},
			{10, 14, 24},
			{3, -2, 1},
			{4, 4, 8}
		});
		
	}
	
	private int a,b,exp;
	 
	public CalculadoraParametroTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testSum() {
		Calculadora calc = new Calculadora();
		int actual = calc.add(a,b);
		assertEquals(exp, actual);
	}

}
