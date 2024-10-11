import java.util.Scanner;

public class printing {
    public static void main(String[] args) {

        System.out.println("element of array");

        Scanner scanner = new Scanner(System.in);
        int[] array= new int[10];

        for(int v=0; v<array.length;v++)
        {
            System.out.println("Enter number " + (v + 1) + ":");
            int num = scanner.nextInt();
            array[v] = num;

        }

        scanner.close();

        System.out.println("You entered the following numbers:");

        for(int i= 0; i<array.length;i++)
        {
            System.out.print(array[i]+" | ");
        }
  
    }
    
}
