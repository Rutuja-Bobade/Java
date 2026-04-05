import java.util.ArrayList;
import java.util.Collections;

public class Rotated_Pair_Sum {
    // My Code
    public static boolean target_sum(int target , ArrayList<Integer> list){
        int index = list.size()-1;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                index = i;
                break;
            }
        }
        
        int right = index;
        int left = index+1;

        // When array is sorted but not rotated
        if(right == list.size()-1){
            left=0;
        }

        // System.err.println("break point = " + index);
        // System.out.println("Largest value index (right index) = " + right);
        // System.out.println("Smallest value index (left index) = " +left);

        while(left != right){
            int sum = list.get(left) + list.get(right);
            if(sum == target){
                System.out.println("index 1 :" + left + "\nindex 2: " + right);
                return true;
            } else if(sum > target){
                if(right == 0){
                    right = list.size()-1;
                }else{
                    right--;
                }
            }else{
                if(left == list.size()-1){
                    left = 0;
                } else{
                    left++;
                }
            }
        }
        return false;
    }


    // Apna College : Modular Arithmetic Function 
    // Modular Arithmetic (x % n) always return value between[0 to n-1] 
    // left rotation :- (x+n-1) % n;
    // right rotation :- (x+1)%n;

    public static boolean Modular(int target , ArrayList<Integer> list){
        int index = -1;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                index = i;
                break;
            }
        }
        
        int right = index;
        int left = index+1;

        if(right == list.size()-1){
            left=0;
        }

        while(left != right){
            int sum = list.get(left) + list.get(right);
            if(sum == target){
                System.out.println("index 1 :" + left + "\nindex 2: " + right);
                return true;
            } else if(sum > target){
                // left rotation
                right = (right+list.size()-1)% list.size(); 
            }else{
                // right rotation
                left = (left+1)% list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,11,15, 6 ,8, 9 ,10);
        // Collections.addAll(list,1 ,2, 3, 4, 5, 6, 7,8);
        int target = 16;

        System.out.println(target_sum(target, list));

        System.out.println();

        System.out.println(Modular(target, list));
    }
}
