package Array;

public class Min {
    public static void main(String[] args) {
        int a[] = { 10, 56, 23, 84, 25, 79, 91, 35, 20 };
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[0] < min) {
                min = a[0];
            }
        }
        System.out.println("Min is : " + min);
    }
}
