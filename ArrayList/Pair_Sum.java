import java.util.ArrayList;
import java.util.Collections;

public class Pair_Sum {
    public static ArrayList<Integer> Target_Sum(ArrayList<Integer> arr , int target){
        // Brute Force
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.size(); i++) {
        //     for (int j = i+1; j < arr.size(); j++) {
        //         int sum = arr.get(i) + arr.get(j);
        //         if(sum == target){
        //             Collections.addAll(list, i , j);
        //             return list;
        //         }
        //     }
        // }
        // return list;

        // Optimal Solution - Time Complexity O(n)
        ArrayList<Integer> target_index = new ArrayList<>();
        int left = 0;
        int right = arr.size() -1;

        while(left < right){
            int sum = arr.get(left)+arr.get(right);
            if(target == sum){
                target_index.add(left);
                target_index.add(right);
                return target_index;
            } else if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        return target_index;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= 6 ; i++){
            list.add(i);
        }
  
        int target = 5;

        System.out.println(Target_Sum(list, target));
    }    
}
