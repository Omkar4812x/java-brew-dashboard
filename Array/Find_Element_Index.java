package Array;

public class Find_Element_Index {
    public static void main(String[] args) {
        int[] a = { 10, 56, 23, 84, 25, 79, 91, 35, 20 };
        int target = 35;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                found = true;
                System.out.println("Index : " + i);
                break;
            }

        }
        if (!found) {
            System.out.println("Index : -1");
        }
    }
}
