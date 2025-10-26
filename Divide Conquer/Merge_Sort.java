public class Merge_Sort {
    public static void Sort(int[] arr , int start , int end){
        int mid = start + (end - start) / 2;
        if(start >= end){
            return ;
        }
        Sort(arr , start , mid);
        Sort(arr , mid + 1 , end);
        Merger(arr , start , mid , end);
    }

    public static void Merger(int[] arr , int start , int mid , int end){
        int temp[]  = new int[end - start + 1];
        int i = start;
        int j = mid +1;
        int k = 0;

        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;   

            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++; 
        }

        for(k = 0 ; k < temp.length ; k++){
            arr[start + k] = temp[k];
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        Sort(arr , 0 , arr.length -1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }    
}

