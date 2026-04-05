import java.util.*;

public class Majority_element {
    // Hashing
    public static int Majority(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) +1 );
        }

        int n = arr.length;
        for (Map.Entry<Integer , Integer> e : freq.entrySet()) {
            if(e.getValue() > n/2){
                return e.getKey();
            } 
        }

        return -1;
    }


    // Moore's Voting Algorithm 
    // public static int Majority(int[] arr){
    //     int count = 0;
    //     int key = 0;

    //     for(int i : arr){
    //         if(count == 0){
    //             key = i;
    //         }
    //         count += (i == key) ? 1 : -1;
    //     }

    //     count =0 ; 
    //     for(int i : arr){
    //         if(i == key){
    //             count++;
    //         }
    //     }

    //     if(count > arr.length/2){
    //         return key;
    //     }

    //     return -1;
    // }
    public static void main(String[] args) {
       int[] arr = {2,2 ,1, 1, 1,2, 2};
       int mojor = Majority(arr);
       System.out.println(mojor);
    }
}
