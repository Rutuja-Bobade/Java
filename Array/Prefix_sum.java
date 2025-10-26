public class Prefix_sum {
    public static void sum_subarray(int array[]){
        int curr_sum;
        int Max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length] ;
        prefix[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i]  =  prefix[i-1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                curr_sum = (i==0)? prefix[j]: prefix[j] - prefix[i-1];
                if(Max_sum < curr_sum){
                    Max_sum = curr_sum;
                }
            }
        }
        
        System.out.println(Max_sum);
    } 
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        sum_subarray(num);
    }
}