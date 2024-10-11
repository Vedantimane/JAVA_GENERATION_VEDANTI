package Arrays;

import java.util.Arrays;

public class allTypesOfArray {
   
    public static void main(String[] args) {

        // Declare and initialize an int array
        int[] intArray = {1, 2, 3, 4, 5};

        // Declare and initialize a float array
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        // Declare and initialize a double array
        double[] doubleArray = {10.5, 20.5, 30.5, 40.5, 50.5};

        // Declare and initialize a char array
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        // Declare and initialize a boolean array
        boolean[] booleanArray = {true, false, true, false, true};

        // Declare and initialize a String array
        String[] stringArray = {"Hello", "World", "Java", "Arrays", "Demo"};

        // Print the arrays using Arrays.toString()
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Float Array: " + Arrays.toString(floatArray));
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Character Array: " + Arrays.toString(charArray));
        System.out.println("Boolean Array: " + Arrays.toString(booleanArray));
        System.out.println("String Array: " + Arrays.toString(stringArray));
    }
}
