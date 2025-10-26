public class Bubble {
    public static void ascending(int array[]){
        for (int i = 0; i <= array.length-2; i++) {
            for (int j = 0; j <= array.length-2-i; j++) {
                if (array[j]>array[j+1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void descending(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+ " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={2,3,5,1,4};
        ascending(arr);
        descending(arr);
    }
}
