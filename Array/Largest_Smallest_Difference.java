package Array;

public class Largest_Smallest_Difference {
    public static void main(String[] args) {
        int[] a = { 10, 5, 30, 20, 8, 25 };
        int largest = a[0];
        int smallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            } else if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Difference is : " + (largest - smallest));

    }
}
