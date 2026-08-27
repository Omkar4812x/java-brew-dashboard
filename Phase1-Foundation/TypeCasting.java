public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting = Converting data from one type to another.

        /*
         * Small Container → byte
         * ↓
         * Bigger Container → short
         * ↓
         * Bigger Container → int
         * ↓
         * Largest Container → long
         */

        /*
         * Types of Casting
         * 1. Widening Casting
         * 
         * Converting a smaller type into a larger compatible type.
         * 
         * byte → short → int → long → float → double
         * 
         * Usually automatic.
         * 
         * 2. Narrowing Casting
         * 
         * Converting a larger type into a smaller compatible type.
         * 
         * double → float → long → int → short → byte
         * 
         * Must usually be done manually.
         */

        /*
         * 5. Widening Casting (Implicit Casting)
         * 
         * Widening means converting from a smaller type to a larger type.
         * 
         * Example:
         * 
         * int number = 100;
         * 
         * 
         * double result = number;
         * 
         * 
         * System.out.println(result);
         * 
         * Output:
         * 
         * 100.0
         * 
         * Java automatically converts:
         * 
         * int → double
         * 
         * No explicit cast is required.
         */

        /*
         * 9. Narrowing Casting (Explicit Casting)
         * 
         * Narrowing means converting a larger type into a smaller type.
         * 
         * Example:
         * 
         * double number = 10.75;
         * 
         * 
         * int result = (int) number;
         * 
         * 
         * System.out.println(result);
         * 
         * Output:
         * 
         * 10
         * 
         * Java does not round the value.
         * 
         * It removes the decimal part.
         * 
         * 10.75 → 10
         * 
         * This is called truncation toward zero.
         */

        /*
         * 17. Type Promotion in Expressions
         * 
         * Java may automatically promote smaller numeric types during calculations.
         * 
         * Example:
         * 
         * byte a = 10;
         * byte b = 20;
         * 
         * 
         * int result = a + b;
         * 
         * Why int?
         * 
         * Because arithmetic operations on byte, short, and char are generally promoted
         * to int.
         * 
         * This will not work:
         * 
         * byte result = a + b;
         * 
         * It gives an error.
         * 
         * Correct:
         * 
         * byte result = (byte) (a + b);
         * 
         * But be careful about overflow.
         * 
         * Example
         * byte a = 100;
         * byte b = 30;
         * 
         * 
         * byte result = (byte) (a + b);
         * 
         * 
         * System.out.println(result);
         * 
         * The mathematical answer is:
         * 
         * 130
         * 
         * But byte range is:
         * 
         * -128 to 127
         * 
         * So the result overflows and becomes:
         * 
         * -126
         * 
         * This is why narrowing must be handled carefully.
         */

        /*
         * | Feature | Widening | Narrowing |
        
         * | Direction | Smaller → larger compatible type | Larger → smaller type |
         * | Automatic? | Usually yes | Usually no |
         * | Explicit cast needed? | No | Yes |
         * | Risk | Precision can sometimes be affected | Data loss / overflow |
         * | Example | `int → double` | `double → int` |
         */
    }
}
