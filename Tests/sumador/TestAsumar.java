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
	void test() {
		Asumar suma = new Asumar();
        String resultado = suma.negativo("-8");
        assertEquals("",resultado );
	}

}
