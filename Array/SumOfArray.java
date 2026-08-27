package Array;

/*Problem
Take N integers from the user and calculate the sum of all array elements.
Example
Input:
5 10 20 30 40 50

Output:
Sum = 150 */

import java.util.Scanner;

public class SumOfArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int a[] = { 10, 56, 23, 84, 25, 79, 01, 35, 20 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum is : " + sum);
    }
}
