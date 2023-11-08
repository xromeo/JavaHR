package datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 For this problem, we have 2 types of queries you can perform on a List:

Insert y at index x:

Insert
x y
Delete the element at index x:

Delete
x

Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from L.
Constraints
1<=N<=4000
1<=Q<=4000


Each element in is a 32-bit integer.
Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
 * 
 */

public class JavaList {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(bufferedReader.readLine());

        String[] array = bufferedReader.readLine().split(" ");

        List<String> L = new ArrayList<>(Arrays.asList(array));

        int Q = Integer.valueOf(bufferedReader.readLine());

        for (int i = 0; i < Q; i++) {
            String query = bufferedReader.readLine();
            if(query.contains("Insert")){
                String line = bufferedReader.readLine().trim();
                String[] values = line.split(" ");
                int x = Integer.parseInt(values[0]);
                String y = values[1];
                L.add(x, y);
            }
            if(query.contains("Delete")){
                String line = bufferedReader.readLine();
                int x = Integer.parseInt(line.trim());
                L.remove(x);
            }
        }
        
        for (String value : L) {
            System.out.print(value);
            System.out.print(" ");
        }        
    }
}
