public class freqency {

    public static void main(String[] args){
        int[] array2 = new int[]{1,2,8,3,2,2,2,5,1};
        int[] fr = new int[array2.length];
        int visited = -1;

        for(int i=0; i<array2.length; i++){
            int count =1;
            for(int j=i+1; j<array2.length;j++){
                if(array2[i]==array2[j]){
                    count++;
                fr[j] =visited;
                }
            
        }
                if(fr[i] !=visited){
                    fr[i] =count;
                }
            }
                    System.out.println("-----------------");  
                    System.out.println(" Element | Frequency");  
                    System.out.println("-----------------");  

                    for (int i = 0; i < fr.length; i++) {
                        if (fr[i] != visited) {
                            System.out.println("    " + array2[i] + "    |    " + fr[i]);
                        }
                    }

                }
            
        

    }
    

