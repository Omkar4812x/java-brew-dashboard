package Array;

public class Find_Missing_Number {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 6 };
        int sum = 0;
        int asum = 0;
        for (int i = 0; i <= a.length; i++) {
            sum = sum + (i + 1);
        }
        for (int i = 0; i < a.length; i++) {
            asum = asum + a[i];
        }
        System.out.println("Missing elemnt is : " + (sum - asum));

    }
}
