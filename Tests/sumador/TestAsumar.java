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
		Asumar sumi = new Asumar();
        String resultado = sumi.mostrar("8");
        assertEquals("8 = 8",resultado );
	}

}
