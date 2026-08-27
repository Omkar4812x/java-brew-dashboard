package Array;

public class Sum_Positive_Negative_Numbers {
    public static void main(String[] args) {
        int[] a = { 10, -5, 20, -8, 15, -3 };
        int psum = 0;
        int nsum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                psum = psum + a[i];
            } else {
                nsum = nsum + a[i];
            }
        }
        System.out.println("Positive sum is : " + psum);
        System.out.println("Negative sum is " + nsum);
    }
}
