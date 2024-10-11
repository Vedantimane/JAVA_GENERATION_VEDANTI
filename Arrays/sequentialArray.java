package Arrays;

public class sequentialArray {
    public static void main(String[] args) {
       
        int[] array = new int[10];
        
        int num = 6000;

        for (int i = 0; i < array.length; i++) {
            array[i] = num + i;
            System.out.println(array[i]); 
        }

    
    }
}

