package Array;

public class EvenOdd {
    public static void main(String[] args) {
        int a[] = { 10, 56, 23, 84, 25, 79, 91, 35, 20 };
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("Even Count is : " + evencount);
        System.out.println("Odd Count is : " + oddcount);
    }
}
