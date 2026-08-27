package Array;

public class Find_Second_Largest {
    public static void main(String[] args) {

        int[] a = { 10, 50, 20, 40, 30 };

        int max = a[0];
        int secMax = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];

            } else if (a[i] > secMax && a[i] != max) {
                secMax = a[i];
            }
        }

        System.out.println("Second max is : " + secMax);
    }
}
