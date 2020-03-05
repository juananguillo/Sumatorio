/**
 * 
 */
package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Juan
 *
 */
class TestAsumar {

	@Test

	void test1() {

		Asumar suma = new Asumar();
        String resultado = suma.sumatorio("8");
        assertEquals("8 = 8",resultado );
	}

	@Test 
	void test2() {
		Asumar suma = new Asumar();
        String resultado = suma.sumatorio("-8");
        assertEquals("",resultado );
	}
	@Test
	void test3() {
		Asumar suma = new Asumar();
        String resultado = suma.sumatorio("234");
        assertEquals("2+3+4 = 9",resultado );
        

	}

}
