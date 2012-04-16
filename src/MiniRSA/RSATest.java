/**
 * 
 */
package MiniRSA;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author michaelpato
 *
 */
public class RSATest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test method for {@link MiniRSA.RSA#GCD(long, long)}.
     */
    @Test
    public void testGCD() {
        
        RSA testRSA = new RSA();
        
        assertEquals(4, testRSA.GCD(12, 8));
        assertEquals(4, testRSA.GCD(8, 12));
        assertEquals(8, testRSA.GCD(8, 400));
        assertEquals(1500, testRSA.GCD(39000, 4500));
        
        
    }

    /**
     * Test method for {@link MiniRSA.RSA#coprime(int)}.
     */
    @Test
    public void testCoprime() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link MiniRSA.RSA#endecrypt(long, long, int)}.
     */
    @Test
    public void testEndecrypt() {
        fail("Not yet implemented");
    }


    /**
     * Test method for {@link MiniRSA.RSA#mod_inverse(long, long)}.
     */
    @Test
    public void testMod_inverse() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link MiniRSA.RSA#modulo(long, long, long)}.
     */
    @Test
    public void testModulo() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link MiniRSA.RSA#totient(long)}.
     */
    @Test
    public void testTotient() {
        fail("Not yet implemented");
    }

}
