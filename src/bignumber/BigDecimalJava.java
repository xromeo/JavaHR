package bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g., 0.1 ~ 0.1), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

The first line consists of a single integer, n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of Si.

 */

public class BigDecimalJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++)
            s[i] = scan.next();
        scan.close();

        Arrays.sort(s,0, n, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                return bd2.compareTo(bd1);
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++)
            s[i] = scan.next();
        scan.close();

        Arrays.sort(s, 0, n, (Comparator<Object>) (s1, s2) -> {
            BigDecimal bd1 = new BigDecimal((String) s1);
            BigDecimal bd2 = new BigDecimal((String) s2);
            return bd2.compareTo(bd1);
        });

        for (int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    
    }
}
