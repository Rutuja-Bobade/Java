public class Kadane_algo {
    public static void Maximum_sum(int array[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
                curr_sum = curr_sum+array[i]; 
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        System.out.println(max_sum);
    }
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,5,1,-3};
        Maximum_sum(num);
    }
}