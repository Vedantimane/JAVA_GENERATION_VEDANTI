package Arrays;
import java.util.Arrays;

public class arrayDclearation {
    static int[] array1;  // Make it static so main can access it

    public static void main(String[] args) {
        System.out.println("Hello");
        
        // Initialize and assign values to array1
        array1 = new int[10];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;
        array1[5] = 60;
        array1[6] = 70;
        array1[7] = 80;
        array1[8] = 90;
        array1[9] = 100;

        // Print the array
        System.out.println(Arrays.toString(array1));
    }
}
