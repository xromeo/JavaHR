package strings;

import java.util.LinkedList;
import java.util.List;

/*
 We define the following terms:

 A < B < ... < Y < Z < a < b ... < y < z

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
  
 */

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {        
        int start = 0;
        String smallest = s.substring(start, k);
        String largest = s.substring(start, k);
        while ((start + k) <= s.length()) {
            String temp = s.substring(start, start + k);
            smallest = (smallest.compareTo(temp) > 0) ? temp : smallest;
            largest = (largest.compareTo(temp) < 0) ? temp : largest;
            start++;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcomejava", 3));
    }
}
