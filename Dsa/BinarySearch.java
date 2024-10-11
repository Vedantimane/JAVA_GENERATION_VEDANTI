public class BinarySearch {
    public static void main(String[] args) {
        int[] binarySearch = {2, 49, 50, 75, 80, 91, 95};
        int key = 2;
        System.out.println(key);
        int first = 0, last = binarySearch.length - 1;
        
        binary_Serach(binarySearch, key, first, last);
        


    }

    public static void binary_Serach(int binarySearch[], int key, int first, int last){
        while (first<=last) {

        int middle= (first+last)/2;

        if(binarySearch[middle]==key){
            System.out.println(key + " is found at "+(middle+1)+ " position");
            return;
        }
        
            if(binarySearch[middle]<key){
                first=middle+1;

            }
            else if(binarySearch[middle]>key){
                last=middle-1;

            }
                        
        }
        System.out.println(key+ " is not present in the array");
    }
}
