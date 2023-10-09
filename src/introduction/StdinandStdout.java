package introduction;

/*
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
 * 
 */
import java.util.Scanner;

/**
 * JavaStdinandStdout
 */
public class StdinandStdout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        int integer2 = scanner.nextInt();
        int integer3 = scanner.nextInt();
        
        System.out.println(integer);
        System.out.println(integer2);
        System.out.println(integer3);

        scanner.close();
    }
}