// this is an inbuilt function in java .
// the time complexity for the program is O(nlogn)

import java.util.Arrays;
import java.util.Collections;
public class Inbuilt {
    public static void main(String[] args) {
        int arr[] = {2,4,13,5,12,43,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // to sort number of array from particular index
        // Arrays.sort(array_name, starting index , ending index+1)
        // the following array will sort from 0 index till index 4
        int num[] = {21,43,12,76,3,8,39};
        Arrays.sort(num , 0 ,5) ;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();


        // inbuilt sort method willsort the array in ascending order
        // to sort array in descending order we need to use another method
        // Arrays.sort(num, Collections.reverseOrder())
        // Arrays.sort(num,2 , 4 , Collections.reverseorder())
        Integer array[] = {2,45,32,98,23};
        Arrays.sort(array , 2,4,Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();


        Arrays.sort(array,Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}