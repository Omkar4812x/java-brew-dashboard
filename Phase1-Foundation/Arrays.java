public class Arrays {
    public static void main(String[] args) {
        // An array is a collection of multiple values of the same data types, stored
        // under one variable name.

        /*
         * Arrays allow us to:
         * 
         * Store multiple values
         * Process data using loops
         * Search for values
         * Sort values
         * Calculate max/min
         * Perform matrix operations
         */

        /*
         * How Arrays Work
         * 
         * An array has:
         * 
         * Array name
         * Indexes
         * Values
         * Fixed size
         * 
         * Example:
         * 
         * int[] numbers = {10, 20, 30, 40, 50};
         * 
         * Internally, think of it like this:
         * 
         * numbers
         * 
         * 
         * Index: 0 1 2 3 4
         * +------+------+------+------+------+
         * Value: | 10 | 20 | 30 | 40 | 50 |
         * +------+------+------+------+------+
         * 
         * Access:
         * 
         * numbers[0]; // 10
         * numbers[2]; // 30
         * numbers[4]; // 50
         */

        /*
         * Core Concept: Array Declaration
         * 
         * There are several ways to create an array.
         * 
         * Method 1 — Declaration Only
         * int[] numbers;
         * 
         * Here, we only declare the reference.
         * 
         * Method 2 — Create Array with a Fixed Size
         * int[] numbers = new int[5];
         * 
         * This creates space for 5 integers.
         * 
         * Initially:
         * 
         * Index: 0 1 2 3 4
         * Value: 0 0 0 0 0
         * 
         * Because the default value of int array elements is 0.
         * 
         * Method 3 — Direct Initialization
         * int[] numbers = {10, 20, 30, 40, 50};
         * 
         * Java automatically determines the size.
         */

        /*
         * | Feature | Normal `for` | Enhanced `for` |
         * | ------------------------- | ------------ | -------------- |
         * | Index available | Yes | No |
         * | Easy to read | Good | Very good |
         * | Modify by index | Yes | No |
         * | Best for simple traversal | Good | Excellent |
         * | Reverse traversal | Yes | No directly |
         */

        /*
         * | Feature | Array | ArrayList |
         * | -------------------------- | ------------------- | -----------------------
         * |
         * | Size | Fixed | Dynamic |
         * | Stores primitives directly | Yes | No, uses wrapper types |
         * | Syntax | `int[]` | `ArrayList<Integer>` |
         * | Built-in operations | Limited | Many methods |
         * | Access by index | O(1) | O(1) typically |
         * | Best when | Size is known/fixed | Size changes frequently |
         */
    }
}
