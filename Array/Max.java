package Array;

public class Max {
    public static void main(String[] args) {
        int a[] = { 10, 56, 23, 84, 25, 79, 01, 35, 20 };
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max is : " + max);
    }
}
