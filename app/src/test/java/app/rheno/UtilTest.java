/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app.rheno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTest {
    @Test void utilPowerOfTwoTest() {
        Util utilObj = new Util();
	assertEquals(utilObj.powerOfTwo(0), 1.00);
        assertEquals(utilObj.powerOfTwo(2), 4.00);
	assertEquals(utilObj.powerOfTwo(4), 16.00);
	assertEquals(utilObj.powerOfTwo(100), 1.2676506002282294E30);
    }
}
