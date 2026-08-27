public class Statments {
    public static void main(String[] args) {
        // Statements control the FLOW of a program.
        // By default, Java executes code top-to-bottom, line by line.
        // Control flow statements let us change that order based on
        // conditions or repetition.

        /*
         * Types of Control Flow Statements
         * 
         * 1. Decision Making -> if, if-else, if-else-if, switch
         * 2. Looping         -> for, while, do-while
         * 3. Jump            -> break, continue, return
         */

        // ---------------------------------------------------------
        // 1. if statement
        // Executes a block only if the condition is true.
        // ---------------------------------------------------------
        int age = 20;

        System.out.println("--- if ---");
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // ---------------------------------------------------------
        // 2. if-else statement
        // Executes one block if true, another if false.
        // ---------------------------------------------------------
        System.out.println("\n--- if-else ---");
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        // ---------------------------------------------------------
        // 3. if-else-if ladder
        // Used to check multiple conditions in sequence.
        // Only the FIRST true condition's block runs.
        // ---------------------------------------------------------
        System.out.println("\n--- if-else-if ---");
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // ---------------------------------------------------------
        // 4. switch statement
        // Cleaner alternative to a long if-else-if ladder when
        // checking a single variable against multiple fixed values.
        // ---------------------------------------------------------
        System.out.println("\n--- switch (traditional) ---");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // break exits the switch after a match (without it, execution "falls through")
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // Modern arrow-style switch (Java 14+) — no fall-through, no break needed.
        System.out.println("\n--- switch (arrow style) ---");
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Other day";
        };
        System.out.println(dayName);

        // ---------------------------------------------------------
        // 5. for loop
        // Best used when the number of iterations is known in advance.
        // Syntax: for (initialization; condition; update)
        // ---------------------------------------------------------
        System.out.println("\n--- for loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // ---------------------------------------------------------
        // 6. while loop
        // Best used when the number of iterations is NOT known in
        // advance — it runs as long as the condition stays true.
        // Condition is checked BEFORE each iteration.
        // ---------------------------------------------------------
        System.out.println("\n--- while loop ---");
        int i = 1;
        while (i <= 5) {
            System.out.println("While Count: " + i);
            i++;
        }

        // ---------------------------------------------------------
        // 7. do-while loop
        // Same as while, but the condition is checked AFTER each
        // iteration — so the body always runs at least once.
        // ---------------------------------------------------------
        System.out.println("\n--- do-while loop ---");
        int j = 1;
        do {
            System.out.println("Do-While Count: " + j);
            j++;
        } while (j <= 5);

        // ---------------------------------------------------------
        // 8. break
        // Immediately exits the nearest enclosing loop or switch.
        // ---------------------------------------------------------
        System.out.println("\n--- break ---");
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                break; // stop the loop completely once k reaches 5
            }
            System.out.println("k = " + k);
        }

        // ---------------------------------------------------------
        // 9. continue
        // Skips the current iteration and moves to the next one.
        // ---------------------------------------------------------
        System.out.println("\n--- continue ---");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue; // skip printing when k == 3
            }
            System.out.println("k = " + k);
        }

        /*
         * | Loop      | Condition Checked | Guaranteed 1st Run | Best Use Case                |
         * |-----------|--------------------|---------------------|------------------------------|
         * | for       | Before             | No                  | Known number of iterations   |
         * | while     | Before             | No                  | Unknown iterations, may be 0 |
         * | do-while  | After              | Yes                 | Must run at least once       |
         */
    }
}
