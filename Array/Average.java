package Array;

public class Average {
    public static void main(String[] args) {
        int[] a = { 10, 56, 23, 84, 25, 79, 91, 35, 20 };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double avg = (double) sum / a.length;
        System.out.println("Average : " + avg);
    }
}
