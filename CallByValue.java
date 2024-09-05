// Java Always Call by Value

import java.util.*;
public class CallByValue {

    /*
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is = " + a);
        System.out.println("b is = " + b);

    } */

   // Product of a and b
   /*
   public static int product(int a, int b){
        int product = a * b;
        return product;
   } */

    // Factorial
    
    public static int factorial(int n){

        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    } 

    // Binomial coficient of nCr
    /*
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomial = fact_n / (fact_r * fact_nmr);
        return binomial;
    }
    */

   // Function overloading
    /*
   public static int overloading(int a, int b){
        return a + b;
   }

   public static int overloading(int a, int b, int c){
        return a + b + c;
   }
   */
        /*
        // Prime or not?
        public static boolean isPrime(int num){ 
            for(int i=2; i<=num-1; i++){   // Math.sqrt(num) => Optimized way
                if(num % i == 0){
                     return false;
                }
            }
            return true;
        }

        // Print all primes in a range
        public static void primeInRange(int n){
            for(int i=2; i<=n; i++){
                if(isPrime(i)){
                    System.out.println(i + " ");
                }
            }
        }
        */

       // Binary to Decimal number

       public static void biToDec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDgt = binNum % 10;
            decNum = decNum + (lastDgt * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;

        }

        System.out.println("Decimal of " + binNum + " = " + decNum);


       }


    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
       /* int a = scn.nextInt();
        int b = scn.nextInt();
        */

        // int a = 5;
        // int b = 10;

        /* Swap(a, b);
        int result = product(a, b);
        System.out.println("a x b = " + result);
        */

       // factorial
       /*
       int n = scn.nextInt();
       int result = factorial(n);

       System.out.println(result);
       */
        // Factorail of nCr
        /*
        int n = 10;
        int r = 2;

        int result = binomial(n, r);
        System.out.println(result);
        */

       // FUnction overloading
        /*
       System.out.println(overloading(5, 10));
       System.out.println(overloading(5, 10, 15));
       */

        // System.out.println(isPrime(13));
        // primeInRange(16);

        // Decimal to Binary number

        biToDec(111);




        
    }
}