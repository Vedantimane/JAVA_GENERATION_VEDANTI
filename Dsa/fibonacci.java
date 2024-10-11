

public class fibonacci{

    public static void main(String[] args)
    {
        int num1=0;
        int num2=1;
        int count=10;
        fibonacciSerie(num1, num2, count);


    }

    public static void fibonacciSerie(int num1, int num2, int count){
        int[] array1 = new int[count];

        for(int i=0; i<count; i++){
            array1[i] = num1;
            int num3 = num1+num2;
           
            num1=num2;
            num2=num3;

            
        }
        for(int i=0; i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }
}