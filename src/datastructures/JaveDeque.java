package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();

You can find more details about Deque here.

In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size M.

Note: Time limit is 3 second for this problem.

Input Format

The first line of input contains two integers N and M: representing the total number of integers and the size of the subarray, respectively. The next line contains N space separated integers.

Constraints

1<= N <= 100000
1<= M <= 100000
M<=N

The numbers in the array will range between [0,10000000].

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size M.

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3

 * 
 */
public class JaveDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                int removed = deque.poll();
                int count = map.get(removed);
                if (count > 1) {
                    map.put(removed, count - 1);
                } else {
                    map.remove(removed);
                }
            }

            if (deque.size() == m) {
                max = Math.max(map.size(), max);
            }
        }

        System.out.println(max);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (deque.size() == m + 1) {
                int firstEle = deque.poll();
                if (map.get(firstEle) > 1) {
                    map.put(firstEle, map.get(firstEle) - 1);
                } else {
                    map.remove(firstEle);
                }

            }

            if (deque.size() == m) {
                max = Math.max(max, map.size());
            }
        }

        System.out.println(max);
    }
}
