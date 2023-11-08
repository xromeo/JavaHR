package datastructures;
/*
 * 
 * We define the following:

A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. For example, if array = [1,2,3], then the subarrays are [1], [2], [3], [1,2], [2,3], and [1,2,3]. Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.

Given an array of n integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, n, denoting the length of array A=[a0, a1, ... , an-1].
The second line contains n space-separated integers describing each respective element, ai, in array A.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        String[] list = bufferedReader.readLine().split(" ");

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(list[i]);
        }

        int count = countNegative(n, array);

        System.out.println(count);
    }

    private static int countNegative(int n, int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0)
                count++;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int sum = array[i];
            int k = 1;
            while (k < n ) {
                sum += array[i + k];
                k++;
                if (sum < 0) {
                    count++;
                }
            }
            n--;
        }
        return count;
    }
}
