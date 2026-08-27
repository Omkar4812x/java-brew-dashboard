package Array;

public class Remove_Duplicate_Elements {
    public static void main(String[] args) {
        int[] a = { 10, 20, 10, 30, 20, 40 };
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(a[i] + " ");
            }
        }
    }
}
