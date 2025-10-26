public class Sub_array {
    public static void sub_arrays(int array[]){
        int total = 0;
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j =i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    System.out.print(array[k]+" ");
                }
                total++;
                System.out.println(" Sum = "+sum);
                if (sum > largest) {
                    largest = sum;
                }if (sum < smallest) {
                    smallest = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum = "+largest);
        System.out.println("Min sum = "+smallest);
        System.out.println("Total subarrays= " +total);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        sub_arrays(arr);
    }
}