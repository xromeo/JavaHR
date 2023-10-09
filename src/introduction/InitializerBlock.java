package introduction;

import java.util.Scanner;

/*
 * 
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B <= 0 or H<= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
 * 
 */

public class InitializerBlock {

    private static int B;
    private static int H;


    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt(); 
        H = scan.nextInt(); 
        try{
            if(B <= 0 || H <= 0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        scan.close();
    }


    public static void main(String[] args) {
        if(B > 0 && H > 0){
            int area = B * H;
            System.out.println(area);
        }

    }

}
