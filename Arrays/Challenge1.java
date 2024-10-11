package Arrays;

public class Challenge1 {
    public static void main(String[] args) {
       
        int[] array1 = new int[20]; 
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i; 
        }

        addition(array1);
        System.out.println();
        printArrayIndexes(array1);
        System.out.println();
        printFibonacci(array1);
    }

    public static void addition(int[] array1) {
        int sum = 0; 
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i]; 
        }
        System.out.print("The sum of the array elements (0 to 19) is: " + sum);
    }
    
    public static void printArrayIndexes(int[] array1) {
        System.out.println("Index of Array Elements:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Index: " + i + " | ");
        }
       
    }
 
    public static void printFibonacci(int[] array1) {
        System.out.println("Fibonacci Numbers between 0 and 19:");

    int a = 0, b = 1;

    for (; a <= 19; ) {
        
        if (a >= 0 && a <= 19) {
            System.out.print(a + " ");
        }
        int nextFib = a + b;
        a = b;
        b = nextFib;
    }
    System.out.println();
       
    }
}
