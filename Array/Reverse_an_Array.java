package Array;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        System.out.println("Befour");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("After");
        int first = 0;
        int last = a.length - 1;

        while (first < last) {

            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;

            first++;
            last--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
