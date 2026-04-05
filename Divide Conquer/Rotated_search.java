import java.util.*;

public class Rotated_search {
    public static int search(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = (start + end )/2;

            if(target == arr[mid]){
                return mid;
            } 
            if(arr[start] <= arr[mid]){
                if(arr[start] <= target && target <= arr[mid]){
                    end = mid-1;
                } else{
                    start = mid +1;
                }
            } 
            if(arr[mid] < arr[start]){
                if(arr[mid] <= target && target <= arr[end]){
                    start = mid+1;
                } else{
                    end = mid -1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {3, 4, 5, 6, 7, 0, 1, 2};
        int target = sc.nextInt();
        int idx = search(arr , target , 0 , arr.length-1);
        System.out.println(idx);
        sc.close();
    }
}
