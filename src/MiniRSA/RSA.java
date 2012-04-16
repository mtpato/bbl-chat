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
    long coprime(long x) {
        long n = r.nextLong();
        
        while(GCD(x, n) != 1) {
            n = r.nextLong();
        }
        
        return n;
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
     * Computes the GCD of the two numbers a and b.  
     * 
     * @param a
     * @param b
     * @return GCD
     */
    long GCD(long a, long b){
        long low;
        long high;
 
        if(a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
                      
        long mod = high % low;
        
        while(mod != 0) {
            high = low;
            low = mod;
            
            mod = high % low;
        }        
        return low;      
    }
    

    
    /**
     * calc the mod inverse base^-1 % m. this is using brute force 
     * dont understand the better solutions 
     * 
     * @param base
     * @param m
     * @return 0 if there isnt one and the number if there is 
     */
    long mod_inverse(long base, long m) {

        for (int x = 1; x < m; x++) {
            if ((base * x) % m == 1) {
                return x;
            }
        }

        return 0;

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
        return (long) (Math.pow(a, b) % c);
        
        
        
    }
    
    
    /**
     * computes Euler's Totient
     * 
     * @param n
     * @return
     */
    long totient(long n) {
               
        int count = 0; 

        for(int i = 1; i < n; i++) {
            if(GCD(n,i) == 1) {
                count++; 
            }
        }

        return count; 
        
    }
    
    
    
    
}
