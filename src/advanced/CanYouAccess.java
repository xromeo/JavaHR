package advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer num as input. The powerof2 in class Inner.Private checks whether a number is a power of 2. You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.

Constraints

1<= num <= 2^30

Sample Input

8
Sample Output

8 is power of 2
An instance of class: Solution.Inner.Private has been created
 */
public class CanYouAccess {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;// Must be used to hold the reference of the instance of the class
                 // Solution.Inner.Private

        // Write your code here
        Inner i = new Inner();
        Inner.Private ip = i.new Private();
        o = ip;

        System.out.println(num + " is " + ip.powerof2(num));

        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

    }// end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }// end of Inner

}// end of Solution
