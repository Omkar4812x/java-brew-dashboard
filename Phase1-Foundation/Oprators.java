public class Oprators {
    public static void main(String[] args) {
        // Operators are used to perform oprations on variables and values.

        // Operator = symbol that performs an operation.

        /*
         * 5. Types of Operators in Java
         * 
         * The main operators we need in this phase are:
         * 
         * Operator Type Examples
         * Arithmetic + - * / %
         * Relational == != > < >= <=
         * Logical `&&
         * Assignment = += -= *= /= %=
         * Unary ++ -- !
         * Ternary ? :
         * Bitwise & | ^ ~ << >> >>>
         */

        // ---------------------------------------------------------
        // 1. Arithmetic Operators -> + - * / %
        // Used to perform basic mathematical operations.
        // ---------------------------------------------------------
        int a = 10, b = 3;

        System.out.println("--- Arithmetic ---");
        System.out.println("a + b = " + (a + b)); // 13 (Addition)
        System.out.println("a - b = " + (a - b)); // 7 (Subtraction)
        System.out.println("a * b = " + (a * b)); // 30 (Multiplication)
        System.out.println("a / b = " + (a / b)); // 3 (Integer division -> decimal part dropped)
        System.out.println("a % b = " + (a % b)); // 1 (Modulus -> remainder)

        // Note: If either operand is double, division gives decimal result.
        double result = 10.0 / 3;
        System.out.println("10.0 / 3 = " + result); // 3.333...

        // ---------------------------------------------------------
        // 2. Relational (Comparison) Operators -> == != > < >= <=
        // Used to compare two values. Always returns boolean (true/false).
        // ---------------------------------------------------------
        System.out.println("\n--- Relational ---");
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b  : " + (a > b));  // true
        System.out.println("a < b  : " + (a < b));  // false
        System.out.println("a >= b : " + (a >= b)); // true
        System.out.println("a <= b : " + (a <= b)); // false

        // ---------------------------------------------------------
        // 3. Logical Operators -> && (AND) || (OR) ! (NOT)
        // Used to combine multiple boolean conditions.
        // ---------------------------------------------------------
        boolean isAdult = true;
        boolean hasID = false;

        System.out.println("\n--- Logical ---");
        System.out.println("isAdult && hasID : " + (isAdult && hasID)); // false (both must be true)
        System.out.println("isAdult || hasID : " + (isAdult || hasID)); // true (at least one true)
        System.out.println("!isAdult         : " + (!isAdult));         // false (reverses the value)

        // Short-circuit behavior:
        // && stops checking if the first condition is already false.
        // || stops checking if the first condition is already true.

        // ---------------------------------------------------------
        // 4. Assignment Operators -> = += -= *= /= %=
        // Used to assign and update variable values.
        // ---------------------------------------------------------
        int x = 10;
        System.out.println("\n--- Assignment ---");
        x += 5; // x = x + 5
        System.out.println("x += 5  -> " + x); // 15
        x -= 3; // x = x - 3
        System.out.println("x -= 3  -> " + x); // 12
        x *= 2; // x = x * 2
        System.out.println("x *= 2  -> " + x); // 24
        x /= 4; // x = x / 4
        System.out.println("x /= 4  -> " + x); // 6
        x %= 4; // x = x % 4
        System.out.println("x %= 4  -> " + x); // 2

        // ---------------------------------------------------------
        // 5. Unary Operators -> ++ -- !
        // Operates on a single operand.
        // ---------------------------------------------------------
        int count = 5;
        System.out.println("\n--- Unary ---");
        System.out.println("count++ (post) : " + (count++)); // prints 5, then count becomes 6
        System.out.println("count after post++ : " + count); // 6
        System.out.println("++count (pre)  : " + (++count)); // count becomes 7, then prints 7
        System.out.println("count--        : " + (count--)); // prints 7, then count becomes 6
        System.out.println("--count        : " + (--count)); // count becomes 5, then prints 5

        // Pre vs Post:
        // Pre (++x)  -> increments first, then uses the value.
        // Post (x++) -> uses the value first, then increments.

        // ---------------------------------------------------------
        // 6. Ternary Operator -> condition ? valueIfTrue : valueIfFalse
        // Shortcut for simple if-else.
        // ---------------------------------------------------------
        int num = 7;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("\n--- Ternary ---");
        System.out.println(num + " is " + type); // 7 is Odd

        // ---------------------------------------------------------
        // 7. Bitwise Operators -> & | ^ ~ << >> >>>
        // Works directly on the binary (bit-level) representation of numbers.
        // ---------------------------------------------------------
        int p = 5;  // binary: 0101
        int q = 3;  // binary: 0011

        System.out.println("\n--- Bitwise ---");
        System.out.println("p & q  = " + (p & q));  // 1  -> AND: 1 only if both bits are 1
        System.out.println("p | q  = " + (p | q));  // 7  -> OR: 1 if at least one bit is 1
        System.out.println("p ^ q  = " + (p ^ q));  // 6  -> XOR: 1 if bits are different
        System.out.println("~p     = " + (~p));     // -6 -> NOT: inverts all bits
        System.out.println("p << 1 = " + (p << 1)); // 10 -> Left shift: multiplies by 2 per shift
        System.out.println("p >> 1 = " + (p >> 1)); // 2  -> Right shift: divides by 2 per shift (keeps sign)
        System.out.println("p >>> 1 = " + (p >>> 1)); // 2 -> Unsigned right shift: fills with 0 regardless of sign
    }
}
