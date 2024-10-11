import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

//initialize the array named as searchArray
        Scanner scanner = new Scanner(System.in);
        int[] searchArray= new int[10];

//taking array element from user 
        for(int v=0; v<searchArray.length;v++)
        {
            System.out.println("Enter number " + (v + 1) + ":");
            int num = scanner.nextInt();
            searchArray[v] = num;
        }

//printing array elemnt
        System.out.println("You entered the following numbers:");
        for(int i= 0; i<searchArray.length;i++)
        {
            System.out.print(searchArray[i]+" | ");
           
        }

        System.out.println();
//taking search element from user
        System.out.println("enter you search value");
        int search = scanner.nextInt();
        System.out.println("your search number is: "+search);
        scanner.close();

//printing search value postion of search value
        for(int v=0;v<searchArray.length;v++){
            
            if (searchArray[v]==search)
             {
                  
                System.out.println("your search number is present at "+(v+1));
   
            }
         }
            
     }

}
    

