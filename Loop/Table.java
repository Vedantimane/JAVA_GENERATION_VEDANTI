//package Loop;


import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int limit;
        
        System.out.println("Enter any positive integer: ");
        limit = console.nextInt();
        console.close();;
                
        System.out.println("Multiplication Table of " + limit);
        
       //TODO implement While loop to get print result
       int Multiplicant = 1;
       while(Multiplicant<=limit)
       {
       int Multiplier =1;
       while (Multiplier<=10) 
       {
        int product = Multiplicant*Multiplier;
        System.out.println(Multiplicant+ " * "+Multiplier+" = "+product);
        Multiplier++;
       }
     Multiplicant++;
       }
    }
    
}