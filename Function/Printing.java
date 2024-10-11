package Function;

import java.util.Scanner;

public class Printing {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.next();
        console.nextLine(); 

        
        printNameCharacters(name);
        printNameLength(name);
        System.out.println("Enter you Full Name");
        String Full_Name = console.nextLine();
        printFullNameCharacters(Full_Name);
        printFullName(Full_Name);
        
        console.close();
    }

    private static void printNameLength(String name) {
        System.out.println();
        System.out.println("The length of your name is: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.println("The characters in your name are: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            System.out.print(" | ");
        }
    }
    private static void printFullName(String Full_Name){
        System.out.println();
        System.out.println("The length of your name is: " + Full_Name.length());
        
    }
    private static void printFullNameCharacters(String Full_Name) {
        System.out.println("The characters in your name are: ");
        for (int i = 0; i <Full_Name.length(); i++) {
            System.out.print(Full_Name.charAt(i));
            System.out.print(" | ");
        }

}
}
