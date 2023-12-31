package datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly 6 lines, each containing 6 integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

The hourglass which has the largest sum is:

2 4 4
  2
1 2 4
 */

public class Java2DArray {

    private static int hourglasses(List<List<Integer>> array){

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.size() - 1; i++) {
            for (int j = 1; j < array.size() - 1; j++) {
                int sum = array.get(i).get(j) +
                          array.get(i - 1).get(j-1) +
                          array.get(i - 1).get(j) +  
                          array.get(i - 1).get(j + 1) +  
                          array.get(i + 1).get(j - 1) +  
                          array.get(i + 1).get(j) +  
                          array.get(i + 1).get(j + 1);
                max = Math.max(max, sum);
            }
        }

        return max;
    }
/*
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();

        System.out.println(hourglasses(arr));
    }

    */

    public static void main(String[] args) {
        System.out.println(hourglasses(List.of(
            List.of(1,1,1,0,0,0),
            List.of(0,1,0,0,0,0),
            List.of(1,1,1,0,0,0),
            List.of(0,0,2,4,4,0),
            List.of(0,0,0,2,0,0),
            List.of(0,0,1,2,4,0)
        )));
    }
}
