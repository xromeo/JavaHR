package bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.

Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer, n (the number to be checked).

Constraints

n contains at most 100 digits.
Output Format

If n is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
Explanation

The only positive divisors of  are  and , so we print prime.
 * 
 */

public class PrimalityTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        BigInteger bi = new BigInteger(n);
        if(bi.isProbablePrime(50)){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
