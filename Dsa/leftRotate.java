public class leftRotate {
    public static void main(String[] args) {
        int[] array3 = new int[]{1,2,3,4};
        int num= 3;
        System.out.println("Original array");

        for(int i=0; i<array3.length;i++){
            System.out.print(array3[i]+" | ");
        }
        

        for(int i=0; i<num;i++){
            int j, first;
            
             first = array3[0];
            for( j=0; j<array3.length-1;j++){
                array3[j]=array3[j+1];
                
            }
            array3[j]=first;
            System.out.println();
                System.out.println("Array after rotation "+(i+1)+":");
            for(int k=0;k<array3.length;k++){
                System.out.print(array3[k]+" | ");
            }
            

        }
    }
    
}
