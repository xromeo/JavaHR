package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
 */
public class IfElse {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N % 2 == 0) {
                if (N >= 2 && N < 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                } else if (N > 20) {
                    System.out.println("Not Weird");
                }
            }
        }

        bufferedReader.close();
    }
}
