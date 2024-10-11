import java.util.Scanner;

public class prime {
    
     

    public static void main(String[] args) {
        int number;
       
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = scanner.nextInt();
        scanner.close();

        if(number ==0 || number==1){
            System.out.println(number+" number is not prime");
        }
        else if (primeNumber(number)) {
            System.out.println(number+ " is prime");
            
        }else{
            System.out.println(number+ " not prime number");
        }

        
            }

            public static boolean primeNumber(int number) {
                for(int i = 2; i < number; i++) {  // Check divisibility from 2 to number-1
                    if(number % i == 0) {
                        return false;  // Not a prime number if divisible by any i
                    }
                }
                return true;  
        }
    
}

