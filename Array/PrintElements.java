package Array;

import java.util.*;

// Print All Elements — Given an integer array, print every element.
// Easy
// Input: [10,20,30] → Output: 10 20 30
// Use a for loop or enhanced for.
public class PrintElements {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many elements you store : ");
        int n = obj.nextInt();

        System.out.println("Enter Array elements : ");
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {

            a[i] = obj.nextInt();
        }
        System.out.println("Displayed Array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
