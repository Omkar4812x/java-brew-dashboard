import java.util.*;

class Variables {
    public static void main(String args[]) {
        // A variable is a named location used to store data in a program

        // variable = Name + Data Type + Value

        int age = 23;

        // syntax
        // Datatype variable_name = value;

        // variables we can store in camelCase

        // int 1age; // Cannot start with number
        // int student age; // Spaces not allowed
        // int class; // Java keyword

        // Java naming Conversion

        // User camelCase

        int studentAge;
        double accountBalance;
        boolean isUserLoggedIn;

        // There are two types of variables 1.Primitive and 2. References

        // Java has 8 primitive datat types

        // int char byte short long double float boolean

        /*
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         */

        // Premitive vs Non-Premitive

        /*
         * Primitive
         * 
         * Stores simple actual values.
         * 
         * int age = 22;
         * double salary = 50000.50;
         * char grade = 'A';
         * boolean isActive = true;
         * Non-Primitive
         * 
         * Stores references to objects.
         * 
         * Examples:
         * 
         * String name = "Omkar";
         * int[] numbers = {10, 20, 30};
         */

        /*
         * For now:
         * 
         * Primitive = basic value
         * Non-primitive = object/reference type
         */

        /*
         * 1.byte -> used for small integer values
         * 
         * memory - 1 byte
         * 
         * 
         * 2. short -> sotes slightly large whole numbers.
         * 
         * memory - 2 bytes
         * 
         * 3. int -> int is the default choice for normal whole numbers.
         * 
         * memory -> 4 bytes
         * 
         * 4. long -> Used for very large whole numbers.
         * 
         * memory -> 8 bytes
         * 
         * 5. float -> Used for decimal numbers.
         * 
         * memory -> 4 bytes
         * 
         * 6. double ->Used for decimal Values
         * 
         * memory -> 8 bytes
         * 
         * 7. char -> Stores one single characters
         * 
         * memory -> 2 bytes
         * 
         * 8. boolean -> stores only true false
         * 
         * 
         */

        /*
         * | Type | Example | Size |
        ----------------------------------------------------------------------------------
         * | `byte` | `100` | 1 byte |
         * | `short` | `30000` | 2 bytes |
         * | `int` | `100000` | 4 bytes |
         * | `long` | `10000000000L` | 8 bytes |
         * | `float` | `10.5F` | 4 bytes |
         * | `double` | `10.5` | 8 bytes |
         * | `char` | `'A'` | 2 bytes |
         * | `boolean` | `true` | JVM-dependent; don't rely on a fixed memory size for
         * Java language-level reasoning |
         */

        //Instance variables receive default values automatically, but local variables must be initialized before use.

        

    }
}