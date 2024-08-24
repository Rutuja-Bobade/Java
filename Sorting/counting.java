public class counting {
    public static void sort(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length ; i++){
            largest = Math.max(largest, array[i]); 
        }
    }
    public static void main(String args[]){
        int array[] = {5,7,2,4,2,5,1};
        sort(array);
    }
}