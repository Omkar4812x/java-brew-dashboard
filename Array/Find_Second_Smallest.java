package Array;

public class Find_Second_Smallest {
    public static void main(String[] args) {
        int[] a = { 10, 50, 20, 40, 30 };

        int min = a[0];
        int secmin = a[1];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secmin = min;
                min = a[i];

            } else if (a[i] < secmin && a[i] != min) {
                secmin = a[i];
            }
        }

        System.out.println("Second min is : " + secmin);
    }
}
