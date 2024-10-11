package Control_Flow;

import java.util.Scanner;

public class MovieDiscount {

   
    public static float CalculateDiscount(int ticket, int discountPercentage) {
        return (ticket*discountPercentage)/100;
    }

    public static void main(String[] args) {
        int ticket = 7;  
        float discountTicket;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 5) {
            
            int discount = 60;
            discountTicket = CalculateDiscount(ticket, discount);
            System.out.println("You get a 60% discount. Your ticket price is: " + discountTicket + " Euros.");
        } 
        else if (age > 60) {
          
            int discount = 55;
            discountTicket = CalculateDiscount(ticket, discount);
            System.out.println("You get a 55% discount. Your ticket price is: " + discountTicket + " Euros.");
        } 
        else {
            
            System.out.println("No discount applicable. Your ticket price is: " + ticket + " Euros.");
        }

        
    }
}
