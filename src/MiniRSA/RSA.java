package MiniRSA;

import java.util.Random;

public class RSA {
    
    Random r = new Random();
    
    public RSA() {
        
    }
    
    /**
     * using the java.util.Random number generator, pick a random integer that is 
     * coprime to the given input parameter x
     * 
     * @param x
     * @return a random coprime number to x
     */
    long coprime(int x) {
        
        
        return -1;
    }
    
    
    /**
     * given an integet representing an ASCII character value, encrypt is 
     * via the RSA crypto algorithm
     * 
     * @param msg_or_cipher
     * @param key
     * @param c
     * @return
     */
    long endecrypt(long msg_or_cipher, long key, int c) {
        
        return -1;
    }
    
    
    /**
     * Computes the GCD of the two numbers a and b
     * 
     * @param a
     * @param b
     * @return
     */
    long GCD(long a, long b){
        return -1;
    }
    
    
    /**
     * calc the mo inverse base^-1 % m
     * 
     * @param base
     * @param m
     * @return
     */
    long mod_inverse(long base, long m) {
        
        return -1;
    }
    
    
    /**
     * Computes Math.mod(Math.pow(a,b), c) for large valuse of a, b, and c
     * 
     * @param a
     * @param b
     * @param c
     * @return
     */
    long modulo(long a, long b, long c) {
        
        return -1;
    }
    
    
    /**
     * computes Euler's Totient
     * 
     * @param n
     * @return
     */
    long totient(long n) {
        
        return -1;
    }
    
    
    
    
}
