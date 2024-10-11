public class duplicate {
    public static void main(String[] args) {
        int[] array4 = new int[]{1,2,3,4,2,7,8,8,3};
        System.out.println("Duplicate elements in given array");
        for(int i=0; i<array4.length;i++){
            for(int j=i+1; j<array4.length;j++){
                if(array4[i]==array4[j]){
                    System.out.println(array4[j]);
                }
            }
        }
    }
}
