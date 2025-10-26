public class Insertion {
    public static void insert(int array[]){
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            int prev = i-1;
            // finding out correct positoin to insert
            while (prev >= 0 && array[prev]> curr) {
                array[prev+1] = array[prev];
                prev--;
            }
            // insertion
            array[prev+1] = curr;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={2,4,21,56,32,9};
        insert(arr);
    }    
}