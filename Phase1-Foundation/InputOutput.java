import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Input  = Getting data FROM the user (keyboard).
        // Output = Showing data TO the user (console).

        // ---------------------------------------------------------
        // OUTPUT
        // ---------------------------------------------------------

        /*
         * 1. System.out.print()
         *    Prints text WITHOUT moving to a new line after.
         *
         * 2. System.out.println()
         *    Prints text AND moves to a new line after.
         *
         * 3. System.out.printf()
         *    Prints FORMATTED text using format specifiers (like C's printf).
         *    Common specifiers:
         *      %d -> integer
         *      %f -> floating point (double/float)
         *      %s -> string
         *      %c -> character
         *      %n -> newline (preferred over \n for cross-platform safety)
         */

        System.out.print("Hello ");
        System.out.print("World"); // stays on same line
        System.out.println(); // move to next line manually

        System.out.println("This is println - moves to next line automatically");

        int age = 21;
        double price = 99.5;
        System.out.printf("Age: %d, Price: %.2f%n", age, price); // %.2f = 2 decimal places

        // ---------------------------------------------------------
        // INPUT (using Scanner)
        // ---------------------------------------------------------

        /*
         * Scanner is a class from java.util used to read input from
         * the keyboard (System.in).
         *
         * Steps:
         * 1. Import java.util.Scanner
         * 2. Create object: Scanner sc = new Scanner(System.in);
         * 3. Use methods to read data:
         *      sc.nextInt()     -> reads an int
         *      sc.nextDouble()  -> reads a double
         *      sc.next()        -> reads a single word (String, no spaces)
         *      sc.nextLine()    -> reads a full line (String, with spaces)
         *      sc.nextBoolean() -> reads a boolean
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads full line including spaces

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt(); // reads only the number

        System.out.print("Enter your height (in ft): ");
        double height = sc.nextDouble();

        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + userAge);
        System.out.println("Height: " + height + " ft");

        /*
         * IMPORTANT PITFALL: nextInt()/nextDouble() + nextLine()
         *
         * nextInt() and nextDouble() only read the NUMBER, they leave
         * the leftover newline ("\n") in the input buffer.
         *
         * If you call nextLine() right after nextInt(), it will read
         * that leftover empty newline instead of waiting for new input,
         * making it seem like the input was "skipped".
         *
         * Fix: Add an extra sc.nextLine() to consume the leftover
         * newline before reading a full line again.
         *
         * Example:
         *   int num = sc.nextInt();
         *   sc.nextLine(); // consumes leftover newline
         *   String text = sc.nextLine(); // now works correctly
         */

        // Always close the scanner when done to release the resource.
        sc.close();
    }
}
