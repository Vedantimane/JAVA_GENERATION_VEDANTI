public class copying{
public static void main(String[] args){

    int[] array1 =new int[]{2,3,4,5,6,6};

    int[] copyArray1=new int[array1.length];

    for(int i=0; i<array1.length; i++){
        
        copyArray1[i] =array1[i];

        System.out.println("from copy array: "+copyArray1[i]);
       // System.out.println("orignal array"+array1[i]);

    }

}


    
    

}