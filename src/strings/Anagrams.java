package strings;

import java.util.Arrays;

/*
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
 */

public class Anagrams {
    static boolean isAnagram(String a, String b) {

        char[] arraya = a.toUpperCase().toCharArray();
        char[] arrayb = b.toUpperCase().toCharArray();
        java.util.Arrays.sort(arraya);
        java.util.Arrays.sort(arrayb);

        a = String.valueOf(arraya);
        b = new String(arrayb);

        if(a.equals(b)){
            return true;
        }
        return false;        
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("zoe", "eso"));
        System.out.println(isAnagram("zoe", "ezo"));
    }
}
