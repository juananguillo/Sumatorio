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
        String resultado = suma.sumatorio(234);
        assertEquals("2+3+4=9",resultado );
        
	}

}
