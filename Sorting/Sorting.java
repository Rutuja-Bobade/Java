// bubble and swap count

public class Sorting {
    public static void main(String args[]){
        int arr[] ={7,6,5,4,3,2};
        int[] sorted = sort(arr);
        
        for(int i = 0 ; i < sorted.length ; i++){
            System.out.print(sorted[i]+" ");
        }
    }
    
    public static int[] sort(int array[]){
        for(int i = 0 ; i < array.length-1 ; i++){
            int swaps = 0;
            for(int j = 0 ; j < array.length-1-i; j++){
                if(array[j] >  array[j+1]){
                    swaps ++;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (swaps == 0 ){
                return array;
            }
        }
        return array;
    }
}
