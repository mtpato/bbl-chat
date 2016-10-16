package MiniRSA;

import java.math.BigInteger;
import java.util.Random;

public class RSA {
    
    Random r = new Random();
    
    //these are for the key pairs.
    // publicKey(e, c)
    // privateKey(d, c)
    private long c;
    private long e;
    private long d;
    
    public RSA() {
        
    }
    
     void getKeys() {
        long primeA = r.nextInt(100) + 1;
        long primeB = r.nextInt(100) + 1;
        
        //long primeA = 14;//testing
        //long primeB = 18;//testing
        
        while(primeB == primeA) primeB = r.nextInt(100) + 1; // incase they are the same 
        
        long a = getNthPrime(primeA);
        long b = getNthPrime(primeB);
        
        System.out.println("the " + primeA + "th prime is " + a);
        System.out.println("the " + primeB + "th prime is " + b);
        
        c = a * b;
        long m = (a - 1) * (b - 1);
        e = coprime(m);
        //e = 451;//testing
        d = mod_inverse(e, m);
        
        System.out.println("c = " + c );
        System.out.println("m = " + m );
        System.out.println("e = " + e );
        System.out.println("d = " + d );
        System.out.println("Public key = (" + e + ", " + c + ")");
        System.out.println("Private key = (" + d + ", " + c + ")");
        
        
        
    }

    long getNthPrime(long n) {
        long count = 1;
        
        if (n == 1) return 2;
        
        int num = 2;
              
        while(count < n) {
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    i = num;
                } else if (i == num - 1){
                    count ++;
                }
            }
            num++;
       
        }
        
        return num - 1;
    }
    
    /**
     * using the java.util.Random number generator, pick a random integer that is 
     * coprime to the given input parameter x
     * 
     * @param x
     * @return a random coprime number to x
     */
    long coprime(long x) {
        long n = (r.nextLong() % x -1) + 1;
        
        while(GCD(x, n) != 1) {
            n = (r.nextLong() % x - 1) + 1;
            //System.out.println("this is n "+ n);
            
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
        return new Double(Math.pow(msg_or_cipher, (key % c))).intValue();
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
     * calc the mod inverse base^-1 % m. this function was written using 
     * info from http://mathworld.wolfram.com/ModularInverse.html and 
     * http://www.algorithmist.com/index.php/Modular_inverse
     * 
     * @param base
     * @param m
     * @return 
     */
    long mod_inverse(long base, long m) {
        
        long mod = m;
        long result = 0;
        long d = 1;
        
        while (base > 0) {
         long t = mod / base;
         long x = base;
         base = mod % x;
         mod = x;
         x = d;
         d = result - t * x;
         result = x;
        }
        
        
        result = result % m;
        
        if (result < 0){
            result = (result + m) % m;
        }
        
        
        return result;


    }
    
    
    /**
     * Computes Math.mod(Math.pow(a,b), c) for large valuse of a, b, and c
     * 
     * @param a
     * @param b
     * @param c
     * @return
     */
    long modulo(long value, long key, long c) {
        BigInteger bigA = BigInteger.valueOf(value);
        BigInteger bigB = BigInteger.valueOf(key);
        BigInteger bigC = BigInteger.valueOf(c);
        
        Integer i = 9;
        
        bigA.modPow(bigB, bigC);
        return bigA.longValue();
        
        
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

    /**
     * @return the c
     */
    public long getC() {
        return c;
    }

    /**
     * @return the e
     */
    public long getE() {
        return e;
    }

    /**
     * @return the d
     */
    public long getD() {
        return d;
    }
    
    
    
    
}
