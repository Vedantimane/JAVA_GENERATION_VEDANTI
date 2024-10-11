import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        int number;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number");
        number = scanner.nextInt();
        scanner.close();
        if (palindromeNumber(number)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        

        
    }

    public static boolean palindromeNumber(int number){

        int original_number=number;
        int digit=0;
        
        int reminder;
        
        while (number!=0) {
            
        reminder = number%10;
        digit= (digit*10)+reminder;
        number=number/10;
        

        
        }
        return digit==original_number;
        
    }
    
    
}
