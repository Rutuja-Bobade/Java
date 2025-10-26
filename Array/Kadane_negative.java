public class Kadane_negative {
    public static void Maximum_sum(int array[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        boolean res = true;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                res = false;
            }
        }
        
        if(res){
            for(int i =0 ; i < array.length ; i++){
                if(array[i] > max_sum){
                    max_sum = array[i];
                }
            }
        }
        else{
            for (int i =0 ;i < array.length ;i++){
                curr_sum = curr_sum +array[i];
                if(curr_sum < 0){
                    curr_sum = 0;
                }
                max_sum = Math.max(curr_sum , max_sum);
            }
        }        
        System.out.println(max_sum);
    }
    public static void main(String args[]){
        int[] num = {-2,-3,-9,-1,-2,-3};
        Maximum_sum(num);
    }
}