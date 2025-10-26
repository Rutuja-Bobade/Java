public class Reverse_array {
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






// Swap(arr[start], arr[last]) only swaps copies of the values, not the actual array elements. thus the array remains unchanged.
// To swap the elements of array separately by function, we need to pass the arr and two index of elements which we need to swap.

//     public static void reverse(int[] arr ){
//         int start = 0;
//         int last = arr.length-1;
// 
//         while(start < last){
//             if(arr[start] != arr[last]){
//                 Swap(arr[start] , arr[last]);
//             }
//             start++;
//             last--;
//         }
//     }
//     public static void Swap(int x ,int y){
//         int temp = x;
//         x = y;
//         y = temp;
//     }
// }



// Correct Method
// public static void reverse(int[] arr ){
//     int start = 0;
//     int last = arr.length-1;
    
//     while(start < last){
//         if(arr[start] != arr[last]){
//             Swap(arr , start , last);
//         }
//         start++;
//         last--;
//     }
// }

// public static void Swap(int[] arr, int x ,int y){
//     int temp = arr[x];
//     arr[x] = arr[y];
//     arr[y] = temp;
// }