//package Loop;

public class LoopExamples {
    public static void main(String[] args) {
        System.out.println("While loop");
        
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        System.out.println("For loop");
        for (int f = 1; f <= 5; f++) {
            System.out.println("Iteration: " + f);
        }

        System.out.println("Do-While loop");
        
        int d = 1;  // Corrected variable
        do {
            System.out.println("Iteration: " + d);
            d++;  // Incrementing 'd' here
        } while (d <= 5);  // Condition checking for 'd'
    }
}
