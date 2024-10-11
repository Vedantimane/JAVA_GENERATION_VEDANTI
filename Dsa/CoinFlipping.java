import java.util.Random;
import java.util.Scanner;

public class CoinFlipping {
    public static void main(String[] args) {
        int user_score = 0; // User's score
        int computer_score = 0; // Computer's score
        Random random = new Random(); // Random instance for generating computer's prediction
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? "); // Scanner for user input
        String name= scanner.nextLine();
        

        for (;;)
         { 
            System.out.println("Enter your value (0 or 1):");
            int user_prediction = scanner.nextInt(); // User input
            scanner.close(); 
            // Generate computer's prediction (0 or 1)
            int computer_prediction = random.nextInt(2);
            System.out.println("Computer prediction: " + computer_prediction); // Display computer's prediction

           
            if (user_prediction == computer_prediction) 
            {
                System.out.println(name+" got the point!");
                user_score++; //
            } else {
                System.out.println("Computer got the point!");
                computer_score++; // 
            }

            
            System.out.println("Score of "+name+" " + user_score + " | Score of Computer: " + computer_score);

            // Check for a winner
            if (user_score >= 5) {
                System.out.println("User is the winner!");
                break; // Exit the loop if user wins
            } else if (computer_score >= 5) {
                System.out.println("Computer is the winner!");
                break; // Exit the loop if computer wins
            } else {
                System.out.println("Continue to play.");
            }
        }

        
    }
}
