// Lab11astv100.java
// Janee Yeak
// 30 January 2021
// this program computes all the prime numbers between 1 and whatever number the user
// inputs as the max. This also uses the decimal format.
// This is the "Sieve of Eratosthenes" Program.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab11astv100
{
	public static void main(String[] args) 
	{
		System.out.println("\nLab11a\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
		boolean[] primes = new boolean[MAX];
      
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean[] primes)
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
      
      for ( int a = 2; a < primes.length; a++)
      {
         primes[a] = true;
      }
      
      for( int b = 2; b < primes.length; b++)
      {
            if(primes[b] == true) 
            {
               for( int c = 2; c < (primes.length / 2); c++)
               {
                  int bc = c * b;
                  
                  if (bc < primes.length)
                  {
                     primes[bc] = false;
                  }
                     
               }

            }  
      }     
   }
     
	public static void displayPrimes(boolean[] primes)
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
      
      for( int d = 2; d < primes.length; d++)
      {
         if(primes[d] == true)
         {
            String pattern = "0000";
            DecimalFormat pattern123 = new DecimalFormat(pattern);
            System.out.println(pattern123.format(d));     
         }
      }

	}

}
