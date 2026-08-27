package Array;

public class Count_Occurrences {
    public static void main(String[] args) {
        int[] a = { 10, 20, 10, 30, 10, 40, 20 };
        int target = 10;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                count++;
            }
        }
        System.out.println("Target Occurrences is : " + count);
    }
}
