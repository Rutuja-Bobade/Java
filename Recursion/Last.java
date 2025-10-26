import java.util.*;

public class Last {
    // My code
    // public static int last_occur(int[] arr ,int key , int index ){
    //     if(index == -1){
    //         return -1;
    //     }
    //     if(arr[index] == key){
    //         return index;
    //     }
    //     return last_occur(arr, key, index-1);
    // }

    // Apna College : Forward recurssion 
    public static int last_occur(int[] arr , int key , int i) {
        if(i == arr.length){
            return -1;
        }

        int isFound = last_occur(arr, key, i+1);
        if(isFound == -1 && arr[i] == key ){
            return i;
        }

        return isFound;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={8,3,6,9,5,10,2,5,3,5};
        int key = sc.nextInt();
        // int index = last_occur(arr , key, arr.length-1);
        int index = last_occur(arr, key, 0);
        System.out.println(index);
        sc.close();
    }
}
