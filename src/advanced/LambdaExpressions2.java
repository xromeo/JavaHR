package advanced;

import java.util.Scanner;

/*
 This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:

1 PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
2 PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
3 PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.

Input Format

Input is handled for you by the locked stub code in your editor.

Output Format

The locked stub code in your editor will print T lines of output.

Sample Input

The first line contains an integer, T (the number of test cases).

The T subsequent lines each describe a test case in the form of 2 space-separated integers:
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome). The second integer denotes the number to be checked.

5
1 4
2 5
3 898
1 3
2 12
Sample Output

EVEN
PRIME
PALINDROME
ODD
COMPOSITE
 */

// The interface PerformOperation is in LambdaExpressions
interface PerformOperation2 {
    boolean check(int a);
}

public class LambdaExpressions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        PerformOperation isOdd = new PerformOperation() {
            @Override
            public boolean check(int number) {
                return isOddNumber(number);
            }
        };

        PerformOperation isPrime = new PerformOperation() {
            @Override
            public boolean check(int number) {
                return isPrimeNumber(number);
            }
        };

        PerformOperation isPalindrome = new PerformOperation() {
            @Override
            public boolean check(int number) {
                return isPalindromeNumber(number);
            }
        };

        for (int i = 0; i < t; i++) {
            int type = scanner.nextInt();
            int num = scanner.nextInt();

            if (type == 1) {
                System.out.println(isOdd.check(num) ? "ODD" : "EVEN");
            } else if (type == 2) {
                System.out.println(isPrime.check(num) ? "PRIME" : "COMPOSITE");
            } else if (type == 3) {
                System.out.println(isPalindrome.check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }

        scanner.close();
    }

    private static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPalindromeNumber(int number) {
        String numStr = String.valueOf(number);
        int i = 0, j = numStr.length() - 1;
        while (i < j) {
            if (numStr.charAt(i) != numStr.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
