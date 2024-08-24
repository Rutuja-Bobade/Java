public class reverse_array {
    public static void reverse(int array[]){
        int first = 0 ;int last = array.length-1;

        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int arr[] = {2 , 4 , 6 , 8 ,10};

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }    
}