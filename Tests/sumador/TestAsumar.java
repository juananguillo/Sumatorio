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

		Asumar sumi = new Asumar();
        String resultado = sumi.mostrar("8");
        assertEquals("8 = 8",resultado );
	}

	@Test 
	void test2() {
		Asumar suma = new Asumar();
        String resultado = suma.negativo("-8");
        assertEquals("",resultado );

	}

}
