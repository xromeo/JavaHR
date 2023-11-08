package datastructures;

import java.util.Stack;

/*
 Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0<=i<n), you can perform one of the following moves:

Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
Move Forward:
If cell i+1 contains a zero, you can walk to cell i+1.
If cell i+leap contains a zero, you can jump to cell i+leap.
If you're standing in cell n-1 or the value of i + leap >=n, you can walk or jump off the end of the array and win the game.

In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a . If the destination index is greater than n-1, you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false

Input Format

The first line contains an integer, q, denoting the number of queries (i.e., function calls).
The 2*q subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of n and leap.
The second line contains n space-separated binary integers (i.e., zeroes and ones) describing the respective values of game0, game1,...,gamen-1
Constraints

1 <= q <= 5000
2 <= n <= 100
0 <= leap <= 100

It is guaranteed that the value of game[0] is always 0.
 
Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For game = [0, 0, 0, 0, 0] and leap = 3, we can walk and/or jump to the end of the array because every cell contains a . Because we can win, we return true.
For game = [0 0 0 1 1 1] and leap = 5, we can walk to index 1 and then jump i + leap = 1 + 5 = 6 units to the end of the array. Because we can win, we return true.
For game = [0 0 1 1 1 0] and leap = 3, there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For game = [0,1,0] and leap = 1, there is no way for us to get past the one at index 1. Because we cannot win, we return false.

*/
public class Java1DArrayPart2 {


    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int i, int leap, int[] game) {
        if (i < 0 || game[i] == 1) {
            return false;
        }
        if ((i == game.length - 1) || (i + leap >= game.length)) {
            return true;
        }

        game[i] = 1; // Mark the current cell as visited.

        // Recursively try all possible moves.
        return canWinFrom(i + 1, leap, game) || canWinFrom(i - 1, leap, game) || canWinFrom(i + leap, leap, game);
    }

    public static void main(String[] args) {
        int[] game1 = { 0, 0, 0, 0, 0 };
        int leap1 = 3;
        System.out.println(canWin(leap1, game1)); // Output: YES

        int[] game2 = { 0, 0, 0, 1, 1, 1 };
        int leap2 = 5;
        System.out.println(canWin(leap2, game2)); // Output: YES

        int[] game3 = { 0, 0, 1, 1, 1, 0 };
        int leap3 = 3;
        System.out.println(canWin(leap3, game3)); // Output: NO

        int[] game4 = { 0, 1, 0 };
        int leap4 = 1;
        System.out.println(canWin(leap4, game4)); // Output: NO
    }
}
