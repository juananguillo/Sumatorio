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
        int resultado = suma.sumatorio("523");
        assertEquals(10,resultado );
        
	}

}
