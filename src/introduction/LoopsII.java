package introduction;

import java.util.Scanner;

/*
 * We use the integers a, b, and n to create the following series:
 * 
 
 (a+2⁰b),(a+2⁰b+2¹b),...

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
 */

public class LoopsII {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int s = 0; s < n; s++) {

                int t = a;

                for (int d = 0; d < s + 1; d++) {
                    t += Math.pow(2, d) * b;
                }

                System.out.print(t + " ");
            }
            System.out.println();
        }
        in.close();

    }
}
