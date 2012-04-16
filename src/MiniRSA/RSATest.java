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

    
    RSA testRSA;
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        testRSA = new RSA();
    }

    /**
     * Test method for {@link MiniRSA.RSA#GCD(long, long)}.
     */
    @Test
    public void testGCD() {
        
        
        
        assertEquals(4, testRSA.GCD(12, 8));
        assertEquals(4, testRSA.GCD(8, 12));
        assertEquals(8, testRSA.GCD(8, 400));
        assertEquals(1500, testRSA.GCD(39000, 4500));
        
        
    }

    /**
     * Test method for {@link MiniRSA.RSA#coprime(int)}.
     * 
     */
    @Test
    public void testCoprime() {
        
        assertEquals(1, testRSA.GCD(100, testRSA.coprime(100)));
        assertEquals(1, testRSA.GCD(4, testRSA.coprime(4)));
        assertEquals(1, testRSA.GCD(12321941, testRSA.coprime(12321941)));
        
        
    }


    /**
     * Test method for {@link MiniRSA.RSA#modulo(long, long, long)}.
     */
    @Test
    public void testModulo() {
        
        assertEquals(5, testRSA.modulo(5, 2, 10));
        assertEquals(0, testRSA.modulo(5, 2, 5));
        assertEquals(5, testRSA.modulo(5, 3, 20));
    }
    
    /**
     * Test method for {@link MiniRSA.RSA#mod_inverse(long, long)}.
     */
    @Test
    public void testMod_inverse() {
        assertEquals(1531, testRSA.mod_inverse(451, 2520));
        assertEquals(6, testRSA.mod_inverse(11, 13));
        assertEquals(6, testRSA.mod_inverse(13, 11));
        assertEquals(1, testRSA.mod_inverse(2, 14));
    }

    /**
     * Test method for {@link MiniRSA.RSA#totient(long)}.
     */
    @Test
    public void testTotient() {
        assertEquals(1584, testRSA.totient(2345));
        assertEquals(4, testRSA.totient(12));
        assertEquals(792, testRSA.totient(851));
    }
    
    /**
     * 
     */
    @Test
    public void testGetNthPrime() {
        assertEquals(29, testRSA.getNthPrime(10));
        assertEquals(1553, testRSA.getNthPrime(245));
        assertEquals(193, testRSA.getNthPrime(44));
        assertEquals(43, testRSA.getNthPrime(14));
        assertEquals(2, testRSA.getNthPrime(1));
    }
    
    /**
     * Test method for {@link MiniRSA.RSA#endecrypt(long, long, int)}.
     */
    @Test
    public void testEndecrypt() {
        fail("Not yet implemented");
    }

}
