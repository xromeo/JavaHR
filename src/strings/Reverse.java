package strings;

import java.util.Scanner;

/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

Sample Input
madam

Sample Output
Yes
 */
public class Reverse {

    public static String reverse(String s){

        char[] array = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            char aux = array[i];
            int r = n - i - 1;
            array[i] = array[r];
            array[r] = aux;
        }        
        return new String(array);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reverse = reverse(A);
        System.out.println(reverse);
        if(A.equals(reverse)){
        System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
