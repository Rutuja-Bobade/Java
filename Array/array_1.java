import java.util.HashSet;

public class array_1 {
    public static boolean repeat(int array[]){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1 ; j <array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }    
        }
        return false ;
    }

    // more efficient method
    public static boolean repeated(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) { 
            if(set.contains(nums[i])) { 
                return true; 
            } else { 
                set.add(nums[i]); 
            } 
        } return false;
    }

    public static void main(String args[]){
        int num1[] = {1, 2, 3, 1};
        System.out.println(repeated(num1));
        int num2[] = {1, 2, 3, 4};
        System.out.println(repeated(num2));
        int num3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(repeated(num3));
    }
}