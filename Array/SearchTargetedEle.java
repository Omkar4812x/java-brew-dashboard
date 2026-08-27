package Array;

public class SearchTargetedEle {
    public static void main(String[] args) {
        int[] a = { 10, 56, 23, 84, 25, 79, 91, 35, 20 };

        int target = 79;

        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                found = true;
                System.out.println("Found" + " And index is " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }

}
