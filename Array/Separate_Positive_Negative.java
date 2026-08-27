package Array;

public class Separate_Positive_Negative {
    public static void main(String[] args) {
        int[] a = { 10, -5, 20, -8, 15, -3 };
        System.out.println("Positive : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Negative : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
