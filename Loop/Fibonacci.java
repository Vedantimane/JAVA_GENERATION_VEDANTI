class Fibonacci {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int count=10;
    }

    public static void FibonaaciSerie(int num1, int num2, int count){
        
        int i=0;

        while(i<=count){
            int array1 = new int[count];
            array1[i] = num1;
            int num3=num1+num2;
            num1=num2;
            num2=num3;

        }
    }
    
}
