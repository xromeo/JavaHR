package introduction;

/*
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
 * 
 */
import java.util.Scanner;

/**
 * JavaStdinandStdout
 */
public class StdinandStdout2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integerValue = scanner.nextInt();
        
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);

        scanner.close();
    }
}