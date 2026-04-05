import java.util.ArrayList;

public class Container_Most_Water {
    public static int Maximum_water(ArrayList<Integer> arr){
        // Brute Force
        // Time Complexity - O(n^2);
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.size(); i++) {
        //     for (int j = i+1; j < arr.size(); j++) {
        //         int height = Math.min(arr.get(i) ,arr.get(j));
        //         int water =(j-i)*height;
        //         if(max < water){
        //             max = water;
        //         }
        //     }
        // }
        // return max;

        // Optimal - 2 Pointer approach
        // TIme Complexity = O(n);
        int max = 0;
        int right = arr.size()-1;
        int left = 0;
        while(left < right){
            int height = Math.min(arr.get(left),arr.get(right));
            int water = (right-left)*height;
            if(max < water){
                max = water;
            }
            if(arr.get(left) < arr.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        int max = Maximum_water(height);

        System.out.println(max);
    }
}